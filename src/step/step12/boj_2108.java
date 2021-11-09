package step.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정렬 - 통계학
public class boj_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력값 범위 : -4000 ~ 4000
        int[] arr = new int[8001];

        int sum = 0;    // 총 합계
        int max = Integer.MIN_VALUE;    // 최댓값
        int min = Integer.MAX_VALUE;    // 최솟값
        // median과 mode는 -4000~4000을 제외한 수로 초기화
        int median = 10000; // 중앙값
        int mode = 10000;   // 최빈값

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            sum += val;
            arr[val + 4000]++;

            if (max < val) max = val;
            if (min > val) min = val;
        }

        int cnt = 0;    // 중앙값 빈도 누적 수
        int modMax = 0; // 최빈값의 최댓값

        // 이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아닐경우 false
        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                // 중앙값 찾기
                // 누적횟수가 전체 길이의 절반에 못 미친다면
                if(cnt < (N + 1) / 2){
                    cnt += arr[i];  // i 값의 빈도수를 cnt에 누적
                    median = i - 4000;
                }

                // 최빈값 찾기
                // 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
                if (modMax < arr[i]) {
                    modMax = arr[i];
                    mode = i - 4000;
                    flag = true;    // 첫 등장이므로 true로 변경
                } else if (modMax == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int) Math.round((double) sum / N)); // 평균
        System.out.println(median); // 중앙값
        System.out.println(mode);   // 최빈값
        System.out.println(max - min); // 범위
    }
}
