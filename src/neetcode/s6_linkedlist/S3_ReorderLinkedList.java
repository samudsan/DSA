package neetcode.s6_linkedlist;

import data_structues.LinkedList.Node;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;
import static data_structues.LinkedList.LL3_ReverseALinkedList.reverseList;
import static data_structues.LinkedList.LL4_DuplicateALinkedList.duplicateALinkedList;
import static data_structues.LinkedList.LL5_CountNumberOfNodesInLL.getCountOfNodes;

public class S3_ReorderLinkedList {
    // input :  1 2 3 4 5
    // Output:  1 5 2 4 3
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{1, 2, 3, 4, 5});
        Node reordered = reorderLinkedList(head);
        traversLinkedList(reordered); // prints linkedList nodes

    }

    public static Node reorderLinkedList(Node head) {
        if (head == null)
            return null;
        Node duplicatedListHead = duplicateALinkedList(head);
        Node reversedListHead = reverseList(duplicatedListHead);
        Node currentReOrdered = new Node(0);
        Node reorderHead = currentReOrdered;
        int count = getCountOfNodes(head);
        int halt = 0;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                currentReOrdered.next = head;
                head = head.next;
                currentReOrdered = currentReOrdered.next;
            } else {
                currentReOrdered.next = reversedListHead;
                reversedListHead = reversedListHead.next;
                currentReOrdered = currentReOrdered.next;
            }
            halt++;
            if (halt == count) {
                currentReOrdered.next = null;
                break;
            }
        }
        return reorderHead.next;
    }
}
