/**
 *  # 1182 부분수열의 합
 *  # 난이도 ㅇㅇㅇㅇ
 *  
 *  재귀함수를 생각해내야함
 *  
 * 
 */

package backjoon_summer;

import java.util.Scanner;

public class Bj_1182 {
	static int[] arr;
	static int N;
	static int S;
	static int result;
	static int sum;

	static void solve(int idx) {
		sum += arr[idx];

		if (sum == S)
			result++;

		else if (idx + 1 == N) {
			sum -= arr[idx];

			return;
		}

		for (int j = 1; j < N; j++) {

			if (idx + j == N) {

				sum -= arr[idx];

				return;
			}

			solve(idx + j);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();

		arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < N; i++) {

			solve(i);
			sum = 0;
			// System.out.println("=========================");
		}

		System.out.println(result);

	}

}
