package step.step12;

import java.util.*;

// 정렬 - 수 정렬하기 2
public class boj_1751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        StringBuilder sb = new StringBuilder();

        Collections.sort(list);

        for(int i : list){
            sb.append(i).append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
}
