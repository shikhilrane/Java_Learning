package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._02_LinkedList.Understanding_LL._01_Singly_LL;

// This is a working for LinkedList
// we actually dont't use this type of think to create LinkedList

import java.util.LinkedList;

public class SinglyLL {
    public static void main(String[] args) {
        Node node1 = new Node(10);    // node1 (Head node)
        Node node2 = new Node(20);    // node2
        Node node3 = new Node(30);    // node3
        Node node4 = new Node(40);    // node4
        Node node5 = new Node(50);    // node5


        // node1 (node1 ---> node2)
        System.out.println("Address of node 1 : " + node1);
        System.out.println("data in node 1 : " + node1.data);

        System.out.println("Node 1 before pointing next address : " + node1.next);
        node1.next = node2;
        System.out.println("Node 1 after pointing next address : " + node1.next);
        System.out.println("Data of next node : " + node1.next.data);


        System.out.println();

        // node2 (node2 ---> node3)
        System.out.println("Address of node 2 : " + node2);
        System.out.println("data in node 2 : " + node2.data);

        System.out.println("Node 2 before pointing next address : " + node2.next);
        node2.next = node3;
        System.out.println("Node 2 after pointing next address : " + node2.next);
        System.out.println("Data of next node : " + node2.next.data);

        System.out.println();

        // node3 (node3 ---> node4)
        System.out.println("Address of node 3 : " + node3);
        System.out.println("data in node 3 : " + node3.data);

        System.out.println("Node 3 before pointing next address : " + node3.next);
        node3.next = node4;
        System.out.println("Node 3 after pointing next address : " + node3.next);
        System.out.println("Data of next node : " + node3.next.data);

        System.out.println();

        // node4 (node4 ---> node5)
        System.out.println("Address of node 4 : " + node4);
        System.out.println("data in node 4 : " + node4.data);

        System.out.println("Node 4 before pointing next address : " + node4.next);
        node4.next = node5;
        System.out.println("Node 4 after pointing next address : " + node4.next);
        System.out.println("Data of next node : " + node4.next.data);

        System.out.println();

        // node5 (node5)
        System.out.println("Address of node 5 : " + node5);
        System.out.println("data in node 5 : " + node5.data);

        System.out.println("Node 5 pointing next address : " + node5.next);

        System.out.println();

        Node temp = node1;
        for (int i = 0; i < 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

        Node tempo = node1;
        while (tempo!=null) {
            System.out.print(tempo.data + " ");
            tempo = tempo.next;
        }

        System.out.println();

        displayLL(node1);

        System.out.println();

        displayLLrecusrively(node1);

        System.out.println();

        displayLLrecusrivelyReverse(node1);

        System.out.println();

        int lengthOfLL = lengthLL(node1);
        System.out.println(lengthOfLL);

        LinkedList ll = new LinkedList();
        ll.add(45);
        ll.add(node1);
        System.out.println(ll);

    }

    public static void displayLL(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayLLrecusrively(Node head){
        if(head==null) return;
        System.out.print(head.data + " ");
        displayLLrecusrively(head.next);
    }

    public static void displayLLrecusrivelyReverse(Node head){
        if(head==null) return;
        displayLLrecusrivelyReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static int lengthLL(Node node1){
        int count = 0;
        while (node1!=null) {
            count++;
            node1 = node1.next;
        }
        return count;
    }
}


class Node{
    public int data;    // data
    public Node previous; // address of previous node
    public Node next;   // address of previous node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}