import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int MAX = 500_000;

    private static boolean[] prime = new boolean[MAX + 1];

    public static void eratosthenes() {
        for (int i = 2; i <= MAX; i++) {
            prime[i] = true;
        }
        int end = (int) Math.sqrt(MAX);
        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j = j + i) {
                    prime[j] = false;
                } // end inner for
            }
        } // end outer for
    }

    public static int getK(int num) {
        int idx = 0;
        int k = 0;
        for (int i = 2; i <= MAX; i++) {
            if (prime[i]) {
                idx++;
                k = i;
            }
            if (idx == num) {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        eratosthenes();

        int k = getK(num);
        System.out.print(k);
    }

}
