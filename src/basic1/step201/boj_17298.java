package basic1.step201;

import java.util.Scanner;
import java.util.Stack;

// 오큰수
public class boj_17298 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        int[] seq = new int[N];

        for (int i = 0; i < seq.length; i++) {
            seq[i] = sc.nextInt();
        }

        /*
            스택이 비어있지 않으면서
            현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우
            해당 조건을 만족할 떄 까지 stack의 원소를 pop 하면서
            해당 인덱스의 값을 현재 원소로 바꿔준다.
         */
        for (int i = 0; i < N; i++) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]){
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }

        /*
            스택의 모든 원소를 pop 하면서 해당 인덱스의 값을 -1로 초기화
         */
        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(seq[i]).append(' ');
        }

        System.out.println(sb);
    }
}
/*
    수열을 탐색하면서 현재 원소가 이전의 원소보다 작을 때 까지 stack에 수열의 index를 stack에 추가(push) 하는 것이다. 그리고 만약 현재 원소가 스택의 top 원소를 인덱스로 하는 수열의 원소보다 크게 될 경우 stack의 원소를 pop하면서 해당 인덱스에 해당하는 원소들을 현재 원소로 바꿔주는 것
 */