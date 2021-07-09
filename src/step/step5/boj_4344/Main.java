package step.step5.boj_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int len = Integer.parseInt(br.readLine());
		
		for(int i=0; i<len; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num = Integer.parseInt(st.nextToken());
			int[] arr = new int[num];
			
			int sum=0;
			// 점수 배열에 입력, 점수 합계 구하기
			for(int j=0; j<arr.length; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum+= val; 
			}
			
			float avg = sum/num;	// 평균
			int cnt=0;
			for(int k=0; k<arr.length; k++) {
				// 평균 넘는 점수 갯수 구하기
				if(arr[k] > avg) {
					cnt++;
				}
			}
			sb.append(String.format("%.3f%%", (float)cnt/num*100)).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
