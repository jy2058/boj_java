package step.step8.boj_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 손익분기점 : 이익이 발생하는 지점을 찾는 문제
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fix = Integer.parseInt(st.nextToken());
		int dyn = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());

		if(dyn >= price){
			System.out.println(-1);
		}else{
			System.out.println(fix/(price-dyn)+1);
		}
	}
	/*
	(n*상품가격) = 불편비용 + (n*가변비용)
	-> (n*상품가격) - (n*가변비용) = 불변비용
	-> n * (상품가격-가변비용) = 불변비용
	=> n = 불변비용 / 상품가격-가변비용

	n은 총 비용과 총 수익이 같아지는 지점이어서 이익이 나는 지점은 +1 해야함.
	=> 불변비용 / 상품가격-가변비용 + 1

	가변비용이 상품가격과 같거나 커지면 이익은 나지 않음.
	 */
}
