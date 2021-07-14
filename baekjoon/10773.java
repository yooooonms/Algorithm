import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num; i++) {
            int e = Integer.parseInt(br.readLine());
            if (e == 0) {
                stack.pop();
                continue;
            }
            stack.push(e);
        } // end for

        while(!stack.isEmpty()) {
            ans = ans + stack.pop();
        }

        System.out.print(ans);

    }
}
