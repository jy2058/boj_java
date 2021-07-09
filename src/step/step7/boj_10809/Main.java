package step.step7.boj_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 알파벳 찾기
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] arr = new int[26];
		
		// 배열 -1로 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		// 각문자 해당 배열에 index값 넣기. 'a' 빼면 아스키 값이 0으로 돼서 배열의 0값과 같아짐.
		// 중복된 문자일 경우 처음 index값 나오게.
		for(int i=0; i<str.length(); i++) {
			int a = str.charAt(i)-'a';
			if(arr[a] == -1) arr[a] = i;
		}
		
		// 값 출력
		for(int i : arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
	}
}
