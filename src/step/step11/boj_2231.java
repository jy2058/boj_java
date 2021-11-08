package step.step11;

import java.util.Scanner;

// 브루트 포스 - 분해합
public class boj_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;

        for(int i=0; i<N; i++){
            int num = i;    // 현재 숫자
            int sum = 0;    // 각 자릿수 합

            while(num != 0){
                sum += num % 10;    // 각 자리수 더하기
                num /= 10;          // 자리수 변환
            }

            if(sum + i == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
