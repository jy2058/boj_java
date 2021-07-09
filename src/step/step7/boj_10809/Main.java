package step.step7.boj_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// ���ĺ� ã��
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] arr = new int[26];
		
		// �迭 -1�� �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		// ������ �ش� �迭�� index�� �ֱ�. 'a' ���� �ƽ�Ű ���� 0���� �ż� �迭�� 0���� ������.
		// �ߺ��� ������ ��� ó�� index�� ������.
		for(int i=0; i<str.length(); i++) {
			int a = str.charAt(i)-'a';
			if(arr[a] == -1) arr[a] = i;
		}
		
		// �� ���
		for(int i : arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
	}
}
