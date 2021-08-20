import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static void eratosthenes(boolean[] prime, int max) {
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

    private static boolean isPalindrome(int num) {
        if (num < 10) {
            return true;
        }
        String str = String.valueOf(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(len - (i + 1));
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[b + 1];

        eratosthenes(prime, b);

        for (int i = a; i <= b; i++) {
            if (prime[i]) {
                if (isPalindrome(i)) {
                    sb.append(i).append("\n");
                }
            }
        }
        sb.append(-1);
        System.out.print(sb);
    }
}
