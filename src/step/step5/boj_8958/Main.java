package step.step5.boj_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int len = Integer.parseInt(br.readLine());
		int[] arr = new int[1];
		String str;
		while((str=br.readLine())!=null) {
		int sum = 0;
		arr[0]=0;
		for(int i=0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a=='O') {
				arr[0] += 1;
				sum += arr[0];
			}else {
				arr[0] = 0;
			}
		}
		sb.append(sum).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
