package step.step6.boj_1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	static int hanNum(int num){
		int[] arr = new int[3];
		int cnt=0;
		
		if(num <= 99) {
			cnt=num; 
		}else {
			if(num==1000) num=1000-1;
			for(int i=100; i<=num; i++) {
				// 자릿수 잘라서 배열에 넣기
				int idx=0, k=i;
				while(k != 0) {
					arr[idx] = (k % 10);	// 10 자릿수 자르기
					k /= 10;	// 10 자릿수 자른 나머지
					idx++;
				}
				if(arr[0] - arr[1] == arr[1] - arr[2]) cnt++;
			}
			cnt+=99;
		}
		return cnt;
	}
	
	// 한수
	/*
	 * 1~9 : 한자리니까 모두 등차수열 해당
	 * 10~99 : 1,0 / 1,1 / 1,2 / 이렇게 나눠서 봤을 때 두자리 수는 모두 등차수열 해당
	 * 3자리, 4자리일 때 판별 필요
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = hanNum(num);
		System.out.println(result);
	}
}
