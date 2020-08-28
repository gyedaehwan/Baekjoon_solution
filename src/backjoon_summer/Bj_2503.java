/**
 * # 2502 번 
 * # 숫자야구
 * # 난이도 ㅇㅇㅇ
 * 
 * 브루트포스 그대로 적용하면됨
 * 구현이 좀 복잡하지만 어렵지않음
 * 
 */
package backjoon_summer;

import java.util.Scanner;

public class Bj_2503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		// 생각하는 수 개수
		int N = sc.nextInt();

		// 생각하는 수 담기
		int[] think = new int[N];
		int[] think_strike = new int[N];
		int[] think_ball = new int[N];

		for (int i = 0; i < N; i++) {
			think[i] = sc.nextInt();
			think_strike[i] = sc.nextInt();
			think_ball[i] = sc.nextInt();
		}

		// 자리에 0 이 들어간 모든 숫자 제외
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

			// 유효한 숫자들만 계산 ( 0 이 없는 숫자들, 각 자리가 다른 숫자들)
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
