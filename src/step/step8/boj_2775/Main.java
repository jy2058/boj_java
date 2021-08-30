package step.step8.boj_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 부녀회장이 될테야: 층과 거주자 수의 규칙을 찾는 문제
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		// 아파트 만들기
		int[][] APT = new int[15][15];
		for(int i=0; i <15; i++){
			APT[i][1] = 1;	// i층은 1로 초기화
			APT[0][i] = i; 	// 0층은 i호로 초기화
		}

		// 아파트 값 채우기
		for(int i=1; i<15; i++){ // 1층부터 14층까지
			for(int j=2; j<15; j++){	// 2호부터 14호까지
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
		// 입력받은 층,호의 값 출력
		for(int i=0; i<T; i++){
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(APT[k][n]);
		}

	}
		/*
			a층 b호에 살기 위해선 (a-1) 층의 1호부터 b호까지 사람들 수의 합만큼사람을 데려와야한다.
			k층 n호 = (k-1)층 1호 + (k-1)층 2호 + (k-1)층 3호 +...+ (k-1)층 n호
			=> 해당 층의 왼쪽호의 수와 해당 호의 아래층 값을 더하면 해당층 인원수가 됨
		 */
}
