/**
 *  # 10448
 *  # 유레카이론 (삼각수 문제)
 *  
 *  # 역시나 시간복잡도에 얽매이지 말고 3중 for문 사용가능
 *  # 매번 for문 끝나고 계속 사용되는 변수있으면 다시원래 값으로 돌려놓기
 *     이 문제에서는 remainder !!
 */

package backjoon_summer;

import java.util.Scanner;

class Bj_10448 {

	static int calc(int i) {
		return ((i * (i + 1)) / 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] result = new int[T];

		for (int a = 0; a < T; a++) {
			int N = sc.nextInt();
			result[a] = 0;
			int remainder = N;

			for (int i = 1; i <= N / 2; i++) {
				remainder -= calc(i);

				for (int j = 1; j <= N / 2; j++) {
					remainder -= calc(j);

					if (remainder > 0)
						for (int k = 1; k <= N / 2; k++) {

							if ((remainder - calc(k)) <= 0) {
								if ((remainder - calc(k)) == 0) {

									result[a] = 1;
								}
								break;
							}

						}

					if (result[a] == 1)
						break;
					else
						remainder += calc(j);
				}

				if (result[a] == 1) {
					break;
				} else
					remainder = N;
			}

		}

		for (int i = 0; i < T; i++)
			System.out.println(result[i]);
	}
}