import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 1;
        for (int i = 0; i < 3; i++) {
            int num =  Integer.parseInt(br.readLine());
            total = total * num;
        }

        int[] nums = new int[10];

        String[] str = String.valueOf(total).split("");

        for (String s : str) {
            int num = Integer.parseInt(s);
            nums[num]++;
        }

        for (int i : nums) {
            System.out.println(i);
        }

    }
}
