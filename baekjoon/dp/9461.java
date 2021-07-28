import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long[] fibo = new long[101];

    public static void solution() {
        fibo[0] = 0;
        fibo[1] = fibo[2] = fibo[3] = 1;
        for (int i = 4; i <= 100; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 3];
        } // end for
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        solution();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(fibo[n]).append("\n");
        } // end for

        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }
}
