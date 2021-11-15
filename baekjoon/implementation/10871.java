import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            if (num < x) {
                sb.append(num).append(" ");
            }
        }
        System.out.print(sb);
    }

}
