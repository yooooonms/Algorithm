import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (true) {
            if (n % 5 == 0) {
                cnt = cnt + n / 5;
                break;
            } else if (n < 0) {
                cnt = -1;
                break;
            }
            n = n - 3;
            cnt = cnt + 1;
        } // end while

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
