package BackJoon;

import java.util.Scanner;

public class P2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1, input2, Result;

		input1 = sc.nextInt();
		input2 = sc.nextInt();
		sc.close();
		Result = input1 * (input2 - 1);

		System.out.println(Result + 1);

	}

}