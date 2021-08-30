package step.step8.boj_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	// Fly me to the Alpha Centauri
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int distance = y-x;
			int max = (int) Math.sqrt(distance);	// max의 값은 distance의 루트값에서 소숫점을 버린 정수 값

			if(max == Math.sqrt(distance)){	// distance의 제곱근이 정수로 딱 떨어지면 count=max * 2 -1
				System.out.println(max*2-1);
			}else if(distance <= max * max + max){
				System.out.println(max*2);
			}else{
				System.out.println(max*2+1);
			}
		}
	}
	/*
		y 지점 도착하기 바로 직전의 이동거리는 소숫점을 버린 정수 값

		3
		0 3
		1 5
		45 50
		-----
		3
		3
		4
		-------------

		max의 값은 distance의 루트 값에서 소숫점을 버린 정수값
		max가 변하는 지점과 다른 지점 사이에는 count가 2
		max가 변한 후에는 반드시 count가 변한다.
		max가 변할 때 count = (2*max -1)

	 */
}



