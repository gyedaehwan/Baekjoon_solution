package backjoon_summer;

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Bj_2007301 {
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

			int[] score_line = new int[5];

			for (int i = 0; i < score_line.length; i++)
				score_line[i] = sc.nextInt();

			int count = sc.nextInt();
			int[] score = new int[count];

			for (int i = 0; i < score.length; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

				int score_range = 0;

				double theta = Math.atan(y / (double) x);

				theta *= (180 / Math.PI);

				if (x < 0)
					theta += 180;
				theta += 9;
				theta = (theta + 360) % 360;
				score_range = (int) (theta / 18);

				if (r < score_line[0])
					score[i] = 50;
				else if ((r > score_line[0] && r < score_line[1]) || (r > score_line[2] && r < score_line[3]))
					score[i] = score_range;
				else if ((r > score_line[3] && r < score_line[4]))
					score[i] = score_range * 2;
				else if ((r > score_line[1] && r < score_line[2]))
					score[i] = score_range * 3;
				else
					score[i] = 0;

				Answer += score[i];
			}

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}