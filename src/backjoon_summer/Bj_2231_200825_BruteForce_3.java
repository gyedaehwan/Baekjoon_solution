/**
 * 백준 2231 분해합
 * 난이도 ㅇㅇㅇ
 * 범위만 적절히 찾아 내면 쉬운문제
 */
package backjoon_summer;

import java.util.Scanner;

public class Bj_2231_200825_BruteForce_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// cons , 생성자의 범위 구하기
		int digit = (int) (Math.log10(N) + 1);

		// N - 9*digit <= cons < N-1
		int cons;
		int result = 0;
		boolean check = true;

		if (N - 9 * digit >= 0 && N - 1 > 0) {
			for (int i = (N - 9 * digit); i < N; i++) {
				if (check) {
					cons = i;
					result = cons;
					int cons_digit = (int) (Math.log10(cons) + 1);
					int diff = N - cons;

					for (int j = cons_digit - 1; j >= 0; j--) {

						diff -= (cons / (int) Math.pow(10, j));
						cons = cons % (int) Math.pow(10, j);

						if (j == 0)
							if (diff != 0)
								result = 0;
							else {
								check = false;
								break;
							}

					}
				}
			}
		}
		System.out.println(result);

	}

}
