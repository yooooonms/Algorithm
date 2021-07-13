import java.io.*;
import java.util.Stack;

public class Main {

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();

        if (c[0] == ')') {
            return "NO";
        }

        int len = c.length;
        boolean flag = true;
        for (char value : c) {
            if (value == '(') {
                stack.push(value);
            } else {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                stack.pop();
            }
        } // end for

        return flag && stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            sb.append(solution(str)).append("\n");
        } // end for

        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }

}
