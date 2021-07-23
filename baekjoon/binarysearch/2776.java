import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] str1 = br.readLine().split(" ");
            int[] arr1 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = Integer.parseInt(str1[j]);
            }

            int m = Integer.parseInt(br.readLine());
            String[] str2 = br.readLine().split(" ");
            int[] arr2 = new int[m];
            for (int j = 0; j < m; j++) {
                arr2[j] = Integer.parseInt(str2[j]);
            }

            Arrays.sort(arr1);

            for (int j = 0; j < m; j++) {
                sb.append(binarySearch(arr1, arr2[j])).append("\n");
            }
        } // end for

        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }
}
