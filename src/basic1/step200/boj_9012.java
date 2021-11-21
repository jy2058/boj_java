package basic1.step200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
public class boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sb.append(func(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    private static String func(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if(stack.empty()) {  // 닫기 괄호인 데 스택이 비어있으면 X
                return "NO";
            }else{
                stack.pop();    // 닫는 괄호 나왔을 때 꺼내기
            }
        }
        // 온전한 수식이면 스택이 비어야 한다.
        // 여는 괄호가 남아있으면 X
        return stack.empty() ? "YES" : "NO";
    }
}
