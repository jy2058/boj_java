package step.step8.boj_10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// ACM호텔 : 호텔 방 번호의 규칙을 찾아 출력하는 뮨제
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st=null;
		for(int i=0; i < num; i++){
			st = new StringTokenizer(br.readLine());

			int floor = Integer.parseInt(st.nextToken());	// 층 수
			int room = Integer.parseInt(st.nextToken());	// 각 층의 방 수
			int person = Integer.parseInt(st.nextToken());	// 몇 번째 손님

			if(person % floor == 0){
				sb.append((floor * 100) + (person / floor)).append("\n");
			}else{
				sb.append((person % floor * 100) + ((person / floor)+1)).append("\n");
			}
		}
		System.out.print(sb);
	}
		/*
			 --층 구하기---
			 손님 % 전체층수 = 해당 층수
			 손님 % 전체층수 == 0 이면 최고 층
			 --거리 구하기 --
			 손님 / 전체 층수
			 손님 / 전체 층수 == 0 이면 + 1
			 손님 % 전체 층수 == 0 이면 +1 안 함
		 */
}
