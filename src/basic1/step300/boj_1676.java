package basic1.step300;

import java.util.Scanner;

// 팩토리얼 0의 개수
public class boj_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        while(N >= 5){
            cnt += N / 5;
            N /= 5;
        }
        System.out.println(cnt);
    }
}
