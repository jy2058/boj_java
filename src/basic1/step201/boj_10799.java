package basic1.step201;

import java.util.Scanner;
import java.util.Stack;

// 쇠막대기
public class boj_10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                if (stack.peek() == i - 1) {
                    stack.pop();
                    cnt += stack.size();
                }else{
                    stack.pop();
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
