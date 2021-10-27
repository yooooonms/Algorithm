import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'A') {
                sb.append('X');
            } else if (c == 'B') {
                sb.append('Y');
            } else if (c == 'C') {
                sb.append('Z');
            } else {
                sb.append((char) (c - 3));
            }
        } // end for
        System.out.print(sb);
    }
}
