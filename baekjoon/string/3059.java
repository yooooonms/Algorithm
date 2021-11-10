import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int solution(String input) {
        boolean[] check = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            check[c - 65] = true;
        }
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if (!check[i]) {
                total = total + (65 + i);
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            int answer = solution(input);
            System.out.println(answer);
        }
    }

}
