package basic1.step203;

import java.util.Arrays;
import java.util.Scanner;

// 접미사 배열
public class boj_11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.substring(i);
        }

        Arrays.sort(arr);

        for(String str : arr){
            System.out.println(str);
        }
    }
}
