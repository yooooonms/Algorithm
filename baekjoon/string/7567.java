import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char start = input.charAt(0);
        int answer = 10;
        for (int i = 1; i < input.length(); i++) {
            char next = input.charAt(i);
            if (start == next) {
                answer = answer + 5;
            } else {
                answer = answer + 10;
            }
            start = next;
        }
        System.out.print(answer);
    }
}
