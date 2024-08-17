package data_structues.LinkedList;

public class LL2_InsertNode {
    public static void main(String[] args) {
        Node head = LL1_CreateNode.createLLAndGetHead(new int[]{10,20,30});
        Node newElement1 = new Node(40);
        head = insertAtTheEnd(head, newElement1);
        LL1_CreateNode.traversLinkedList(head);

        Node newElement2 = new Node(35);
        head = insertAtPosition(head, newElement2, 3);
        LL1_CreateNode.traversLinkedList(head);

        Node newElement3 = new Node(60);
        head = LL1_CreateNode.createLLAndGetHead(new int[]{10,20,30});
        head = insertAtBegin(head, newElement3);
        LL1_CreateNode.traversLinkedList(head);



    }

    public static Node insertAtTheEnd(Node head, Node newNode){
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next  = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, Node newNode, int position){
        Node currentNode = head;
        int count = 1;
        while(count<position){
            currentNode = currentNode.next;
            ++count;
        }
        newNode.next = currentNode.next;
        currentNode.next  = newNode;
        System.out.print("\nInserting at a position");
        return head;
    }

    public static Node insertAtBegin(Node head, Node newNode){
        newNode.next = head;
        System.out.print("\nInserting at the begining");
        return newNode;
    }
}
