package step.step3.boj_2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 1; i <= cnt; i++) {
			for(int j = 1; j <= cnt-i; j++) {
				sb.append(" ");
			}
			for(int k = 1; k <= i; k++) {
				sb.append("*");
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
