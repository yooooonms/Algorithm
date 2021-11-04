import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {1, -1, 0, 0};

    private static int solution(int[][] map, boolean[][] visited, int n, int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;
        int cnt = 0;
        while (!queue.isEmpty()) {
            Point now = queue.poll();
            cnt = cnt + 1;
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new Point(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean[][] visited = new boolean[n][n];
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        int danzi = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    danzi = danzi + 1;
                    int cnt = solution(map, visited, n, i, j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);
        bw.write(String.valueOf(danzi + "\n"));
        for (int value : list) {
            bw.write(String.valueOf(value + "\n"));
        }
        bw.flush();
        bw.close();
    }
}
