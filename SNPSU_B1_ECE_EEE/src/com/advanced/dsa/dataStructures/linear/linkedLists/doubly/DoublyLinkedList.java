package com.advanced.dsa.dataStructures.linear.linkedLists.doubly;

import java.util.Scanner;

class Dnode{
    int data;
    Dnode next;
    Dnode prev;
    Dnode(int data){
        this.data=data;
    }
}
public class DoublyLinkedList {
    static Dnode head = null; //This means list is empty

    static void insert(int data) {
        Dnode newNode = new Dnode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Dnode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp.next;
    }
    static void display(){
        Dnode temp=head;
        System.out.print("null <--> ");
        while (temp!=null){
            System.out.print(temp.data + " <--> ");
            temp=temp.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of nodes");
        int n =  sc.nextInt();
        System.out.println("Enter the" +  n + " nodes ");
        for (int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        display();
    }
}