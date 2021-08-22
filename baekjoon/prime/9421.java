import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void eratosthenes(boolean[] prime, int n) {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1_000_001];
        eratosthenes(prime, 1_000_000);

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                Set<Integer> set = new HashSet<>();
                boolean flag = false;
                int temp = i;
                while (true) {
                    int sum = 0;
                    while (temp > 0) {
                        sum = sum + (temp % 10) * (temp % 10);
                        temp = temp / 10;
                    }
                    if (sum == 1) {
                        flag = true;
                        break;
                    }
                    if (!set.contains(sum)) {
                        set.add(sum);
                        temp = sum;
                    } else {
                        break;
                    }
                } // end while
                if (flag) {
                    sb.append(i).append("\n");
                }
            } // end if
        } // end for

        System.out.print(sb);
    }

}
