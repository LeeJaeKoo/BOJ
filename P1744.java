package BackJoon;

import java.util.Scanner;

public class P1744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr_i = new int[N];
		int[] dp = new int[N + 1];

		for (int i = 0; i < N; i++) {
			arr_i[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (arr_i[j] > arr_i[i]) {
					int tmp = arr_i[j];
					arr_i[j] = arr_i[i];
					arr_i[i] = tmp;
				}
			}
		}
		dp[1] = arr_i[0];
		for (int i = 2; i <= N; i++) {
			dp[i] = Math.max(arr_i[i - 1] + dp[i - 1], arr_i[i - 1] * arr_i[i - 2] + dp[i - 2]);
		}

		System.out.println(dp[N]);
	}

}
