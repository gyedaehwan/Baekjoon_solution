/**
 * 백준 2309 난쟁이 키합
 * 난이도 ㅇㅇ
 * 시간복잡도에 구애받으면 안됨
 */
package backjoon_summer;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_2309_200824_BruteForce_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];

		int sum = 0;
		for (int i = 0; i < 9; i++) {
			height[i] = sc.nextInt();
			sum += height[i];
		}

		int diff = sum - 100;
		boolean check = false;

		for (int i = 0; i < 9; i++) {
			if (!check)
				for (int j = 0; j < 9; j++) {
					if (i == j)
						continue;
					else {
						if (height[i] + height[j] == diff) {
							height[i] = 0;
							height[j] = 0;
							check = true;
							break;
						}

					}
				}
		}

		Arrays.sort(height);
		for (int i = 2; i < 9; i++)
			System.out.println(height[i]);

	}

}