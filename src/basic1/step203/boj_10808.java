package basic1.step203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 개수
public class boj_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }

        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
