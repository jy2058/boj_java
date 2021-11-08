package step.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 정렬 - 수 정렬하기 3
public class boj_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[10001]; // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int N = Integer.parseInt(br.readLine());

        // 카운팅 정렬 이용

        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            // i 값의 개수가 0이 될 때까지 출력(빈도수) -> 중복데이터가 있기 떄문에
            while (cnt[i] > 0) {
                sb.append(i).append(System.lineSeparator());
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
