package step.step5.boj_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[10];
		String num = String.valueOf(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
		
		for(int i=0; i < num.length(); i++) {
			arr[num.charAt(i) - '0'] += 1;
		}
		for(int j : arr) {
			sb.append(j).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
