package basic1.step203;

import java.util.Scanner;

// ROT13
public class boj_11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                if(ch < 'N') sb.append(ch+=13);
                else sb.append(ch-=13);
            } else if(Character.isLowerCase(ch)){
                if(ch < 'n') sb.append(ch+=13);
                else sb.append(ch-=13);
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
