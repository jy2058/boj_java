package step.step6.boj_15596;

public class Main {
	
	static int selfNum(int num){
		int sum = num;
		// �ڸ��� �߶� ���ϱ�
		while(num != 0) {
			sum += (num % 10);	// 10 �ڸ��� �ڸ���
			num /= 10;	// 10 �ڸ��� �ڸ� ������
		}
		return sum;
	}
	
	// �����ѹ�
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[10000];	// 1~10000���� �迭 �ʱ�ȭ
		
		for(int i=1; i<=10000; i++) {
			int val = selfNum(i);
			// 10000���� ���� �� ��, ��ȯ�Ǵ� ���� �����ڰ� �ִ� ���� ������ �迭���� true ó��
			if(val <= 10000) arr[val-1] = true;
		}
		// false�� �͸� ���
		for(int j=0; j<arr.length; j++) {
			if(!arr[j]) sb.append(j+1).append(System.lineSeparator()); 
		}
		System.out.println(sb.toString());
	}
}
