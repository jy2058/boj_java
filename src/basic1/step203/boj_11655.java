package basic1.step203;

import java.util.Scanner;

// ROT13
public class boj_11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char chr : str.toCharArray()) {
            if('A' <= chr && chr <= 'Z') {
                if (chr < 'N') {
                    sb.append(chr += 13);
                }else{
                    sb.append(chr -= 13);
                }
            }else if('a' <= chr && chr <= 'z'){
                if (chr < 'n') {
                    sb.append(chr += 13);
                }else{
                    sb.append(chr -= 13);
                }
            }else{
                sb.append(chr);
            }
        }
        System.out.println(sb);
    }
}
