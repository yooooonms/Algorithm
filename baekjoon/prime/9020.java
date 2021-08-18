import java.io.*;
import java.util.Arrays;

public class Main {

    private static final int MAX = 10_000;

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

        int t = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[MAX + 1];
        eratosthenes(prime);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 2;
            int b = n / 2;

            while (true) {
                if (prime[a] && prime[b]) {
                    sb.append(a).append(" ").append(b).append("\n");
                    break;
                }
                a = a - 1;
                b = b + 1;
            }
            bw.write(sb.toString());
            sb.setLength(0);
        } // end for
        bw.flush();
        bw.close();
    }

}
