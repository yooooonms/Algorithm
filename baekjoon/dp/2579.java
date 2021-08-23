import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] stair = new int[size + 1];
        int[] dp = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        if (size == 1) {
            System.out.print(stair[1]);
            return;
        }

        if (size == 2) {
            System.out.print(stair[1] + stair[2]);
            return;
        }

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        for (int i = 3; i <= size; i++) {
            dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
        }

        bw.write(String.valueOf(dp[size]));
        bw.flush();
        bw.close();
    }
}
