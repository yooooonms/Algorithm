import java.io.*;

public class Main {
    public static void solution(int[] fibo0, int[] fibo1, int num) {
        StringBuilder sb = new StringBuilder();
        fibo0[0] = 1;
        fibo0[1] = 0;
        fibo1[0] = 0;
        fibo1[1] = 1;
        if (num == 0) {
            sb.append(fibo0[0]).append(" ").append(fibo1[0]);
        } else if (num == 1) {
            sb.append(fibo0[1]).append(" ").append(fibo1[1]);
        } else {
            for (int i = 2; i <= num; i++) {
                fibo0[i] = fibo0[i - 1] + fibo0[i - 2];
                fibo1[i] = fibo1[i - 1] + fibo1[i - 2];
            }
            sb.append(fibo0[num]).append(" ").append(fibo1[num]);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int[] fibo0 = new int[41];
        int[] fibo1 = new int[41];

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            solution(fibo0, fibo1, num);
        }
    }

}
