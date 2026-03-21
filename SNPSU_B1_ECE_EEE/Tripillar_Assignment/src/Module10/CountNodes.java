package Module10;

public class CountNodes {
    static Node head;

    static int count() {
        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println(count()); // 3
    }
}