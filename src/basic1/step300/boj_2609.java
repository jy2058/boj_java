package basic1.step300;

import java.util.Scanner;

// 최대공약수와 최소공배수
public class boj_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(a*b/gcd);

    }
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
