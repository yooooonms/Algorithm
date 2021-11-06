import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean solution(String input) {
        int len = input.length();
        for (int s = 0, e = len - 1; s < len / 2; s++, e--) {
            char start = input.charAt(s);
            char end = input.charAt(e);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            if (solution(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
