/**
 *  # 벚꽃이 정보섬에 피어난 이유
 *  # 난이도 ㅇㅇ
 *  
 *  구현 틀만 잘짜면 쉽게 풀수있음
 */

package backjoon_summer;

import java.util.Scanner;

public class Bj_17127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int[] digit = new int[4];
		int max = 0;

		int tmp = N;

		for (int i = 0; i < N; i++)
			input[i] = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			// System.out.println("i: " + i + "--------------");
			tmp -= i;
			if (tmp > 0)
				for (int j = 1; j <= N; j++) {
					// System.out.println(" j: " + j);
					tmp -= j;

					if (tmp > 0)
						for (int k = 1; k <= N; k++) {
							tmp -= k;
							// System.out.println(" k: " + k);
							if (tmp > 0 && (i + j + k + tmp) == N) {
								digit[0] = i;
								digit[1] = j;
								digit[2] = k;
								digit[3] = tmp;

								// System.out.println(" 4: " + tmp);
								tmp = 0;

								int up = 0;
								for (int idx = 0; idx < N;) {

									int tmp_2 = 1;

									if (up < 4) {
										for (int l = 0; l < digit[up]; l++) {
											tmp_2 *= input[idx++];
										}
										tmp += tmp_2;
									} else
										break;
									up++;
								}

								// System.out.println("tmp : " + tmp);
								if (tmp > max)
									max = tmp;

							}

							else
								break;

							tmp = digit[2] + digit[3];

						}

					else
						break;

					tmp = digit[1] + digit[2] + digit[3];

				}

			tmp = N;

		}

		System.out.println(max);

	}

}
