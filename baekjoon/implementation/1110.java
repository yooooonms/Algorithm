import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int tmp = n;
        int cnt = 0;
        int sum = 0;

        do {
            int ten = tmp / 10;
            int one = tmp % 10;
            sum = ten + one;
            tmp = one * 10 + sum % 10;
            cnt++;
        } while(tmp!=n);

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}
