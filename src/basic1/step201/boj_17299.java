package basic1.step201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 오등큰수
public class boj_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자 배열
        int[] numbers = new int[num];
        // 횟수 배열
        int[] count = new int[1000001];
        // 결과값 배열
        int[] result = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            count[numbers[i]]++;
        }

        // 스택
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            while (!stack.empty() && count[numbers[stack.peek()]] < count[numbers[i]]) {
                result[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);

    }
}
