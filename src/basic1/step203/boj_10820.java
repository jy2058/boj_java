package basic1.step203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 분석
public class boj_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int[] arr;
        String str ="";
        while((str = br.readLine()) != null){
            arr = new int[4];
            sb = new StringBuilder();
            for(char ch : str.toCharArray()){
                if(Character.isLowerCase(ch)) arr[0]++;
                else if (Character.isUpperCase(ch)) arr[1]++;
                else if(Character.isDigit(ch)) arr[2]++;
                else if(ch == ' ') arr[3]++;
            }
            for(int i : arr){
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}
