import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            String groupA = input[0];
            String groupB = input[1];
            String answer = solution(groupA, groupB);
            System.out.println(answer);
        }
    }

    private static String solution(String groupA, String groupB) {
        StringBuilder sb = new StringBuilder();
        sb.append("Distances: ");
        for (int i = 0; i < groupA.length(); i++) {
            char gA = groupA.charAt(i);
            char gB = groupB.charAt(i);
            int result = calc(gA, gB);
            sb.append(result).append(" ");
        }
        return sb.toString();
    }

    private static int calc(char gA, char gB) {
        int x = gA - 64;
        int y = gB - 64;
        if (y >= x) {
            return y - x;
        }
        return (y + 26) - x;
    }

}
