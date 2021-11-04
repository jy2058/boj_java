package step.step10;

import java.util.Scanner;

// 재귀 - 팩토리얼
public class boj_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int sum = factorial(N);
        System.out.println(sum);
    }

    static int factorial(int N){
        if(N <= 1) return 1;
        return N * factorial(N - 1);
    }
}
