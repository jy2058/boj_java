package step.step7.boj_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// �ܾ� ����
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str = br.readLine();
		// �� ���� for ���鼭 �빮�� / �ҹ��� �����Ͽ� �ش� ���ڿ� �´� �迭�� +1
		for(int i=0; i<str.length(); i++) {
			if('a' <= str.charAt(i) && str.charAt(i) <= 'z' ) {
				arr[str.charAt(i)-'a']++;
			}else {
				arr[str.charAt(i)-'A']++;
			}
		}
		
		int max=0;
		char ch = '?';
		// �ִ� ã��, �ִ� ���� ��� '?' ���
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i+'A');	// �빮�� ���
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
