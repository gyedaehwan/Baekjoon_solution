/**
 *  # 200825
 *  # ��������
 *  # ���̵� ����������
 *  
 *  1. �ð����⵵�� �ָ����� �ȵ�
 *  2. 2�� for������ for���� �ϳ��������� ���� �ʱ�ȭ�����ִ°Ͱ�
 *     �翷 ���� ���� �ʾ����� �ʱ�ȭ ���������
 *     ( tmp ����ϴ°��� )
 *  3. �����ϰ� �����ϸ�ȵ�
 */

package backjoon_summer;

import java.util.Scanner;

public class Bj_3085 {
	static int N;
	static char[][] candies;
	static int max;

	static void check() {
		// ���� ���
		for (int i = 0; i < N; i++) {
			int tmp = 1;
			for (int j = 0; j < N - 1; j++) {

				if (candies[i][j] == candies[i][j + 1])
					tmp++;
				else
					tmp = 1;

				if (max < tmp)
					max = tmp;

			}
		}

		// ���ΰ��
		for (int j = 0; j < N; j++) {
			int tmp = 1;
			for (int i = 0; i < N - 1; i++) {

				if (candies[i][j] == candies[i + 1][j])
					tmp++;
				else
					tmp = 1;
				if (max < tmp)
					max = tmp;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		candies = new char[N][];
		max = 1;

		for (int i = 0; i < N; i++) {
			candies[i] = new char[N];
			String line = sc.nextLine();

			for (int j = 0; j < N; j++) {
				candies[i][j] = line.charAt(j);
			}
		}

		// �翷 �ٲٱ�
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				char tmp = candies[i][j];
				// ���� ��ü
				candies[i][j] = candies[i][j + 1];
				candies[i][j + 1] = tmp;

				check();

				candies[i][j + 1] = candies[i][j];
				candies[i][j] = tmp;
			}
		}

		// ���Ʒ� �ٲٱ�
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N - 1; i++) {
				char tmp = candies[i][j];

				// ���� ��ü
				candies[i][j] = candies[i + 1][j];
				candies[i + 1][j] = tmp;

				check();

				candies[i + 1][j] = candies[i][j];
				candies[i][j] = tmp;
			}
		}

		System.out.println(max);

	}

}
