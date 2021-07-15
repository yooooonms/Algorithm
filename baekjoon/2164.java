import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    private static LinkedList<Integer> list = new LinkedList<>();

    public static void dropCard() {
        list.removeFirst();
    }

    public static void addCardTopToBottom() {
        list.addLast(list.removeFirst());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            list.add(i);
        } // end for

        while (list.size() != 1) {
            dropCard();
            addCardTopToBottom();
        } // end while

        System.out.print(list.peek());
    }
}
