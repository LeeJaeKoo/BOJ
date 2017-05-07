package BackJoon;

import java.util.Scanner;

public class P4354 {

	static String input;
	static int max, cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int size = input.length();
		max = 0;

		char[] c_i = new char[size];
		String cmp1 = "";
		String cmp2 = "";
		c_i = input.toCharArray();

		int cnt = 0;
		for (int i = 0; i < size; i++) {
			cmp1 += input.charAt(i);
			for (int j = i; j < cmp1.length(); j++) {
				cmp2 += input.charAt(i);
				System.out.println(cmp2);
			}
			if (input.equals(cmp1)) {
				cnt++;
			}
		}

		/*
		 * for (int i = 0; i < size / 2; i++) { cmp1 = cmp1 + c_i[i]; for (int j
		 * = i; j < size; j++) { cmp2 = cmp2 + c_i[j]; if (cmp1 == cmp2) { for
		 * (int k = i; k < size; k++) {
		 * 
		 * } } } }
		 */

	}

}
