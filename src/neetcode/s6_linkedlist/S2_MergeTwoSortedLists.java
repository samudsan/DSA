package neetcode.s6_linkedlist;

import data_structues.LinkedList.Node;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class S2_MergeTwoSortedLists {
    public static void main(String[] args) {
        Node head1 = createLLAndGetHead(new int[]{1, 2, 4});
        Node head2 = createLLAndGetHead(new int[]{1, 3, 4, 6});
        Node head = mergeTwoSortedLists(head1, head2);
        traversLinkedList(head); // prints linkedList nodes
    }

    public static Node mergeTwoSortedLists(Node head1, Node head2) {

        // Create a dummy node to simplify edge cases
        Node dummy = new Node(0);
        Node current = dummy;

        // loop should run till either of the list is fully traversed
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // If any nodes are left in either list, append them
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        // Return the merged list, which starts at dummy.next
        return dummy.next;
    }
}
