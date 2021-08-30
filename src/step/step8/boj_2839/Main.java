package step.step8.boj_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 설탕배달
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;

		while(true){
			if(T % 5 == 0){
				cnt += T / 5;
				System.out.println(cnt);
				break;
			}else{
				T -= 3;
				cnt++;
			}
			if(T < 0){
				System.out.println(-1);
				break;
			}
		}
	}
}
