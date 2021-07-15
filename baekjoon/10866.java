import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> linkedList = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front":
                    linkedList.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    linkedList.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (linkedList.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(linkedList.removeFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if (linkedList.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(linkedList.removeLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(linkedList.size()).append("\n");
                    break;
                case "empty":
                    if (linkedList.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (linkedList.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(linkedList.getFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (linkedList.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(linkedList.getLast()).append("\n");
                    }
                    break;
            } // end switch - case
        } // end for

        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);

    }
}
