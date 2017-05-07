package BackJoon;

import java.util.Scanner;

public class P2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] dp = new int[n + 1][2];

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		dp[0][0] = dp[0][1] = 0;
		dp[1][0] = dp[1][1] = a[0];
		for (int i = 2; i <= n; i++) {
			dp[i][0] = dp[i - 1][1] + a[i - 1];
			dp[i][1] = Math.max(dp[i - 2][0], dp[i - 2][1]) + a[i - 1];
		}

		System.out.println(Math.max(dp[n][0],dp[n][1]));
	}

}
