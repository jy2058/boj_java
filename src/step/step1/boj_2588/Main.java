package step.step1.boj_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a * (b%10));
		System.out.println(a * ((b/10)%10));
		System.out.println(a * ((b/100)%100));
		System.out.println(a * b);
	}
}
