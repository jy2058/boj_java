package step.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀-별 찍기 -10
public class boj_2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        star(0,0,N,false);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(arr[i][j]);
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    private static void star(int x, int y, int N, boolean blank) {
        if(blank){  // 공백일경우
            for(int i=x; i<x+N; i++){
                for(int j=y; j<y+N; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if(N == 1){ // 더이상 쪼갤 수 없는 불록일 때
            arr[x][y] = '*';
            return;
        }

        /**
         * size :
         *  N=27 일 경우 한 블록의 사이즈는 9이고,
         *  N=9 일 경우 한 블록의 사이즈는 3
         *  해당 블록의 한 칸을 담을 변수를 의미
         *
         *  count : 별 출력 누적
         */

        int size = N / 3;
        int count = 0;
        for(int i=x; i<x+N; i+=size){
            for(int j=y; j<y+N; j+=size){
                count++;
                if(count == 5){ // 곻백
                    star(i, j, size, true);
                }else{
                    star(i, j, size, false);
                }
            }
        }
    }

}
