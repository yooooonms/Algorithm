import java.io.*;

public class Main {

    public static int checkPalindrome(String[] str) {
        for (int s = 0, e = str.length - 1; s < str.length / 2; s++, e--) {
            String strA = str[s];
            String strB = str[e];
            if (!strA.equals(strB)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        String[] str = br.readLine().split("");

        int ans = checkPalindrome(str);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}
