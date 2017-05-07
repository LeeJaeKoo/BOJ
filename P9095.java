package BackJoon;

import java.util.Scanner;

public class P9095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int TEST_CASE = sc.nextInt();

		int[] Result = new int[TEST_CASE];

		for (int j = 0; j < TEST_CASE; j++) {

			int input = sc.nextInt();

			int[] dp = new int[input + 1];

			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;

			for (int i = 4; i <= input; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
				Result[j] = dp[i];
			}
		}
		sc.close();
		for (int a : Result) {
			System.out.println(a);
		}
	}
}
