package step.step1.boj_1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int result = 0;
		for(String v : s) {
			result += Integer.parseInt(v);
		}
		System.out.println(result);
	}
}
