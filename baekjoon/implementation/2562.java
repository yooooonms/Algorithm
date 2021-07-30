import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 1; i <= 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;
        int max = 0;
        for (int i = 1; i <= 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.print(idx);
    }
}
