import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Integer> createList(int input) {
        List<Integer> list = new ArrayList<>();

        while (input > 0) {
            list.add(input % 10);
            input = input / 10;
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        List<Integer> list = createList(input);

        Collections.sort(list, Collections.reverseOrder());

        for (int value : list) {
            System.out.print(value);
        }

    }
}
