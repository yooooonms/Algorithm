import java.io.*;

public class Main {

    public static int calc(String str) {
        int result = 0;
        int point = 1;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c == 'O') {
                result = result + point;
                point++;
            } else if (c == 'X') {
                point = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            int ans = calc(str);
            bw.write(String.valueOf(ans));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
