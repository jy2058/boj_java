package step.step3.boj_2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = cnt; i > 0; i--) {
			sb.append(i).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
