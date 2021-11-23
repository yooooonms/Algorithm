import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            int cnt = 0;
            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean flag = true;
                for (int[] q : queue) {
                    if (q[1] > front[1]) {
                        flag = false;
                    }
                }
                if (flag) {
                    cnt = cnt + 1;
                    if (front[0] == m) {
                        break;
                    }
                } else {
                    queue.add(front);
                }
            }
            sb.append(cnt).append("\n");
        } // end while
        System.out.print(sb);
    }

}
