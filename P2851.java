package BackJoon;

import java.util.Scanner;

public class P2851 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr_i = new int[10];

		int sum = 0;

		int res1 = 0;
		int res2 = 0;
		int resi1 = 0;
		int resi2 = 0;

		for (int i = 0; i < 10; i++) {
			arr_i[i] = sc.nextInt();
		}

		int start = 0;
		int end = 9;
		while (start < end) {
			sum += arr_i[start];

			if (sum <= 100 && sum + arr_i[start + 1] >= 100) {
				res1 = 100 - sum;
				resi1 = sum;
				res2 = sum + arr_i[start + 1] - 100;
				resi2 = sum + arr_i[start + 1];
				if (res2 > res1) {
					System.out.println(resi1);
					break;
				} else {
					System.out.println(resi2);
					break;
				}
			} else if (start == end - 1) {
				System.out.println(sum + arr_i[start+1]);
				break;
			} else {
				start++;
			}
		}
		sc.close();

	}

}
