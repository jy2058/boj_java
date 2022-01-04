package basic1.step203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 후위 표기식2
public class boj_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 입력 수 배열
        int[] num = new int[N];
        // 스택
        Stack<Double> stack = new Stack<>();

        String s = br.readLine();

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if ('A' <= target && target <= 'Z') {
                double d = num[target - 'A'];
                stack.push(d);
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                double result = 0.0;

                switch (target) {
                    case '+':
                        result = num2 + num1;
                        break;
                    case '-':
                        result = num2 - num1;
                        break;
                    case '*':
                        result = num2 * num1;
                        break;
                    case '/':
                        result = num2 / num1;
                        break;
                }
                stack.push(result);
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
