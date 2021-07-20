import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean isExists(int[] arr, int num) {
        boolean flag = false;
        int mid;
        int left = 0;
        int rignt = arr.length - 1;
        while (rignt >= left) {
            mid = (rignt + left) / 2;
            if (num == arr[mid]) {
                flag = true;
                break;
            }

            if (num < arr[mid]) {
                rignt = mid - 1;
            } else {
                left = mid + 1;
            }

        } // end while
        return flag;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] num = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < m; i++) {
            if (isExists(arr, num[i])) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append("\n");
        } // end for

        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }

}
