import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int solution(String input, int index) {
        int cnt = 0;
        if (index == 0 || index == 2 || index == 4 || index == 6) {
            for (int i = 0; i < 8; i = i + 2) {
                char c = input.charAt(i);
                if (c == 'F') {
                    cnt = cnt + 1;
                }
            }
        } else {
            for (int i = 1; i < 8; i = i + 2) {
                char c = input.charAt(i);
                if (c == 'F') {
                    cnt = cnt + 1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            answer = answer + solution(input, i);
        }

        System.out.print(answer);
    }

}
