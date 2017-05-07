package BackJoon;

import java.util.Scanner;
import java.util.Stack;

public class P9935 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		String explode = sc.next();

		char[] arr_input = input.toCharArray();

		char[] arr_exp = explode.toCharArray();

		Stack<Character> c_input = new Stack<Character>();

		boolean exp = false;

		for (int i = arr_input.length - 1; i >= 0; i--) {
			c_input.add(arr_input[i]);
			int cnt = 0;
			if (c_input.size() >= arr_exp.length && c_input.peek() == arr_exp[0]) {
				for (int j = 0; j < arr_exp.length; j++) {
					exp=true;
					if (c_input.get(c_input.size()-j-1) != arr_exp[j]) {
						exp = false;
						break;
					}
				}

				if (exp) {
					for (int j = 0; j < arr_exp.length; j++) {
						c_input.pop();
					}
				}
			}
		}

		int size = c_input.size();
		if (c_input.isEmpty()) {
			System.out.println("FRULA");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.print(c_input.pop());
			}
		}
	}
}
