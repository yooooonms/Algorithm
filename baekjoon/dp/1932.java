import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] num = new int[501][501];
        int[][] dp = new int[501][501];

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        } // end for
        
        dp[1][1] = num[1][1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    dp[i][j] = dp[i - 1][j] + num[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + num[i][j];
                }
            } // end inner for
        } // end outer for

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (dp[n][i] > max) {
                max = dp[n][i];
            }
        }

        System.out.print(max);
    }

}
