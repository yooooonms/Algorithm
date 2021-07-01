import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
                if (j < i + 1) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}