import java.io.*;

class Queue {
    private static class Node {
        public int data;
        public Node prev;

        public Node(int data) {
            this.data = data;
        }
    } // node

    private Node rear;
    private Node front;
    private int size;

    public boolean isEmpty() {
        return front == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.prev = newNode;
        }
        rear = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        Node removed = front;
        front = removed.prev;

        if (front == null) {
            rear = null;
        }
        int temp = removed.data;
        removed = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public int back() {
        if (isEmpty()) {
            return -1;
        }
        return rear.data;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue queue = new Queue();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    queue.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
            }
        } // end for
        
        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.print(sb);
    }
    
}
