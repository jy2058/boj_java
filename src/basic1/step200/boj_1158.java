package basic1.step200;

import java.util.LinkedList;
import java.util.Scanner;

// 요세푸스 문제
public class boj_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        int K = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(q.size() != 1){
            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
