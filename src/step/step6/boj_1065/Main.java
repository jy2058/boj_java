package step.step6.boj_1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	static int hanNum(int num){
		int[] arr = new int[3];
		int cnt=0;
		
		if(num <= 99) {
			cnt=num; 
		}else {
			if(num==1000) num=1000-1;
			for(int i=100; i<=num; i++) {
				// �ڸ��� �߶� �迭�� �ֱ�
				int idx=0, k=i;
				while(k != 0) {
					arr[idx] = (k % 10);	// 10 �ڸ��� �ڸ���
					k /= 10;	// 10 �ڸ��� �ڸ� ������
					idx++;
				}
				if(arr[0] - arr[1] == arr[1] - arr[2]) cnt++;
			}
			cnt+=99;
		}
		return cnt;
	}
	
	// �Ѽ�
	/*
	 * 1~9 : ���ڸ��ϱ� ��� �������� �ش�
	 * 10~99 : 1,0 / 1,1 / 1,2 / �̷��� ������ ���� �� ���ڸ� ���� ��� �������� �ش�
	 * 3�ڸ�, 4�ڸ��� �� �Ǻ� �ʿ�
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = hanNum(num);
		System.out.println(result);
	}
}
