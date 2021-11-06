package step.step10;

import java.util.Scanner;

// 재귀 - 하노이 탑 이동 순서
public class boj_11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sb.append((int)(Math.pow(2,N)-1)).append(System.lineSeparator());

        hanoi(N, 1, 2, 3);
        System.out.println(sb);

    }

    /**
     *
     * @param N : 원판의 개수
     * @param start : 출발지
     * @param mid : 옮기기 위해 이동해야 하는 장소
     * @param to : 목적지
     */
    private static void hanoi(int N, int start, int mid, int to) {
        if(N == 1){ // 이동할 원반의 수가 1개일 때
            sb.append(start + " " + to).append(System.lineSeparator());
            return;
        }
        // N-1개를 A에서 B로 이동
        hanoi(N-1, start, to, mid);

        // 1개를 A에서 C로 이동
        sb.append(start + " " + to).append(System.lineSeparator());

        // N-1개를 B에서 C로 이동
        hanoi(N-1, mid, start, to);
    }

}
