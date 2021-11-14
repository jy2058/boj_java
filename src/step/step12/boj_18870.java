package step.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 정렬 - 좌표 압축
public class boj_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        int[] arr = new int[N];
        int[] arrClone;
        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arrClone = arr.clone();
        Arrays.sort(arr);
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], cnt++);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(map.get(arrClone[i])).append(" ");
        }

        System.out.println(sb);
    }
}
