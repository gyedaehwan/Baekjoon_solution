package backjoon_summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj_200722 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫째 줄에 단어의 개수 N개를 받아드림
		int n = Integer.parseInt(br.readLine());
		if (n >= 1 && n <= 20000) {

			// n개의 문자열 입력받음
			// 1. 입력받음과 동시에 정렬
			// 2. 입력을 받은 후에 정렬

			Map<Integer, String> map = new HashMap<>();
			map.put(0, br.readLine());

			for (int i = 1; i < n; i++) {
				String input = br.readLine();

				// 문자열 길이 비교
				for (int k = i; k > 0; k--) {

					if (map.get(k - 1) == null)
						break;
					// input 을 가장 key값이 큰 map과 비교, 길이가 작으면 앞에것과 비교
					// 작으면 둘의 value을 바꿔줌
					if (input.length() < map.get(k - 1).length()) {
						map.put(k, map.get(k - 1));
						if (k - 1 == 0)
							map.put(k - 1, input);
					}

					// 같다면 사전순 비교
					else if (input.length() == map.get(k - 1).length()) {
						// 사전 순이 같으면 map에 넣지않음
						if (input.compareTo(map.get(k - 1)) == 0) {
							for (int j = k; map.get(j + 1) != null; j++) {
								map.put(j, map.get(j + 1));
							}
							break;
						}
						// 사전 순 > 0 더큰 사전순
						else if (input.compareTo(map.get(k - 1)) > 0) {
							map.put(k, input);
							break;
						}

						// 사전 순 < 0 앞선 사전순
						else
							map.put(k, map.get(k - 1));

					}

					else {
						map.put(k, input);
						break;
					}

				}

			}

		}

	}

}