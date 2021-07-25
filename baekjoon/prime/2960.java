import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        int cnt = 0;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            for (int j = i; j <= n; j = j + i) {
                if (!prime[j]) {
                    continue;
                }
                prime[j] = false;
                cnt++;
                if (cnt == k) {
                    System.out.println(j);
                    return;
                }
            }
        } // end for
    }
    
}
