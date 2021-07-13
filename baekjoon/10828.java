import java.io.*;

class Stack {
    private static class Node {
        public int data;
        public Node prev;

        public Node(int data, Node prev) {
            this.data = data;
            this.prev = prev;
        }
    } // node

    private Node top;

    private int size = 0;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        top = new Node(data, top);
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int temp = top.data;
        Node remove = top;
        top = remove.prev;
        remove = null;
        size--;
        return temp;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }
    
    public int size() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack stack = new Stack();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push")) {
                stack.push(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                sb.append(stack.pop()).append("\n");
            } else if (cmd[0].equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (cmd[0].equals("top")) {
                sb.append(stack.top()).append("\n");
            } else if (cmd[0].equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        } // end for
        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);

    }
}
