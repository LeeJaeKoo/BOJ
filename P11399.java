package BackJoon;

import java.util.Scanner;

public class P11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int TEST_CASE = sc.nextInt();

		int[] input = new int[TEST_CASE];

		int tmp = 0;

		int[] Dp = new int[TEST_CASE + 1];

		
		int Result = 0;
		for (int i = 0; i < TEST_CASE; i++) {
			input[i] = sc.nextInt();
		}

		for (int i = 1; i < TEST_CASE; i++) {
			for (int j = 0; j < i; j++) {

				if (input[j] > input[i]) {
					tmp = input[j];
					input[j] = input[i];
					input[i] = tmp;
				}

			}
		}
		sc.close();
		for (int i = 1; i <= TEST_CASE; i++) {
			Dp[i] += Dp[i - 1] + input[i - 1];
		}
		
		for(int a : Dp){
			Result += a;
		}
		System.out.println(Result);
	}

}
