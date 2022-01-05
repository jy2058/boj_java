package basic1.step203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 후위 표기식
public class boj_1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char target = str.charAt(i);

            switch (target) {
                case '+':
                case '-':
                case '*':
                case '/':
                    while(!stack.isEmpty() && priority(stack.peek()) >= priority(target)){
                        sb.append(stack.pop());
                    }
                    stack.push(target);
                    break;
                case '(':
                    stack.push(target);
                    break;
                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.append(target);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

        /* 연산자는 스택에, 피연산자는 바로 출력
         연산자의 우선 순위를 지정해서 스택에 넣기전에, 현재 연산자의 우선순위보다 큰 연산자가
         스택의 맨 위에 있다면 없을때까지 pop 한다. (우선순위가 큰 연산자 먼저 계산)
         ')' 일경우에는 '('가 나올때까지 스택안의 연산자를 pop 한다.
         피연산자는 따로 스택에 넣지 않고 StringBuilder에 메 append
         */


    }

    private static int priority(char operator) {
        if (operator == '(' || operator == ')') {
            return 0;
        } else if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return -1;
    }

}
