package step.step4.boj_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int initVal = Integer.parseInt(br.readLine());
		int rtnVal = -1;
		int cnt=0;
		while(initVal != rtnVal) {
			if (rtnVal < 0) rtnVal = initVal;
			int a = rtnVal / 10;
			int b = rtnVal % 10;
			int sumVal = a+b;
			rtnVal = (b*10)+(sumVal % 10);
			cnt++;
		}
		System.out.println(cnt);
		
		// do while로 했었어야 한다. 
		// 그래야지 rtnVal에 -1 넣거나, if문 넣을 필요가 없어짐.
	}
}
