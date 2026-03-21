package Module10;

public class InsertBeginning {
    static Node head;

    static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtBeginning(3);
        insertAtBeginning(2);
        insertAtBeginning(1);

        display();
    }
}