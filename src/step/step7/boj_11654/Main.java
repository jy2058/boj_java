package step.step7.boj_11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// String -> ASCII
	public static void main(String[] args) throws IOException {
		// ���� ���� �� ��
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//byte[] num = br.readLine().getBytes();
		//System.out.println(num[0]);
		
		// ===================================================
		// ���� �ڵ�
		/*
		 * System.in ���� �� byte�� �޴´�. 
		 * �׷��� ������ ���� ����ȯ �ϴ� ������ ���� �ʿ� ����.
		 * System.in.read() �ϸ� ����Ʈ ��ȯ �� �� int�� ������.
		 */
		System.out.println(System.in.read());
	}
}
