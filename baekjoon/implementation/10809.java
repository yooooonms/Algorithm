import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 97;
            if (arr[index] != -1) {
                continue;
            }
            arr[index] = i;
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }
}
