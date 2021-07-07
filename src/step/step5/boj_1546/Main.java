package step.step5.boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		double[] arr = new double[len];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max=0, idx=0;
		while(st.hasMoreTokens()){
			int num = Integer.parseInt(st.nextToken());
			arr[idx] = num;
			if(max < num) max = num;
			idx++;
		}
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]/max*100;
			sum+= arr[i];
		}
		double result = sum / len;
		System.out.println(result);
	}
}
