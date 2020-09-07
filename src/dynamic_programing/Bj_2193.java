/**
 *  # 2193 이친수
 *  # 난이도 ㅇ
 *  
 *  피보나치처럼 하면 됨
 * 
 */

package dynamic_programing;

import java.util.Scanner;

public class Bj_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();

		Long[] dp = new Long[digit + 2];

		dp[1] = (long) 1;
		dp[2] = (long) 1;

		// dp에 하나씩 넣어줘야함
		for (int i = 3; i < digit + 1; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		// 결과 출력
		System.out.println(dp[digit]);
	}

}
