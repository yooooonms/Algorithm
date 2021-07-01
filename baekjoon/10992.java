import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        // 첫 줄
        for (int i = 0; i < num - 1; i++) {
            bw.write(" ");
        }
        bw.write("*\n");

        // 중간
        for (int i = 0; i < num - 2; i++) {
            // 앞 공백
            for (int j = 0; j < num - i - 2; j++) {
                bw.write(" ");
            }
            bw.write("*");

            // 중간 공백
            for (int j = 0; j < i * 2 + 1; j++) {
                bw.write(" ");
            }
            bw.write("*\n");
        }


        // 마지막 줄
        if (num != 1) {
            for (int i = 0; i < num * 2 - 1; i++) {
                bw.write("*");
            }
        }

        bw.flush();
        bw.close();
    }
}