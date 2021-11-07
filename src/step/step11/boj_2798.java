package step.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 브루트 포스 - 블랙잭
public class boj_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int max = 0;
        for(int i=0; i<n-2; i++){   // 세장의 카드를 고르기 때문에 첫번째카드는 n-2
            for(int j=i+1; j<n-1; j++){     // 두번째 카드는 첫번째카드 다음부터 n-1
                for(int k=j+1; k<n; k++){   // 세번째 카드는 두번째카드 다음부터 n까지
                    int sum = arr.get(i) + arr.get(j) + arr.get(k);
                    if(sum <= m){
                        max = Math.max(max, sum);
                    }
                    if(max == m){
                        System.out.println(max);
                        return;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
