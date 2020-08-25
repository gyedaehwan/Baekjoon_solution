/**
 *  # 200825
 *  # 사탕게임
 *  # 난이도 ㅇㅇㅇㅇㅇ
 *  
 *  1. 시간복잡도에 휘말리면 안됨
 *  2. 2중 for문에서 for문을 하나돌았을때 값을 초기화시켜주는것고
 *     양옆 값이 같지 않았을때 초기화 시켜줘야함
 *     ( tmp 얘기하는거임 )
 *  3. 복잡하게 생각하면안됨
 */

package backjoon_summer;

import java.util.Scanner;

public class Bj_3085 {
	static int N;
	static char[][] candies;
	static int max;

	static void check() {
		// 가로 계산
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

		// 세로계산
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

		// 양옆 바꾸기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				char tmp = candies[i][j];
				// 가로 교체
				candies[i][j] = candies[i][j + 1];
				candies[i][j + 1] = tmp;

				check();

				candies[i][j + 1] = candies[i][j];
				candies[i][j] = tmp;
			}
		}

		// 위아래 바꾸기
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N - 1; i++) {
				char tmp = candies[i][j];

				// 세로 교체
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
