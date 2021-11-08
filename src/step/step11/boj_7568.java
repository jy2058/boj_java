package step.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 브루트 포스 - 덩치
public class boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        int[][] people = new int[N][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());    // 몸무게
            people[i][1] = Integer.parseInt(st.nextToken());    // 키
        }

        for(int i=0; i<N; i++){
            int rank = 1;
            for(int j=0; j<N; j++){
                if(i == j) continue;    // 자신은 비교 X

                if(people[i][0] < people[j][0] && people[i][1] < people[j][1])
                    rank++;
            }
            System.out.print(rank+" ");
        }
    }
}
