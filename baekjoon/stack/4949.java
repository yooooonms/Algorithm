import java.io.*;
import java.util.Stack;

public class Main {

    private static String solve(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            String result = solve(input);
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

}
