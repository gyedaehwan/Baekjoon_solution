package backjoon_summer;

import java.util.Scanner;

public class Bj_1018 {
	static int row;
	static int col;
	static char[][] board;

	static int count(int i, int j) {
		char[][] new_board = new char[8][8];
		int count = 0;
		for (int a = i, k = 0; k < 8; a++, k++) {
			for (int b = j, l = 0; l < 8; b++, l++) {
				new_board[k][l] = board[a][b];
			}
		}

		for (int a = 0; a < 8; a++) {
			// 바로 위 확인
			if (a > 0)
				if (new_board[a][0] == new_board[a - 1][0]) {
					if (new_board[a][0] == 'W') {
						new_board[a][0] = 'B';
						// System.out.println("===changed : W -> B ===");
						count++;
					} else {
						new_board[a][0] = 'W';
						// System.out.println("===changed : B -> W ===");
						count++;
					}
				}

			for (int b = 0; b < 8; b++) {

				if (b < 7)
					// 바로 옆 확인
					if (new_board[a][b] == new_board[a][b + 1]) {
						if (new_board[a][b + 1] == 'W') {
							new_board[a][b + 1] = 'B';
							// System.out.println("===changed : W -> B ===");
							count++;
						} else {
							new_board[a][b + 1] = 'W';
							// System.out.println("===changed : B -> W ===");
							count++;
						}
					}

			}

		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		// 가로
		row = sc.nextInt();

		// 세로
		col = sc.nextInt();

		// 주어진 보드판
		board = new char[row][col];

		// 공백 매꾸기
		sc.nextLine();

		// 보드판 채우기
		for (int i = 0; i < row; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < col; j++)
				board[i][j] = line.charAt(j);
		}

		for (int i = 0; i < row - 7; i++) {
			for (int j = 0; j < col - 7; j++) {
				if (i == 0 && j == 0)
					result = count(i, j);
				else {
					int tmp = count(i, j);

					if (tmp < result)
						result = tmp;
				}
			}
		}

		System.out.println(result);

	}

}
