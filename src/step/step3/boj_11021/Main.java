package step.step3.boj_11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 1; i <= cnt; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
