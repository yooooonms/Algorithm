import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String[] s = input[1].split("");
            for (String value : s) {
                sb.append(String.valueOf(value).repeat(Math.max(0, r)));
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }

}
