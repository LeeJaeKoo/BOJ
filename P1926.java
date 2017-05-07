package BackJoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1926 {
	static int[][] map;
	// static boolean[][] visited;
	// static Stack<Integer> st;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int dsize = 4;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		int n, m;

		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		// visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				map[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> Area = new ArrayList<>();
		for (int i = 0; i < n; i++) {// 5
			for (int j = 0; j < m; j++) {// 7
				int areaSize = getAvailCellSize(map, j, i, -1, 0);
				if (areaSize > 0) {
					Area.add(areaSize);
				}
			}
		}
		Area.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return (o1 > o2) ? 1 : (o1 == o2) ? 0 : -1;// 규칙적으로 리턴값이 제약으로
															// 정해짐
			}

		});
		sc.close();
		int max = 0;
		int num = 0;
		for (int result : Area) {
			if (max < result) {
				max = result;
			}
			num++;
		}
		System.out.println(num);
		System.out.println(max);
	}

	public static int getAvailCellSize(int[][] map, int x, int y, int index, int size) {
		if (y < 0 || y >= map.length) {
			return 0;
		}
		if (x < 0 || x >= map[0].length) {
			return 0;
		}
		switch (map[y][x]) {
		case 1:
			map[y][x] = index;
			size++;
			//System.out.println(Arrays.deepToString(map).replaceAll("],", "]\n"));
			for (int i = 0; i < dsize; i++) {
				int tmpsize = getAvailCellSize(map, x + dx[i], y + dy[i], index, 0);
				size += tmpsize;
			}
			index = 0;
			return size;
		case 0:
		default:
			return 0;
		}

	}
}
