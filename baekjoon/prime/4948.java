import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int MAX = 246_912;
    public static boolean[] prime = new boolean[MAX + 1];

    public static void eratosthenes() {
        for (int i = 2; i <= MAX; i++) {
            prime[i] = true;
        }
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
        StringBuilder sb = new StringBuilder();

        eratosthenes();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            int end = 2 * num;
            int cnt = 0;
            if (num == 0) {
                break;
            }
            for (int i = num + 1; i <= end; i++) {
                if (prime[i]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        } // end while
        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }
}
