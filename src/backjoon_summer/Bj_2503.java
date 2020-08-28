/**
 * # 2502 �� 
 * # ���ھ߱�
 * # ���̵� ������
 * 
 * ���Ʈ���� �״�� �����ϸ��
 * ������ �� ���������� ���������
 * 
 */
package backjoon_summer;

import java.util.Scanner;

public class Bj_2503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		// �����ϴ� �� ����
		int N = sc.nextInt();

		// �����ϴ� �� ���
		int[] think = new int[N];
		int[] think_strike = new int[N];
		int[] think_ball = new int[N];

		for (int i = 0; i < N; i++) {
			think[i] = sc.nextInt();
			think_strike[i] = sc.nextInt();
			think_ball[i] = sc.nextInt();
		}

		// �ڸ��� 0 �� �� ��� ���� ����
		int[] arr = new int[1000];
		for (int i = 0; i < 1000; i++) {
			if (i < 111)
				arr[i] = 0;

			else if (Integer.toString(i).charAt(1) == '0' || Integer.toString(i).charAt(2) == '0')
				arr[i] = 0;

			else if (Integer.toString(i).charAt(0) == Integer.toString(i).charAt(1)
					|| Integer.toString(i).charAt(0) == Integer.toString(i).charAt(2)
					|| Integer.toString(i).charAt(1) == Integer.toString(i).charAt(2))
				arr[i] = 0;

			else
				arr[i] = i;
		}

		for (int j = 111; j < 1000; j++) {

			// ��ȿ�� ���ڵ鸸 ��� ( 0 �� ���� ���ڵ�, �� �ڸ��� �ٸ� ���ڵ�)
			if (arr[j] != 0) {
				String example = Integer.toString(arr[j]);
				int success = 0;

				for (int i = 0; i < N; i++) {
					String toCompare = Integer.toString(think[i]);
					int strike_compare = think_strike[i];
					int ball_compare = think_ball[i];
					int strike = 0;
					int ball = 0;

					for (int k = 0; k < 3; k++) {
						// STRIKE
						if (toCompare.charAt(k) == example.charAt(k)) {
							strike++;
						}

						else if (toCompare.contains(Character.toString(example.charAt(k)))) {
							ball++;
						}
					}

					if (strike == strike_compare && ball == ball_compare)
						success++;

					else
						break;

				}
				if (success == N)
					result++;
			}

		}

		System.out.println(result);

	}
}
