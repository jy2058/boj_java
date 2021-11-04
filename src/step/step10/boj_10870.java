package step.step10;

import java.util.Scanner;

// 재귀 - 피노나치 수 5
public class boj_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = func(n);
        System.out.println(num);
    }

    public static int func(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return func(n-1) + func(n-2);
    }
}
