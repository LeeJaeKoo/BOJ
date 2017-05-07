package BackJoon;

import java.io.IOException;
import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		P1002 t = new P1002();
		int TEST_CASE = sc.nextInt(); // 테스트케이스
		int x1, y1, x2, y2, r1, r2;
		double d;
		int[] Result = new int[TEST_CASE]; // 결과값 저장
		int i = 0;
		int TEST = TEST_CASE;
		while (TEST > 0) {// 값 입력받기

			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();

			// 두 점의 거리를 구하기
			d = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));

			Result[i] = t.CheckPoint(x1, y1, r1, x2, y2, r2, d);
			i++;
			TEST--;
		}
		sc.close();

		for (int j = 0; j < TEST_CASE; j++) {// 결과값 출력
			System.out.println(Result[j]);
		}
	}

	// 두점, 한점(내접, 외접), 동일, 나머지
	public int CheckPoint(int x1, int y1, int r1, int x2, int y2, int r2, double d) {

		int max = Math.max(r1, r2);
		int min = Math.min(r1, r2);

		if (d == 0) {//원점이 같을경우
			if (r1 == r2) {//동일
				return -1;
			} else {//작음
				return 0;
			}
		} else if (r1 + r2 > d && max - min < d) {//두점으로 만날경우
			return 2;
		} else if (r1 + r2 == d || max - min == d) {//외접과 내접일 경우
			return 1;
		} else {//그 외
			return 0;
		}
	}
}
