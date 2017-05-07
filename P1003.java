package BackJoon;

import java.util.Scanner;

public class P1003 {

	static Scanner sc = new Scanner(System.in);

	final static int TEST_CASE = sc.nextInt();

	static int count_0, count_1 = 0;

	public static void main(String[] args) {
		P1003 t = new P1003();
		int[][] Result = new int[TEST_CASE][2];
		for (int j = 0; j < TEST_CASE; j++) {

			t.fibonicci(sc.nextInt());

			System.out.println(count_0);
			System.out.println(count_1);

			count_0 = 0;
			count_1 = 0;
		}

	}

	public int fibonicci(int input) {
		if (input == 0) {
			count_0++;
			return 0;
		} else if (input == 1) {
			count_1++;
			return 1;
		} else {
			return fibonicci(input - 1) + fibonicci(input - 2);
		}
	}
}
