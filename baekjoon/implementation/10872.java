import java.io.*;

public class Main {

    public static int fibo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fibo(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int ans = fibo(n);
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}
