package step.step7.boj_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// �ܾ��� ����
	public static void main(String[] args) throws IOException {

		// �� Ǯ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println(st.countTokens());
		
		/*
		 * �ٸ� ��� Ǯ��
		 * 	
		int preChar = 32;
		int currentChar = 0;
		int count = 0;
		
		while(true) {
			currentChar = System.in.read();
			// 1. �׳� ���� 2. ���鹮�� 3. \n 
			
			// ���� ���ڰ� ������ ���
			if(currentChar == 32) {
				if(preChar != 32) { // �������ڰ� ������ �ƴ϶�� �ܾ��� ���� ����
					count++;
				}
			}
			
			// ���� ���ڰ� ���๮���� ���
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
