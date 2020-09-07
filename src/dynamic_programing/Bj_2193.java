/**
 *  # 2193 ��ģ��
 *  # ���̵� ��
 *  
 *  �Ǻ���ġó�� �ϸ� ��
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

		// dp�� �ϳ��� �־������
		for (int i = 3; i < digit + 1; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		// ��� ���
		System.out.println(dp[digit]);
	}

}
