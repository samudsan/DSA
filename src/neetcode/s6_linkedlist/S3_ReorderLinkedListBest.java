package neetcode.s6_linkedlist;

import data_structues.LinkedList.Node;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class S3_ReorderLinkedListBest {
    public static void main(String[] args) {
        // Create an example linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = createLLAndGetHead(new int[]{1, 2, 3, 4, 5});

        // Reorder the list
        reorderList(head);

        // Print the reordered list
        System.out.print("Reordered list: ");
        traversLinkedList(head);
    }

    public static void reorderList(Node head){
        if (head == null || head.next == null) {
            return;
        }
        // The idea is finding the mid of the list and reversing second half and combining them
        // back with the intended order.

        // Step 1: Find the middle of the list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Node prev = null, current = slow, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node secondHalfHead = prev;

        // Step 3: Merge the two halves
        Node firstHalfHead = head;
        while (secondHalfHead.next != null) {
            Node temp1 = firstHalfHead.next;
            Node temp2 = secondHalfHead.next;

            firstHalfHead.next = secondHalfHead;
            secondHalfHead.next = temp1;

            firstHalfHead = temp1;
            secondHalfHead = temp2;
        }
    }

}
