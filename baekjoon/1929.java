import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] eratos(int n) {
        boolean[] arr = new boolean[n + 1];

        arr[0] = false;
        arr[1] = false;
        for (int i = 2 ; i <= n; i++) {
            arr[i] = true;
        }

        int end = (int)Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = false;
                }
            } // end if
        } // end for

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] eratos = eratos(n);

        for (int i = m; i <= n; i++) {
            if (eratos[i]) {
                sb.append(i).append("\n");
            } // end if
        } // end for

        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }
}
