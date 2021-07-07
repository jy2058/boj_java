package step.step2.boj_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(b>=45) {System.out.printf("%d %d", a,b-45);
		}else {
			if(a == 0) {System.out.printf("%d %d", 23, b+15);
			}else {System.out.printf("%d %d", a-1, b+15);}
		}
	}
}
