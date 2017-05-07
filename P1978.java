package BackJoon;

import java.util.Scanner;

public class P1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int[] arr_input = new int[input];

		int Result = 0;
		
		for (int i = 0; i < input; i++) {
			arr_input[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < input; i++) {
			int count = 0;
			for (int j = 1; j <= arr_input[i]; j++) {
				if (arr_input[i] % j == 0) {
					count++;
				}
			}
			if(count == 2){
				Result++;
			}
		}
		System.out.println(Result);
	}
}
