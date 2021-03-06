package step.step3.boj_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int s = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int b = Integer.parseInt(st.nextToken());
			if(a > b) {
				sb.append(b).append(" ");
			};
		}
		System.out.println(sb.toString());
	}
}
