import java.io.*;
import java.util.Arrays;

public class Main {

    private static final int MAX = 1_000_000;

    public static void eratosthenes(boolean[] prime) {
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        int end = (int) Math.sqrt(MAX);
        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j = j + i) {
                    prime[j] = false;
                }
            }
        } // end for
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[MAX + 1];

        eratosthenes(prime);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;
            int a = num / 2;
            int b = num / 2;
            while (a != 0) {
                if (prime[a] && prime[b]) {
                    cnt++;
                }
                a = a - 1;
                b = b + 1;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }

}
