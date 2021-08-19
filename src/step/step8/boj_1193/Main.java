package step.step8.boj_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 분수찾기 : 분수의 순서에서 규칙을 찾는 문제
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		// cross_count : 해당범위 대각선 값
		// prev_count_sum : 누적 칸 수 (직전까지의 cross_count 누적값)
		int cross_count = 1, prev_count_sum = 0;

		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {

				// => 입력값에서 누적칸수를 빼면 분모 또는 분자의 값이 나옴. 홀수냐 짝수냐에 따라 분모인지 분자인지 결정되고,
				// 만약 분모가 결정됐다면 분자의 값은 대각선 수 +1 한 겂에서 분모를 뺀 값이 된다.
				// 대각선 +1을 하는 이유는 분모 + 분자의 합이 대각선 수 보다 +1 크기 때문.
				// 이 수식에서는 +1을 하지않고 분모 + 분자의 값을 -1 하는 방향으로 작성 됨.

				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 (분모는 커지고 분자는 작아짐)
					// 분모가 큰 수부터 시작
					// 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1)
					// 분자는 X 번째 - 직전 대각선까지의 누적합
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				}

				else {	// 대각선의 개수가 짝수라면 (분모는 작아지고 분자는 커짐)
					// 홀수일 때의 출력을 반대로
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}

			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
	/*
	1/1	1/2	1/3	1/4	1/5	…
	2/1	2/2	2/3	2/4	…	…
	3/1	3/2	3/3	…	…	…
	4/1	4/2	…	…	…	…
	5/1	…	…	…	…	…
	…	…	…	…	…	…

	 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로
	 */
}
