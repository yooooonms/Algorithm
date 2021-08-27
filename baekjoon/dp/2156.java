import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.print(wine[1]);
            return;
        } else if (n == 2) {
            System.out.print(wine[1] + wine[2]);
            return;
        }

        dp[1] = wine[1];
        dp[2] = wine[1] + wine[2];
        int max = 0;
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]);
            dp[i] = Math.max(dp[i - 1], dp[i]);
            max = Math.max(max, dp[i]);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        br.close();
    }

}
