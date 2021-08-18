package step.step8.boj_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 벌집 : 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int cnt = 1;	// 최소갯수 방
		int i = 2;		// 범위

		if (number == 1) {
			System.out.println(1);
		} else {
			while (i <= number) {
				i = i + (cnt * 6);	// 다음범위의 최솟값으로 초기화(2,8,20,38)
				cnt++;
			}
			System.out.println(cnt);
		}
	}
	/*
	i	벌집갯수 	cnt
	--------------------
	1		1		1
	2~7		6		2
	8~19	12		3
	20~37	18		4
	38~61	24		5
	 */
}
