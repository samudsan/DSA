package data_structues.LinkedList;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class LL5_CountNumberOfNodesInLL {
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{10, 20, 30,65});
        traversLinkedList(head);
        int size = getCountOfNodes(head);
        System.out.println(" Number of nodes in above list is: "+ size);
    }
    public static int getCountOfNodes(Node head){
        int count = 0;
        if(head == null)
            return 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

