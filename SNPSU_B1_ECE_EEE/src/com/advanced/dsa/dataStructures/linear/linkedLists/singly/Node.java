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
    public void removeFirst(){
        if (head==null){
            System.out.println("Empty list. Can't remove head.");
            return;
        }
        // Single element or multiple elements
        // For a single element -> if deleted -> head becomes null
        // for multiple elements-> if deleted -> head is the next node
        head=this.head.next;
        size--; // reduce the size by one node
    }
    public void removeLast(){
        if (head==null){
            System.out.println("Empty list. Can't remove head.");
            return;
        }
        if (head.next==null){
            head=null;
            size--;
            return;
        }
        // For multiple elements we need to fing the secondLast & Last
        // We se a two pointer approach
        Node secondLast=head;
        Node last=head.next;
        while (last.next!=null){
            secondLast=last;
            last=last.next;
        }
        //After this loop is over we will be at the correct
        //Second last & last nodes respectivel
        secondLast.next=null;
        // The last node will be cleared by the JVM
        size--;
    }
public void deleteTargetNode(String target){
    if (head==null){
        System.out.println("Empty list. Can't remove target.");
        return;
    }
    // Case where head is the target node
    if (head.data.equals(target)){
        head=head.next; //Move the head to the next node
        size--;
        return;
    }
    //Case where the target is anywhere else in the list
    //Two Pointer Approach
    Node prev=null;
    Node curr = head;
    while (curr!=null && !curr.data.equals(target)){
        prev=curr;
        curr=curr.next;
    }
    if (curr==null){
        System.out.println("Target:"+ target + " not found in the List");
    }
    //If foung, make adjustment to nodes and pointers
    prev.next=curr.next;
    size--;
}
    public static void main(String[] args) {
        LL sll=new LL();
        sll.addFirst("ECE");
        sll.addFirst("&");
        sll.addFirst("EEE");
        sll.addFirst("Semester");
        sll.addFirst("6th");
        sll.addFirst("is");
        sll.addFirst("This");
        sll.printList();
        sll.addLast("Java");
        sll.addLast("DSA");
        sll.addLast("Training");
        sll.addLast("By TriPillar Solutions");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.deleteTargetNode("DSA");
        sll.printList();

    }
}
