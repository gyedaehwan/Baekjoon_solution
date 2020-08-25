// 백준 14502 연구소
package backjoon_summer;

import java.util.Scanner;

public class Bj_200815 {
	static int[][] lab;
	static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		lab = new int[N][M];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				lab[i][j] = sc.nextInt();

		/**
		 * test for (int i = 0; i < N; i++) { for (int j = 0; j < M; j++)
		 * System.out.print(lab[i][j] + " "); System.out.println(); }
		 **/
	}

}
