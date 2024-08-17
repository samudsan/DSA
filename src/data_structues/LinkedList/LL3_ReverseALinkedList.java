package data_structues.LinkedList;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class LL3_ReverseALinkedList {
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{10,20,30});
        head = reverseList(head);
        traversLinkedList(head);
    }

    public static Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to current node
            current = next;      // Move to the next node
        }
        head = prev; // Update the head to the new first node
        return head;
    }
}
