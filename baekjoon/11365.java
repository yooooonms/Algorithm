import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final StringBuilder sb = new StringBuilder();

    private static String decode(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("END")) {
                break;
            }
            System.out.println(decode(input));
            sb.setLength(0);
        }
    }
}
