package step.step3.boj_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer sb = null;
		for(int i = 0; i < a; i++) {
			 sb = new StringTokenizer(br.readLine()," ");
			 int aa = Integer.parseInt(sb.nextToken());
			 int bb = Integer.parseInt(sb.nextToken());
			 System.out.println(aa+bb);			
		}
	}
}
