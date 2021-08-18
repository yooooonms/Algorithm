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

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            int start = 3;
            int end = num - start;
            while (true) {
                if (prime[start] && prime[end]) {
                    if (start + end == num) {
                        sb.append(num).append(" = ").append(start).append(" + ").append(end).append("\n");
                        break;
                    }
                }
                start = start + 1;
                end = num - start;
            }
            if (start > end) {
                sb.append("Goldbach's conjecture is wrong.");
            }
            bw.write(sb.toString());
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
    }

}
