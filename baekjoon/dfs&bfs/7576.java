import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static final int[] dx = {0, 0, -1, 1};
    public static final int[] dy = {1, -1, 0, 0};

    private static int bfs(Queue<Point> queue, int[][] tomato, int n, int m) {
        int day = 0;
        while (!queue.isEmpty()) {
            Point now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (tomato[nx][ny] == 0) {
                        queue.offer(new Point(nx, ny));
                        tomato[nx][ny] = tomato[now.x][now.y] + 1;
                        day = Math.max(day, tomato[nx][ny]);
                    }
                }
            }
        }
        if (!checkTomatoBox(tomato, n, m)) {
            return -1;
        } else if (day == 0) {
            return 0;
        }
        return day - 1;
    }

    private static boolean checkTomatoBox(int[][] tomato, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Point> queue = new LinkedList<>();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] tomato = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(input[j]);
                if (tomato[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        int answer = bfs(queue, tomato, n, m);
        System.out.print(answer);
    }
}
