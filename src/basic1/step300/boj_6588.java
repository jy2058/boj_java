package basic1.step300;

import java.util.Scanner;

// 골드바흐의 추측
public class boj_6588 {
    static boolean[] prime;
    public static void main(String[] args) {
        int MAX = 1000000;
        prime = new boolean[MAX + 1];
        Scanner sc = new Scanner(System.in);

        get_prime();

        while(true){
            int a = sc.nextInt();
            boolean ok = false;
            if(a == 0) break;
            for(int i=2; i <= a/2; i++){
                if(!prime[i] && !prime[a - i]){
                    System.out.println(a + " = " + i + " + " + (a - i));
                    ok=true;
                    break;
                }
            }
            if(!ok) System.out.println("Goldbach's conjecture is wrong.");

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
