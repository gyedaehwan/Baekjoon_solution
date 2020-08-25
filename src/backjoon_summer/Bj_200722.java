package backjoon_summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj_200722 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ù° �ٿ� �ܾ��� ���� N���� �޾Ƶ帲
		int n = Integer.parseInt(br.readLine());
		if (n >= 1 && n <= 20000) {

			// n���� ���ڿ� �Է¹���
			// 1. �Է¹����� ���ÿ� ����
			// 2. �Է��� ���� �Ŀ� ����

			Map<Integer, String> map = new HashMap<>();
			map.put(0, br.readLine());

			for (int i = 1; i < n; i++) {
				String input = br.readLine();

				// ���ڿ� ���� ��
				for (int k = i; k > 0; k--) {

					if (map.get(k - 1) == null)
						break;
					// input �� ���� key���� ū map�� ��, ���̰� ������ �տ��Ͱ� ��
					// ������ ���� value�� �ٲ���
					if (input.length() < map.get(k - 1).length()) {
						map.put(k, map.get(k - 1));
						if (k - 1 == 0)
							map.put(k - 1, input);
					}

					// ���ٸ� ������ ��
					else if (input.length() == map.get(k - 1).length()) {
						// ���� ���� ������ map�� ��������
						if (input.compareTo(map.get(k - 1)) == 0) {
							for (int j = k; map.get(j + 1) != null; j++) {
								map.put(j, map.get(j + 1));
							}
							break;
						}
						// ���� �� > 0 ��ū ������
						else if (input.compareTo(map.get(k - 1)) > 0) {
							map.put(k, input);
							break;
						}

						// ���� �� < 0 �ռ� ������
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