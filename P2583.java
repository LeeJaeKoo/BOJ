package BackJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P2583 {

	final static int AVAIL_CELL = 10001;

	final static int BLOCKED_CELL = -1;

	final static int[] dx = { -1, 0, 1, 0 };
	final static int[] dy = { 0, -1, 0, 1 };
	final static int dsize = 4;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();// y축
		int N = sc.nextInt();// x축
		int K = sc.nextInt();// 몇개
		int[][] map = new int[M][N];

		P2583 t = new P2583();

		for (int i = 0; i < M; i++) {
			Arrays.fill(map[i], AVAIL_CELL);
		}

		int x1, y1, x2, y2;

		for (int i = 0; i < K; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			t.setBlockedCell(map, x1, y1, x2, y2);
		}
		ArrayList<Integer> Area = new ArrayList<>();
		for (int i = 0; i < M; i++) {// 5
			for (int j = 0; j < N; j++) {// 7
				int areaSize = getAvailCellSize(map, j, i, 1, 0);
				if (areaSize > 0) {
					Area.add(areaSize);
				}
			}
		}
		Area.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return (o1 > o2) ? 1 : (o1 == o2) ? 0 : -1;//규칙적으로 리턴값이 제약으로 정해짐
			}
			
		});
		sc.close();
		for(int result : Area){
			System.out.println(result);			
		}
	}

	public static int getAvailCellSize(int[][] map, int x, int y, int index, int size) {
		if (y < 0 || y >= map.length) {
			return 0;
		}
		if (x < 0 || x >= map[0].length) {
			return 0;
		}
		switch (map[y][x]) {
		case AVAIL_CELL:
			map[y][x] = index;
			size++;
			index++;
			for (int i = 0; i < dsize; i++) {
				int tmpsize = getAvailCellSize(map, x + dx[i], y + dy[i], index, 0);
				size += tmpsize;
			}
			return size;
		case BLOCKED_CELL:
		default:
			return 0;
		}

	}

	public void setBlockedCell(int[][] map, int x1, int y1, int x2, int y2) {
		for (int x = x1; x < x2; x++) {
			for (int y = y1; y < y2; y++) {
				switch (map[y][x]) {
				case AVAIL_CELL:
					map[y][x] = BLOCKED_CELL;
					break;
				default:
					break;
				}
			}
		}
	}

}