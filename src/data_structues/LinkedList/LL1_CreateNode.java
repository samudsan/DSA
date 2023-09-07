package data_structues.LinkedList;

public class LL1_CreateNode{
    public static void main(String[] args) {
        Node head = createLLAndGetHead();
        traversLinkedList(head);
    }

    public static Node createLLAndGetHead(){
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        Node head = node1;
        head.next = node2;
        node2.next = node3;
        return head;
    }

    public static void traversLinkedList(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(" "+currentNode.data);
            currentNode = currentNode.next;
        }
    }
}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
