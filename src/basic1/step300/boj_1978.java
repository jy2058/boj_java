package basic1.step300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
public class boj_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            if(is_prime(a)) cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean is_prime(int a) {
        if(a == 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) return false;
        }
        return true;
    }
}

