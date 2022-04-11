package basic1.step203;

import java.util.Scanner;

// 네 수
public class boj_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        System.out.println(Long.parseLong(arr[0]+arr[1]) + Long.parseLong(arr[2]+arr[3]));
    }
}
