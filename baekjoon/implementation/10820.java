import java.io.*;

public class Main {

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        int length = input.length();

        int blank = 0, upper = 0, lower = 0, number = 0;

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c == 32) {
                blank = blank + 1;
            } else if (c > 47 && c < 58) {
                number = number + 1;
            } else if (c > 64 && c < 91) {
                upper = upper + 1;
            } else if (c > 96 && c < 123) {
                lower = lower + 1;
            }
        }

        sb.append(lower).append(" ").append(upper).append(" ").append(number).append(" ").append(blank);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        while ((input = br.readLine()) != null) {
            String ans = solution(input);
            bw.write(ans + "\n");
        } // end while
        bw.flush();
        bw.close();
    }

}
