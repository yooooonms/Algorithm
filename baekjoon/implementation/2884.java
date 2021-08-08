import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m < 45) {
            m = 60 - 45 + m;
            if (h == 0) {
                sb.append(23).append(" ").append(m);
            } else {
                sb.append(h - 1).append(" ").append(m);
            }
        } else {
            sb.append(h).append(" ").append(m - 45);
        }

        System.out.print(sb);
    }
}
