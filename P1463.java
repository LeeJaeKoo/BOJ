package BackJoon;

import java.util.Scanner;

public class P1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int[] a = new int[input + 1];

		for (int i = 2; i <= input; i++) {
			int tmp1 = 0;
			int tmp2 = Integer.MAX_VALUE;
			int tmp3 = Integer.MAX_VALUE;
			tmp1 = a[i - 1] + 1;
			if (i % 2 == 0) {
				tmp2 = a[i / 2] + 1;
			}
			if (i % 3 == 0) {
				tmp3 = a[i / 3] + 1;
			}

			a[i] = Math.min(tmp1, Math.min(tmp2, tmp3));
		}
		sc.close();
		System.out.println(a[input]);

	}

}
