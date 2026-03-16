package com.advanced.dsa.dataStructures.linear.linkedLists.singly;
class LL{
    Node head; // Starting node of the list  -> only access point
    private int size;
    LL(){
        size=0; // Initially list is empty, so size is zero.
    }
    public class Node {
        String data; // The data of the node -> String type
        Node next; // The address of the next node -> Node type
        Node(String data){
            this.data=data;
            this.next=null; // Initially node is connected to null
            size++; // Increment the size as a noe is created
        }
    }
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addLast(String data){
        // Create a new Node
        Node newNode= new Node(data);
        // If the list is empty - head will point to null
        if (head == null) {
            head=newNode; // The new node become the head of the list
            return;
        }
        // For multiple elements - we need to find the last(tail) of node
        Node last= head;
        while (last.next!= null){
            last=last.next;
        }
        //After this loop is over we will be standing @ Last node
        // Point the last node next to the newNode
        last.next=newNode;
    }
    public void addFirst(String data){
    // Create a new Node
        Node newNode= new Node(data);
        // Point the next node of new npde to head
        newNode.next=head;
        // This newNode is the new head of the List
        // Point the head to this new node
        head=newNode;
    }
    public static void main(String[] args) {
        LL sll=new LL();
        sll.addFirst("ECE");
        sll.addFirst("&");
        sll.addFirst("EEE");
        sll.addFirst("Semester");
        sll.addFirst("6th");
        sll.addFirst("This is");
        sll.printList();
        sll.addLast("Java");
        sll.addLast("DSA");
        sll.addLast("Training");
        sll.addLast("By TriPillar Solutions");
        sll.printList();

    }
}
