import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<String> input = new Stack<>();
        Stack<String> output = new Stack<>();

        // 초기 편집기에 입력된 문자열
        String[] str = br.readLine().split("");

        for (String item : str) {
            input.push(item);
        } // end for

        // 명령어 개수
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            switch (str[0]) {
                case "L":
                    if (!input.isEmpty()) {
                        output.push(input.pop());
                    }
                    break;
                case "D":
                    if (!output.isEmpty()) {
                        input.push(output.pop());
                    }
                    break;
                case "B":
                    if (!input.isEmpty()) {
                        input.pop();
                    }
                    break;
                case "P":
                    input.push(str[1]);
                    break;
            } // end switch
        } // end for

        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        while (!output.isEmpty()) {
            sb.append(output.pop());
        }

        System.out.print(sb);

    }
}
