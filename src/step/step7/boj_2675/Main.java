package step.step7.boj_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 문자열 반복
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int len = Integer.parseInt(br.readLine());
		for(int i=0; i<len; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int repeat = Integer.parseInt(st.nextToken());	// 반복횟수
			String str = st.nextToken();	// 문자열
			// 각 문자 순환
			for(int j=0; j<str.length(); j++) {
				// 반복 횟수만큼 문자 추가
				for(int k=0; k<repeat; k++) {
					sb.append(str.charAt(j));
				}
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
