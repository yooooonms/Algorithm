import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = 987654321;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[m + 1];

        for (int i = 2; i <= m; i++) {
            prime[i] = true;
        }

        int end = (int) Math.sqrt(m);
        for (int i = 2; i <= end; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= m; j = j + i) {
                    prime[j] = false;
                } // end inner for
            }
        } // end outer for

        for (int i = n; i <= m; i++) {
            if (prime[i]) {
                min = Math.min(i, min);
                sum = sum + i;
            }
        } // end for

        if (sum == 0) {
            System.out.print(-1);
            return;
        }

        System.out.println(sum);
        System.out.print(min);
    }

}
