package BackJoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P10164 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		int N = sc.nextInt();
		int M = sc.nextInt();

		int INDEX = sc.nextInt();

		int idx_row = 0;
		int idx_col = 0;

		int firstArea = 0;
		int secondArea = 0;
		int res = 0;

		idx_row = INDEX % N - 1;
		idx_col = INDEX % M - 1;

		firstArea = getNum(0, 0, idx_row, idx_col, 0);
		secondArea = getNum(idx_row, idx_col, N - 1, M - 1, 0);

		res = firstArea * secondArea;
		sc.close();
		System.out.println(res);
	}

	public static int getNum(int s_row, int s_col, int e_row, int e_col, int res) {
		if (e_row == s_row && e_col == s_col) {
			res++;
			return res;
		}
		if (e_row < s_row || e_col < s_col) {
			return 0;
		}
		return getNum(s_row, s_col, e_row - 1, e_col, res) + getNum(s_row, s_col, e_row, e_col - 1, res);
	}
}
/*
 * package BACKJOON;
 * 
 * import java.io.FileInputStream; import java.io.IOException; import
 * java.util.Arrays; import java.util.Scanner;
 * 
 * public class P10164_1 {
 * 
 * public static void main(String[] args) throws IOException { // TODO
 * Auto-generated method stub
 * 
 * Scanner sc = new Scanner(new FileInputStream("test.txt"));
 * 
 * int N = sc.nextInt(); int M = sc.nextInt(); int index = sc.nextInt();
 * 
 * int[][] memo = new int[N+1][M+1];
 * 
 * int row = index % N; int col = index % M; memo[1][1] = 1; for (int i = 0; i
 * <= N; i++) { for (int j = 1; j <= M; j++) { if(i == 1 && j == 1){ continue; }
 * if ((i > row && j < col) || (i < row && j > col)) { memo[i][j] = 0; } else {
 * memo[i][j] = memo[i - 1][j] + memo[i][j - 1]; } } }
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 */