/**
 *   # 9465 스티커 문제
 *   # 난이도 ㅇㅇㅇㅇㅇ
 *   
 *   # 구조를 잘 파악해라
 */

package dynamic_programing;

import java.util.Scanner;

public class Bj_9465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] result = new int[T];

		for (int testcase = 0; testcase < T; testcase++) {

			int col = sc.nextInt();

			int[][] input = new int[2][col];

			for (int i = 0; i < 2; i++)
				for (int j = 0; j < col; j++)
					input[i][j] = sc.nextInt();

			int[] biggest = new int[col + 1];

			biggest[0] = 0;

			for (int i = 0; i < col; i++) {

				if (i > 0) {
					if (biggest[i - 1] > input[1][i - 1])
						input[0][i] += biggest[i - 1];
					else
						input[0][i] += input[1][i - 1];

					if (biggest[i - 1] > input[0][i - 1])
						input[1][i] += biggest[i - 1];
					else
						input[1][i] += input[0][i - 1];

				}

				if (input[0][i] > input[1][i])
					biggest[i + 1] = input[0][i];
				else
					biggest[i + 1] = input[1][i];

			}

			result[testcase] = biggest[col];
		}

		for (int i = 0; i < T; i++)
			System.out.println(result[i]);
	}
}