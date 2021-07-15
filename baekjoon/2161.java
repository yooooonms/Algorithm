import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> list = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());

        // init
        for (int i = 1; i <= num; i++) {
            list.add(i);
        } // end for

        while (list.size() != 1) {
            sb.append(list.removeFirst()).append(" ");  // drop card
            list.addLast(list.removeFirst());           // add card top to bottom
        } // end while

        sb.append(list.peek());
        System.out.print(sb);
    }
}
