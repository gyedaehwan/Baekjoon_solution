package backjoon_summer;
/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Bj_200723 {
	static int Answer;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			Answer = 0;

			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				int num = sc.nextInt();
				Answer ^= num;
			}

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}