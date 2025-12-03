package _23_Collection_Framework._01_Collection_Interface._01_List_Interface._02_LinkedList.Understanding_LL._02_Doubly_LL;

public class DoublyLL {
    public static void main(String[] args) {
        Node node1 = new Node(10);    // node1
        Node node2 = new Node(20);    // node2
        Node node3 = new Node(30);    // node3
        Node node4 = new Node(40);    // node4
        Node node5 = new Node(50);    // node5


        // node1 (node1 <---> node2)
        System.out.println("Address of node 1 : " + node1);
        System.out.println("data in node 1 : " + node1.data);

        System.out.println("Node 1 previous address : " + node1.previous);

        System.out.println("Node 1 before pointing next address : " + node1.next);
        node1.next = node2;
        System.out.println("Node 1 after pointing next address : " + node1.next);

        System.out.println();

        // node2 (node1 <---> node2 <---> node3)
        System.out.println("Address of node 2 : " + node2);
        System.out.println("data in node 1 : " + node2.data);

        System.out.println("Node 2 before pointing previous address : " + node2.previous);
        node2.previous = node1;
        System.out.println("Node 2 after pointing previous address : " + node2.previous);

        System.out.println("Node 2 before pointing next address : " + node2.next);
        node2.next = node3;
        System.out.println("Node 2 after pointing next address : " + node2.next);

        System.out.println();

        // node3 (node2 <---> node3 <---> node4)
        System.out.println("Address of node 3 : " + node3);
        System.out.println("data in node 1 : " + node3.data);

        System.out.println("Node 3 before pointing previous address : " + node3.previous);
        node3.previous = node2;
        System.out.println("Node 3 after pointing previous address : " + node3.previous);

        System.out.println("Node 3 before pointing next address : " + node3.next);
        node3.next = node4;
        System.out.println("Node 3 after pointing next address : " + node3.next);

        System.out.println();

        // node4 (node3 <---> node4 <---> node5)
        System.out.println("Address of node 4 : " + node4);
        System.out.println("data in node 1 : " + node4.data);

        System.out.println("Node 4 before pointing previous address : " + node4.previous);
        node4.previous = node3;
        System.out.println("Node 4 after pointing previous address : " + node4.previous);

        System.out.println("Node 4 before pointing next address : " + node4.next);
        node4.next = node5;
        System.out.println("Node 4 after pointing next address : " + node4.next);

        System.out.println();

        // node5 (node4 <---> node5)
        System.out.println("Address of node 5 : " + node5);
        System.out.println("data in node 1 : " + node5.data);

        System.out.println("Node 5 before pointing previous address : " + node5.previous);
        node5.previous = node4;
        System.out.println("Node 3 after pointing previous address : " + node5.previous);

        System.out.println("Node 5 before pointing next address : " + node5.next);

    }
}

class Node{
    public int data;    // data
    public Node previous; // address of previous node
    public Node next;   // address of previous node
    Node(int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}