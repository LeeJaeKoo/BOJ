package BackJoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		StringTokenizer st = new StringTokenizer(input, " ");

		int count = 0;

		while (st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		sc.close();
		System.out.println(count);
	}

}
