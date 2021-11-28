package basic1.step200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 덱
public class boj_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        
        ArrayDeque<Integer> d = new ArrayDeque<>();
        
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    d.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    d.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(!d.isEmpty())
                        sb.append(d.pollFirst()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case "pop_back":
                    if(!d.isEmpty())
                        sb.append(d.pollLast()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(d.size()).append("\n");
                    break;
                case "empty":
                    sb.append(d.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if(!d.isEmpty())
                        sb.append(d.peekFirst()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                case "back":
                    if(!d.isEmpty())
                        sb.append(d.peekLast()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
            }
            
        }
        System.out.println(sb);
    }
}
