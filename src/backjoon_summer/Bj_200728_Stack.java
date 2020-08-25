package backjoon_summer;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Bj_200728_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<>();

		while (true) {
			System.out.print("input : ");
			String input = sc.nextLine();

			if (input.charAt(0) == 's')
				System.out.println("size : " + stack.size());

			else if (input.charAt(0) == 't') {
				try {
					System.out.println("top : " + stack.peek());
				} catch (EmptyStackException e) {
					System.out.println("empty");
				}
			} else if (input.charAt(1) == 'u') {
				String element = sc.nextLine();
				stack.push(element);
			} else if (input.charAt(1) == 'o')
				stack.pop();
			else
				break;

		}
	}

}
