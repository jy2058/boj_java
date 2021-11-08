package step.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 브루트 포스 - 체스판 다시 칠하기
public class boj_1018 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }

        int nRow = N - 7;
        int mCol = M - 7;

        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < mCol; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    private static void find(int x, int y) {
        int xEnd = x + 8;
        int yEnd = y + 8;
        int cnt = 0;

        boolean tf = arr[x][y]; // 첫번째 칸의 색

        for (int i = x; i < xEnd; i++) {
            for (int j = y; j < yEnd; j++) {
                if (arr[i][j] != tf) {
                    cnt++;  // 색 잘못된 경우
                }
                tf = (!tf);   // 다음 칸 색 변경
            }
            tf = !tf;
        }
        /*
            첫번쨰 칸을 기준으로 할 때 색칠 할 개수(cnt) 와
            첫번째 칸의 색의 반대되는 색을 기준으로 할 때의
            색칠 할 개수(64-cnt) 중 최솟값을 cnt에 저장
         */
        cnt = Math.min(cnt, 64 - cnt);
        /*
            이전까지의 경우 중 최솟값보다 현재 cnt 값이
            더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, cnt);
    }
}
