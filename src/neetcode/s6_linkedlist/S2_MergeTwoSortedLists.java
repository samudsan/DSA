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

    public static Node mergeTwoSortedLists(Node list1, Node list2) {
        // Create a dummy node to act as the start of the merged list
        Node dummy = new Node(0);
        Node current = dummy;

        // While neither list is empty, pick the smaller head and append it to the merged list
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // At this point, at least one of the two lists is null
        // Append the remaining non-null list to the merged list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the node after the dummy node
        return dummy.next;
    }
}
