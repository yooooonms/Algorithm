import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};

    public static String solution(String[] str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length;

        for (int i = 0; i < length; i++) {
            int value = Integer.parseInt(str[i]);
            if (i == 0 && value < 4) {
                if (value < 2) {
                    sb.append(arr[value].substring(2));
                } else {
                    sb.append(arr[value].substring(1));
                }
            } else {
                sb.append(arr[value]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        System.out.println(solution(str));
    }
}
