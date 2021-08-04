import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int answer = 0;

        for (int i = A; i <= B; i++) {
            int N = prime_factorization(i);
            if (prime_num(N)) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    public static int prime_factorization(int N) {
        int count = 0;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                count++;
                N /= i;
            }
        }

        if (N != 1) {
            count++;
        }
        return count;
    }

    public static boolean prime_num(int M) {
        if (M < 2) {
            return false;
        }
        if (M == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(M); i++) {

            if (M % i == 0) {
                return false;
            }
        }
        return true;
    }
  
}
