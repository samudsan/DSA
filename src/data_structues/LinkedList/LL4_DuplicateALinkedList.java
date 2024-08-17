package data_structues.LinkedList;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class LL4_DuplicateALinkedList {
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{1,2,3,4});
        Node head1 = duplicateALinkedList(head);
        traversLinkedList(head);
        traversLinkedList(head1);
    }

    public static Node  duplicateALinkedList(Node originalHead){
        if(originalHead == null)
            return null;

        // Create the new head for the duplicate list
        Node duplicateHead = new Node(originalHead.data);
        Node currentOriginalNode = originalHead.next;
        Node currentDuplicateNode = duplicateHead;

        // Iterate through the original list and copy each node
        while(currentOriginalNode != null){
            currentDuplicateNode.next = new Node(currentOriginalNode.data);
            currentOriginalNode = currentOriginalNode.next;
            currentDuplicateNode = currentDuplicateNode.next;
        }
        return duplicateHead;
    }
}
