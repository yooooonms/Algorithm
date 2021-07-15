import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        } // end for

        sb.append("<");
        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                sb.append(queue.remove()).append(">");
                break;
            }
            for (int i = 0; i < k - 1; i++) {
                int value = queue.remove();
                queue.add(value);
            } // end inner for
            sb.append(queue.peek()).append(",").append(" ");
            queue.remove();
        } // end while

        System.out.print(sb);
    }

}
