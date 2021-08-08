import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            int total = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                total = total + Integer.parseInt(st.nextToken());
            }
            if (total == 4) {
                sb.append("E").append("\n");
            } else if (total == 3) {
                sb.append("A").append("\n");
            } else if (total == 2) {
                sb.append("B").append("\n");
            } else if (total == 1) {
                sb.append("C").append("\n");
            } else {
                sb.append("D").append("\n");
            }
        } // end for

        System.out.print(sb);
    }
}
