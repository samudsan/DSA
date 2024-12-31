package data_structues.LinkedList;

public class LL1_CreateNode{
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{10, 20, 30});
        traversLinkedList(head);
    }

    // This method takes an array as input and return head
    // i.e. a linked list version of same data
    public static Node createLLAndGetHead(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            current.next = node;
            current = current.next;
        }
        return head;
    }

    public static void traversLinkedList(Node head){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(" "+currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

