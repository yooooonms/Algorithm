import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = 0;
            if (c > 64 && c < 91) {
                index = c - 65;
            } else {
                index = c - 97;
            }
            arr[index] = arr[index] + 1;
        } // end for
        int max = -1;
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        } // end for
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                cnt++;
            }
        } // end for
        if (cnt == 1) {
            System.out.print((char) (idx + 'A'));
        } else {
            System.out.print("?");
        }
    }
}
