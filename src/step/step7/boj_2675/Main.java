package step.step7.boj_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// ���ڿ� �ݺ�
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int len = Integer.parseInt(br.readLine());
		for(int i=0; i<len; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int repeat = Integer.parseInt(st.nextToken());	// �ݺ�Ƚ��
			String str = st.nextToken();	// ���ڿ�
			// �� ���� ��ȯ
			for(int j=0; j<str.length(); j++) {
				// �ݺ� Ƚ����ŭ ���� �߰�
				for(int k=0; k<repeat; k++) {
					sb.append(str.charAt(j));
				}
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
