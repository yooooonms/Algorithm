import java.io.*;
import java.util.Arrays;

public class Main {
    public static void eratosthenes(boolean[] prime, int max) {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        int end = (int) Math.sqrt(max);
        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= max; j = j + i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static boolean isPalindrome(int n) {
        String num = String.valueOf(n);
        int len = num.length();

        for (int i = 0; i < (len / 2); i++) {
            char c1 = num.charAt(i);
            char c2 = num.charAt(len - (i + 1));
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 0;
        int max = 1_003_001;
        boolean[] prime = new boolean[max + 1];

        eratosthenes(prime, max);

        int n = Integer.parseInt(br.readLine());
        for (int i = n; i <= max; i++) {
            if (prime[i]) {
                if (isPalindrome(i)) {
                    ans = i;
                    break;
                }
            }
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}
