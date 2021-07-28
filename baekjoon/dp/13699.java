import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.print(1);
            return;
        }

        long[] t = new long[n + 1];

        t[0] = 1;
        t[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                t[i] = t[i] + (t[j] * t[i - j - 1]);
            }
        } // end for

        System.out.print(t[n]);
    }
}
