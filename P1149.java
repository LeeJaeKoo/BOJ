package BackJoon;

import java.util.Scanner;

public class P1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int arr[][] = new int[input + 1][3];

		int[][] dp = new int[input + 1][3];

		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		sc.close();
		for (int i = 1; i <= input; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0];//이전 빨강
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1];//이전 녹색
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i][2];//이전 파랑
			
		}

		System.out.println(Math.min(dp[input][0], Math.min(dp[input][1], dp[input][2])));
	}

}
