package basic1.step203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 찾기
public class boj_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int target = s.charAt(i) - 'a';
            if(arr[target] == -1){
                arr[target] = i;
            }
        }

        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
