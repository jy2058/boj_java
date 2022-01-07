package basic1.step203;

import java.util.Scanner;

// 네 수
public class boj_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        char chr = ' ';
        while(chr = (sc.hasNext()) && chr == ' '){
            sum += Integer.parseInt(sc.next()+sc.next());
        }
        System.out.println(sum);

    }
}
