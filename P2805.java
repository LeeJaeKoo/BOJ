package BackJoon;

import java.util.Scanner;

public class P2805 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, M;
		N = sc.nextInt(); // number of tree
		M = sc.nextInt(); // at least get tree height

		int max = 0;

		int Result = 0;

		int[] tHeights = new int[N];

		for (int i = 0; i < N; i++) {
			tHeights[i] = sc.nextInt();
			if (max < tHeights[i]) {
				max = tHeights[i];
			}
		}
		sc.close();

		Result = getMinHeight(tHeights, 0, max, M);
		System.out.println(Result);

	}

	public static int getMinHeight(int[] tHeights, int left, int maxValue, int limitHeight) {
		int right = maxValue;
		int H = left;
		while (left <= right) {
			long tree = 0;
			int mid = (left + right) / 2;
			for (int i = 0; i < tHeights.length; i++) {
				if (tHeights[i] >= mid) {
					tree += tHeights[i] - mid;
				}
			}
			if (tree > limitHeight) {
				H = mid;
				left = mid + 1;
			} else if (tree < limitHeight) {
				right = mid - 1;
			} else {
				H = mid;
				break;
			}
		}
		return H;
	}

}
