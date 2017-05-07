package BackJoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P9084 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int N = sc.nextInt();
			int[] arr_n = new int[N + 1];

			for (int i = 1; i < N + 1; i++) {
				arr_n[i] = sc.nextInt();
			}
			int M = sc.nextInt();
			int[] memo = new int[M + 1];

			memo[0] = 1;
			for (int i = 1; i < N + 1; i++) {
				for (int j = arr_n[i]; j <= M; j++) {
					memo[j] += memo[j - arr_n[i]];
				}
			}
			System.out.println(memo[M]);
		}
		sc.close();
	}

}
