// 백준 1912 연속합
// 난이도  ㅇㅇㅇㅇ
// 생각보다 간단한데 자꾸 어렵게 생각하게됨.

package backjoon_summer;

import java.util.Scanner;

class Bj_1912_200824_BruteForce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++)
			array[i] = sc.nextInt();

		int result = array[0];
		int MAX = 0;

		for (int i = 0; i < size; i++) {

			if (array[i] < 0) {
				if (MAX + array[i] < 0) {
					MAX = 0;
					if (result < array[i])
						result = array[i];

					continue;
				}
			}

			MAX += array[i];

			if (result < MAX)
				result = MAX;

		}

		System.out.println(result);
	}
}