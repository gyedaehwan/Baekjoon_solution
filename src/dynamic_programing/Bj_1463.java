/**
 * 	# 200830
 *  # 1463 , 1로 만들기
 *  # 난이도 ㅇㅇㅇㅇ
 *  
 *  arraylist를 사용하여 모든 값에 대해 답을 구해놓은후
 *  출력함
 *  => 메모리, 성능 은 좋지않지만 문제는 해결됨
 *  
 *  다른 문제 해결방법 찾아봐야함
 * 
 */
package dynamic_programing;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj_1463 {
	static ArrayList<Integer> num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		num = new ArrayList<>();
		num.add(0);
		num.add(0);
		for (int i = 0; i < 2; i++)
			num.add(1);

		for (int i = 4; i <= N; i++) {

			int tmp = 0;

			for (int k = 1; k < 4; k++) {

				if (i % k == 0) {
					if (k == 1)
						tmp = 1 + num.get(i - 1);

					else if (tmp > 1 + num.get(i / k))
						tmp = 1 + num.get(i / k);

				}
			}
			num.add(tmp);

		}

		System.out.println(num.get(N));
	}

}
