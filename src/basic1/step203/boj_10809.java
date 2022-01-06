package basic1.step203;

import java.util.Scanner;

// 알파벳 찾기
public class boj_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 'a'; i <= 'z'; i++) {
            sb.append(str.indexOf(i)).append(" ");
        }
        System.out.println(sb);
    }
}
