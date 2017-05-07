package BackJoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P2110 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		int N, C;

		N = sc.nextInt();
		C = sc.nextInt();

		int[] arr = new int[N];

		int start, mid, end;

		int Result = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		start = arr[0];
		end = arr[N - 1];
		while (start <= end) {
			mid = (start + end) / 2;

			int WIFI = 1;
			int std = arr[0];

			for (int i = 1; i < N; i++) {
				if (arr[i] - std >= mid) {
					WIFI++;
					std = arr[i];
				}
			}

			if (WIFI >= C) {
				Result = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		System.out.println(Result);

	}

}
