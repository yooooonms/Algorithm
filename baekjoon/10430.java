import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        bw.write(((a + b) % c) + "\n");
        bw.write((((a % c) + (b % c)) % c) + "\n");
        bw.write(((a * b) % c) + "\n");
        bw.write((((a % c) * (b % c)) % c) + "\n");
        bw.flush();
        bw.close();
    }
}
