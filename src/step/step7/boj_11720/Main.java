package step.step7.boj_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 숫자의 합
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		int sum=0;
		for(int i=0; i<cnt; i++) {
			int a = nums.charAt(i)-'0';
			sum+= a;
		}
		System.out.println(sum);
	}
}
