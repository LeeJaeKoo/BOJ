package BackJoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P10164_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		int N = sc.nextInt();
		int M = sc.nextInt();
		int index = sc.nextInt();

		int[][] memo = new int[N+1][M+1];

		int row = index % N;
		int col = index % M;
		memo[1][1] = 1;
		for (int i = 0; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if(i == 1 && j == 1){
					continue;
				}
				if ((i > row && j < col) || (i < row && j > col)) {
					memo[i][j] = 0;
				} else {
					memo[i][j] = memo[i - 1][j] + memo[i][j - 1];
				}
			}
		}
		sc.close();
	}

}
