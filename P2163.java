package BackJoon;

import java.util.Scanner;

public class P2163 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		P2163 t = new P2163();
		
		int N, M, Result;
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		Result = (N-1)+(M-1)*N;

		System.out.println(Result);
		
	}

}
