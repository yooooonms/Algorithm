import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int digit = 0;
        int temp = 1;
        int len = 10;
        for (int i = 1; i <= num; i++) {
            if (i % len == 0) {
                temp = temp + 1;
                len = len * 10;
            }
            digit = digit + temp;
        }

        bw.write(String.valueOf(digit));
        bw.flush();
        bw.close();
        br.close();
    }
}
