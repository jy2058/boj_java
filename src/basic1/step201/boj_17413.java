package basic1.step201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 단어 뒤집기2
public class boj_17413 {

    static Stack stack = new Stack();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        boolean chk = false;

        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '<'){
                printStack();
                chk = true;
                System.out.print(S.charAt(i));
            }else if(S.charAt(i) == '>'){
                chk = false;
                System.out.print(S.charAt(i));
            }else if (chk) {
                System.out.print(S.charAt(i));
            }else {
                if (S.charAt(i) == ' ') {
                    printStack();
                    System.out.print(S.charAt(i));
                }else{
                    stack.push(S.charAt(i));
                }
            }
        }
        printStack();
    }

    private static void printStack() {
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

}
