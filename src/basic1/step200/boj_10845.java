package basic1.step200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 큐
public class boj_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.valueOf(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
