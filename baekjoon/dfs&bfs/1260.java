import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void dfs(boolean[] visited, List<ArrayList<Integer>> list, int v) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;
        sb.append(v).append(" ");
        boolean flag = false;
        while (!stack.isEmpty()) {
            int peek = stack.peek();
            flag = false;
            for (int num : list.get(peek)) {
                if (!visited[num]) {
                    stack.push(num);
                    visited[num] = true;
                    flag = true;
                    sb.append(num).append(" ");
                    break;
                }
            }
            if (!flag) {
                stack.pop();
            }
        } // end while
        System.out.println(sb);
    }

    public static void bfs(boolean[] visited, List<ArrayList<Integer>> list, int v) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            v = queue.poll();
            sb.append(v).append(" ");
            for (int num : list.get(v)) {
                if (!visited[num]) {
                    queue.add(num);
                    visited[num] = true;
                }
            }
        } // end while
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n + 1];
        List<ArrayList<Integer>> list = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            list.get(v1).add(v2);
            list.get(v2).add(v1);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list.get(i));
        }

        dfs(visited, list, v);
        Arrays.fill(visited, false);
        bfs(visited, list, v);
    }
}
