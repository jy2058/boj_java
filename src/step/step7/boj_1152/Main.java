package step.step7.boj_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 단어의 개수
	public static void main(String[] args) throws IOException {

		// 내 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println(st.countTokens());
		
		/*
		 * 다른 사람 풀이
		 * 	
		int preChar = 32;
		int currentChar = 0;
		int count = 0;
		
		while(true) {
			currentChar = System.in.read();
			// 1. 그냥 문자 2. 공백문자 3. \n 
			
			// 현재 문자가 공백인 경우
			if(currentChar == 32) {
				if(preChar != 32) { // 이전문자가 공백이 아니라면 단어의 개수 증가
					count++;
				}
			}
			
			// 현재 문자가 개행문자인 경우
			if(currentChar == 10) {
				if(preChar != 32) {
					count++;
				}
                break;
			}
			preChar = currentChar;
		}
		
		System.out.println(count);
		*/
	}
}
