package backjoon_summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bj_200721 {
	static int MAX = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		Map<Integer, ArrayList<String>> map = new HashMap<>();

		for (int i = 0; i < num; i++) {
			String input = br.readLine();
			if (MAX < input.length())
				MAX = input.length();
			ArrayList<String> tmp = new ArrayList<>();
			try {
				tmp = map.get(input.length());
			} catch (NullPointerException e) {
				tmp = new ArrayList<>();
				tmp.add(input);
				map.put(input.length(), tmp);
				continue;
			}
			// 없다면
			if (map.get(input.length()).indexOf(input) == -1) {
				tmp.add(input);
				map.put(input.length(), tmp);
			}
			// 있다면 무시
			else {
			}
		}

		for (int i = 1; i <= MAX; i++) {
			try {
				Collections.sort(map.get(i));
			} catch (NullPointerException e) {
				continue;
			}
		}

		for (int i = 1; i <= MAX; i++) {
			for (int j = 0; j < map.get(i).size(); j++)
				System.out.println(map.get(i).get(j));
		}
	}
}

/**
 * for (int j = i; j > 0; j--) { if (Integer.compare(input.length(), map.get(j -
 * 1).length()) < 0) { map.put(j, map.get(j - 1)); map.put(j - 1, input); }
 * 
 * else if (Integer.compare(input.length(), map.get(j - 1).length()) > 0) { if
 * (map.get(j) == null) map.put(j, input); }
 * 
 * // 둘의 길이가 같은경우 else { // 앞선 사전순 인경우 if (input.compareTo(map.get(j - 1)) < 0)
 * { map.put(j, map.get(j - 1)); map.put(j - 1, input); } else if
 * (input.compareTo(map.get(j - 1)) > 0) { if (map.get(j) == null) { map.put(j,
 * input); } } else ;
 * 
 * }
 * 
 * } }
 * 
 * for (int i = 1; i < num; i++) { if (map.get(i - 1).equals(map.get(i)))
 * continue; else System.out.println(map.get(i - 1)); if (map.get(i + 1) ==
 * null) System.out.println(map.get(i)); } } }
 **/
