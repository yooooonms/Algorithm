import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int cntA = 0;
        int cntB = 0;
        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            if (c == 'A') {
                cntA = cntA + 1;
            } else {
                cntB = cntB + 1;
            }
        }
        if (cntA > cntB) {
            System.out.print("A");
        } else if (cntA < cntB) {
            System.out.print("B");
        } else {
            System.out.println("Tie");
        }
    }

}
