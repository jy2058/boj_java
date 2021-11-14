package step.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정렬 - 단어 정렬
public class boj_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (String e1, String e2) -> {
            if(e1.length() == e2.length())
                return e1.compareTo(e2);
            else
                return e1.length() - e2.length();
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(System.lineSeparator());
        for (int i = 1; i < N; i++) {
            if(!arr[i].equals(arr[i-1]))
                sb.append(arr[i]).append(System.lineSeparator());
        }
        System.out.println(sb);

    }
}
