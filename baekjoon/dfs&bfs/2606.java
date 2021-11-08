import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static StringTokenizer st;

    private static void solution(int[][] map, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        int n = map.length - 1;
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int t = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (map[t][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        int cnt = 0;
        for (boolean value : visited) {
            if (value) {
                cnt = cnt + 1;
            }
        }
        System.out.print(cnt - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());
        int[][] map = new int[computer + 1][computer + 1];
        boolean[] visited = new boolean[computer + 1];
        for (int i = 0; i < pair; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            map[v1][v2] = 1;
            map[v2][v1] = 1;
        }
        solution(map, visited);
    }
}
