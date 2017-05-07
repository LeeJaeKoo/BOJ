package BackJoon;

import java.util.Scanner;

public class P2193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		long[][] dp = new long[input + 1][2];
		//처음 시작은 1부터 -> [1][0] = 0 [1][1] = 1 즉, 1입력시 ->1 = 1 2입력시 -> 1 = 10
		dp[1][0] = 0;
		dp[1][1] = 1;

		for (int i = 2; i <= input; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
			dp[i][1] = dp[i - 1][0];
		}
		sc.close();
		System.out.println(dp[input][0] + dp[input][1]);
	}
}
