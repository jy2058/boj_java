package step.step6.boj_15596;

public class Main {
	
	static int selfNum(int num){
		int sum = num;
		// 자릿수 잘라서 더하기
		while(num != 0) {
			sum += (num % 10);	// 10 자릿수 자르기
			num /= 10;	// 10 자릿수 자른 나머지
		}
		return sum;
	}
	
	// 셀프넘버
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[10000];	// 1~10000까지 배열 초기화
		
		for(int i=1; i<=10000; i++) {
			int val = selfNum(i);
			// 10000보다 작은 값 중, 반환되는 값은 생성자가 있는 경우기 때문에 배열에서 true 처리
			if(val <= 10000) arr[val-1] = true;
		}
		// false인 것만 출력
		for(int j=0; j<arr.length; j++) {
			if(!arr[j]) sb.append(j+1).append(System.lineSeparator()); 
		}
		System.out.println(sb.toString());
	}
}
