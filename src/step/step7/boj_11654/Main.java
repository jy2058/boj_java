package step.step7.boj_11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// String -> ASCII
	public static void main(String[] args) throws IOException {
		// 내가 구현 한 거
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//byte[] num = br.readLine().getBytes();
		//System.out.println(num[0]);
		
		// ===================================================
		// 정답 코드
		/*
		 * System.in 받을 때 byte로 받는다. 
		 * 그렇기 때문에 굳이 형변환 하는 절차를 갖을 필요 없음.
		 * System.in.read() 하면 바이트 변환 된 걸 int로 보여줌.
		 */
		System.out.println(System.in.read());
	}
}
