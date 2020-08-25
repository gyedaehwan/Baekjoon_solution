package backjoon_summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj_200724_linkedList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// linked list 생성
		LinkedList linkedlist = new LinkedList();

		while (true) {
			System.out.print("COMMAND : ");
			String command = br.readLine();

			if (command.charAt(0) == 'p')
				linkedlist.push(br.readLine());

			else if (command.charAt(0) == 'g') {
				System.out.print("What list do you want ? ");
				int num = Integer.parseInt(br.readLine());
				try {
					System.out.println(num + " list is " + linkedlist.get(num));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Index out of Bounds!");
					continue;
				}
			}

			else if (command.charAt(0) == 's')
				System.out.println("full size : " + linkedlist.size());

			else if (command.charAt(1) == 'o') {
				System.out.print("What word do you find ? ");
				String word = br.readLine();
				if (linkedlist.count(word) < 0)
					System.out.println("There is no '" + word + "' in this linkedlist.");
				else
					System.out.println(word + " 's count is " + linkedlist.count(word));

			}

			else if (command.charAt(1) == 'l')
				linkedlist.clear();

			else {
				System.out.println("Exit..");
				break;
			}
		}

	}

}

class LinkedList {
	List<String> list = new ArrayList<>();

	// PUSH
	void push(String value) {
		list.add(value);
	}

	// GET
	String get(int count) {
		return list.get(count);
	}

	// SIZE
	int size() {
		return list.size();
	}

	// COUNT
	int count(String word) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(word))
				return i;
			else
				;
		}
		// 값이 없을때
		return -1;
	}

	// CLEAR
	void clear() {
		list.clear();
	}
}