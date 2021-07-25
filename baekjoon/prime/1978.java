import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = 1000;
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] prime = new boolean[num + 1];

        prime[0] = prime[1] = false;
        for (int i = 2; i <= num; i++) {
            prime[i] = true;
        }

        int end = (int) Math.sqrt(num);
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= num; j = j + i) {
                    prime[j] = false;
                }
            }
        } // end for

        int cnt = 0;
        for (int i = 0; i < size; i++) {
            if (prime[arr[i]]) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
