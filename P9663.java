package BackJoon;

import java.util.Scanner;

public class P9663 {
	static int cnt = 0;

	public static boolean isCon(int[] map, int n) {
		for (int i = 0; i < n; i++) {
			if (map[i] == map[n])
				return false; // 같은 열인지
			if ((map[i] - map[n]) == (n - i))
				return false; // '\' 방향
			if ((map[n] - map[i]) == (n - i))
				return false; // '/' 방향
		}
		return true;
	}
	public static void cal(int N) {
		int[] map = new int[N];
		cal(map, 0);
	}

	public static void cal(int[] map, int n) {
		int N = map.length;
		// n이 끝까지 돌았다면 카운트를 증가한다.
		if (n == N) {
			cnt++;
		} else {
			for (int i = 0; i < N; i++) {
				map[n] = i;
				if (isCon(map, n))
					cal(map, n + 1); // 유망하다면 계속 탐색(재귀호출)
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		cal(input);
		System.out.println(cnt);
	}
}