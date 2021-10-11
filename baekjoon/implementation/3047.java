import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String str = br.readLine();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int num = arr[str.charAt(i) - 65];
            sb.append(num).append(" ");
        }
        sb.deleteCharAt(sb.lastIndexOf(" "));

        System.out.print(sb);
    }
}
