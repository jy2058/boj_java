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
		
		// do while�� �߾���� �Ѵ�. 
		// �׷����� rtnVal�� -1 �ְų�, if�� ���� �ʿ䰡 ������.
	}
}
