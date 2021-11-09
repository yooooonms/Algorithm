import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static char conversion(char c) {
        if (c > 64 && c < 91) {
            c = (char) (c + 13);
            if (c > 90) {
                c = (char) (c - 26);
            }
        } else {
            c = (char) (c + 13);
            if (c > 122) {
                c = (char) (c - 26);
            }
        }
        return c;
    }

    private static String rot13(String input) {
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c == 32) {
                sb.append(" ");
                continue;
            } else if (c > 47 && c < 58) {
                sb.append(c);
                continue;
            }
            c = conversion(c);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = rot13(input);
        System.out.print(answer);
    }
}
