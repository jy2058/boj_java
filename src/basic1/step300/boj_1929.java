package basic1.step300;

import java.util.Scanner;

// 소수 구하기
public class boj_1929 {
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        prime = new boolean[b + 1];
        get_prime();

        for(int i = a; i <= b; i++){
            if(!prime[i]) System.out.println(i);
        }
    }

    private static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }

}
