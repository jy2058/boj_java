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
        // 문자 배열?
        int[] chr = new int[27];
        // 결과 스택?
        Stack<String> chrStack = new Stack<>();
        // 연산자스택
        Stack<String> oprStack = new Stack<>();

        // 입력 문자, 연산자
        String s = br.readLine();
        // 입력 수
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        // s 돌면서 문자는 해당 알파벳에 맞는 값 찾아와 결과스택에, 연산은 연산스택에 추가하면서
        // 연산자를 만났을 때 문자스택의 길이가 2면 연산 수행 후 결과를 스택에 다시 추가
        // 그 외엔 문자, 연산 스택에 계속 추가


    }
}
