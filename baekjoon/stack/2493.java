import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    static class Tower {
        int height;
        int position;

        public Tower(int height, int position) {
            this.height = height;
            this.position = position;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<Tower> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(st.nextToken());
            if (stack.isEmpty()) {
                stack.push(new Tower(height, i));
                sb.append(0).append(" ");
                continue;
            }
            while (!stack.isEmpty()) {
                Tower peek = stack.peek();
                if (peek.height >= height) {
                    sb.append(peek.position).append(" ");
                    break;
                } else {
                    stack.pop();
                }
            } // end while
            if (stack.isEmpty()) {
                sb.append(0).append(" ");
            }
            stack.push(new Tower(height, i));
        } // end for


        sb.deleteCharAt(sb.lastIndexOf(" "));
        System.out.print(sb);
    }

}
