package BackJoon;

import java.io.FileInputStream;
import java.util.Scanner;

public class P1197 {
	static int V;
	static int E;
	static int[][] map; // 인접행렬
	static int visited[]; // mst 포함 여부

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileInputStream("test.txt"));

		V = sc.nextInt();
		E = sc.nextInt();
		map = new int[V + 1][V + 1];
		visited = new int[V + 1];

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			map[A][B] = C;
			map[B][A] = C;
		}
		int sum = prim();
		System.out.println(sum);
	}

	public static int prim() {
		visited[1] = 1;
		int sum = 0;

		for (int i = 1; i <= V; i++) {
			int min = Integer.MAX_VALUE;
			int minIdx = 0;
			if (visited[i] == 1) // mst에 포함된 노드의
			{
				for (int j = 1; j <= V; j++) // 모든
				{
					if (map[i][j] != 0 && visited[j] == 0) // mst 미포함인 인접
															// 노드에 대해
					{
						if (min > map[i][j]) // 비용이 최소인 노드를
						{
							min = map[i][j];
							minIdx = j;
							System.out.println("min =" + min);
							visited[minIdx] = 1; // mst에 추가
							sum += min; // mst 간선의 비용 누적
							System.out.println("sum = " + sum);
						}
					}
				}
			}
		}
		return sum;
	}
}