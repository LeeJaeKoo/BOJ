package BackJoon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2606 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		int vertex = sc.nextInt();

		int edge = sc.nextInt();

		int[][] map = new int[vertex][vertex];

		boolean[] visited = new boolean[vertex];

		int result = 0;

		for (int i = 0; i < edge; i++) {

			int v1 = sc.nextInt() - 1;
			int v2 = sc.nextInt() - 1;

			map[v1][v2] = map[v2][v1] = 1;

		}
		sc.close();
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(0);
		visited[0] = true;

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int i = 0; i < vertex; i++) {
				if (map[cur][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
