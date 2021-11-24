package basic1.step200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 에디터
public class boj_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        Stack<Character> lStack = new Stack<>();
        Stack<Character> rStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            lStack.push(str.charAt(i));
        }

        while(N-- > 0){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if(!lStack.isEmpty())
                        rStack.push(lStack.pop());
                    break;
                case "D":
                    if(!rStack.isEmpty())
                        lStack.push(rStack.pop());
                    break;
                case "B":
                    if(!lStack.isEmpty())
                        lStack.pop();
                    break;
                case "P":
                    String s = st.nextToken();
                    lStack.push(s.charAt(0));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!lStack.isEmpty())
            rStack.push(lStack.pop());
        while(!rStack.isEmpty())
            sb.append(rStack.pop());
        System.out.println(sb);
    }
}
