package step.step8.boj_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 달팽이는 올라가고 싶다 : 달팽이의 움직임을 계산하는 몬제
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int up = Integer.parseInt(st.nextToken());	// 오르는 높이
		int down = Integer.parseInt(st.nextToken());	// 미끄러지는 높이
		int height = Integer.parseInt(st.nextToken());	// 총 높이

		// height
		int day = (height - down) / (up - down);

		// 나머지가 있을 경우 하루 추가
		if((height - down) % (up - down) != 0)
			day++;
		System.out.println(day);
	}
		/*
		원래는 height / (up - down) 의 몫이 day이지만,
		조건에 정상에 도달하면 미끄러지지 않는다 라는 조건이 있다.
		그럼 만약 잔여 블럭이 존재하면, 한번 미끄러지고 다시올라가야 한다.
		up - down 의 차이값보다 작은 나머지가 존재하면 다음날 올라가야함.
		=> 결과적으로 down을 빼면 up과 down의 차이를 나눈 몫은 최소한의 day가 된다.
		 */
}
