package step.step5.boj_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int max = 0;
		int maxIdx = 0;
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				maxIdx = i;
			}
		}
		System.out.printf("%d\n%d", max, maxIdx+1);
	}
}
