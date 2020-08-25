package backjoon_summer;

import java.util.Arrays;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Bj_200727 {
	static int Answer;

	public static void main(String args[]) throws Exception {
		/*
		 * The method below means that the program will read from input.txt, instead of
		 * standard(keyboard) input. To test your program, you may save input data in
		 * input.txt file, and call below method to read from the file when using
		 * nextInt() method. You may remove the comment symbols(//) in the below
		 * statement and use it. But before submission, you must remove the freopen
		 * function or rewrite comment symbols(//).
		 */

		/*
		 * Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] input = new int[N];

			for (int i = 0; i < N; i++)
				input[i] = sc.nextInt();

			// ��������
			Arrays.sort(input);

			for (int i = N - 1; i > N - K - 1; i--)
				Answer += input[i];

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}