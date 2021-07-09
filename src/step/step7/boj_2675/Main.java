package step.step7.boj_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 단어 공부
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str = br.readLine();
		// 각 문자 for 돌면서 대문자 / 소문자 구분하여 해당 문자에 맞는 배열에 +1
		for(int i=0; i<str.length(); i++) {
			if('a' <= str.charAt(i) && str.charAt(i) <= 'z' ) {
				arr[str.charAt(i)-'a']++;
			}else {
				arr[str.charAt(i)-'A']++;
			}
		}
		
		int max=0;
		char ch = '?';
		// 최댓값 찾기, 최댓값 같을 경우 '?' 출력
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i+'A');	// 대문자 출력
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
