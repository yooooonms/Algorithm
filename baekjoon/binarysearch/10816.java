import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringTokenizer st;

        int[] positive = new int[10_000_001];
        int[] negative = new int[10_000_001];

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            if (arr1[i] < 0) {
                negative[arr1[i] * -1] = negative[arr1[i] * -1] + 1;
            } else {
                positive[arr1[i]] = positive[arr1[i]] + 1;
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            if (arr2[i] < 0) {
                answer.append(negative[arr2[i] * -1]).append(" ");
            } else {
                answer.append(positive[arr2[i]]).append(" ");
            }
        } // end for

        System.out.print(answer);
    }

}
