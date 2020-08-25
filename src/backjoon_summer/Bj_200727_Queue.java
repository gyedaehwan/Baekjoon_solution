package backjoon_summer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bj_200727_Queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> q = new LinkedList<>();
		String input;

		while (true) {
			System.out.print("ipnut : ");
			input = sc.nextLine();

			// SIZE
			if (input.charAt(0) == 's')
				System.out.println("size : " + q.size());

			// ENQUEUE
			else if (input.charAt(0) == 'e') {
				q.add(sc.nextLine());
			}

			// DELETE
			else if (input.charAt(0) == 'd') {
				q.remove();
			}

			// FRONT
			else if (input.charAt(0) == 'f') {
				System.out.println(q.peek());
			} else
				break;

		}

	}

}
