package dynamic_programing;

import java.util.Scanner;

public class Bj_1463_2 {
	static int[] dp;

	static int compare(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		dp = new int[N * 3];

		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i < N * 3; i++)
			dp[i] = i;

		for (int i = 1; i <= N; i++) {
			dp[i + 1] = compare(dp[i] + 1, dp[i + 1]);
			if (i * 2 <= N)
				dp[i * 2] = compare(dp[i * 2], dp[i] + 1);
			if (i * 3 <= N)
				dp[i * 3] = compare(dp[i * 3], dp[i] + 1);
		}

		System.out.println(dp[N]);
	}

}
