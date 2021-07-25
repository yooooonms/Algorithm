import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final int MAX = 1_000_000;

    public static boolean[] prime = new boolean[MAX + 1];

    public static long gcd(long a, long b) {
        long temp = 0;
        while (b > 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void eratosthenes() {
        for (int i = 2; i <= MAX; i++) {
            prime[i] = true;
        }

        int end = (int) Math.sqrt(MAX);
        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                for (int j = i + i; j <= MAX; j = j + i) {
                    prime[j] = false;
                } // end inner for
            }
        } // end outer for
    }

    public static boolean isPrimeExists(int n, int[] arr) {
        boolean exists = false;
        for (int i = 0; i < n; i++) {
            if (prime[arr[i]]) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        long ans = 1L;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        eratosthenes();

        if (!isPrimeExists(n, arr)) {
            System.out.print(-1);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (prime[arr[i]]) {
                ans = lcm(ans, arr[i]);
            }
        }

        System.out.print(ans);
    }

}
