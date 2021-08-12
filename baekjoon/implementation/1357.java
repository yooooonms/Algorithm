import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int rev(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 10);
            num = num / 10;
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int answer = rev(rev(x) + rev(y));

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
