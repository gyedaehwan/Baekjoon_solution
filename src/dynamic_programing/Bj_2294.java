/**
 *  # 2294 코인 
 *  # 난이도 ㅇㅇㅇㅇㅇ
 * 
 *  # 
 */
package dynamic_programing;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_2294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int finish = sc.nextInt();

		int[] dp = new int[100001];
		int[] coin = new int[count + 1];

		for (int i = 1; i <= count; i++)
			coin[i] = sc.nextInt();

		Arrays.sort(coin);

		for (int i = 0; i <= finish; i++) {
			dp[i] = -1;
		}

		for (int i = 1; i <= count; i++) {
			dp[coin[i]] = 1;
			for (int j = 1; j * coin[i] <= finish; j++) {
				dp[j * coin[i]] = dp[coin[i]] * j;
				if (coin[i] == 0)
					break;
			}
		}

		for (int i = 1; i <= finish; i++) {
			int tmp = i;

			for (int k = count; k > 0; k--) {
				if (i <= coin[k])
					continue;

				tmp -= coin[k];

				if (dp[tmp] != -1) {

					if (dp[i] < 0)
						dp[i] = (dp[tmp] + dp[coin[k]]);

					else if ((dp[tmp] + dp[coin[k]]) <= dp[i])
						dp[i] = (dp[tmp] + dp[coin[k]]);

					break;
				}

				else
					tmp += coin[k];
			}
		}

		for (int i = 1; i <= finish; i++) {
			System.out.println("i: " + i + " : dp : " + dp[i]);
		}

		System.out.println(dp[finish]);

	}

}
