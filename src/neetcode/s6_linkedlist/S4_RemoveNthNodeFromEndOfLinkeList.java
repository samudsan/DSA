package neetcode.s6_linkedlist;

import data_structues.LinkedList.Node;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class S4_RemoveNthNodeFromEndOfLinkeList {
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{5,3,4,6,2});
        System.out.print("Before removal : ");
        traversLinkedList(head);
        head = removeNthNodeFromLast(head, 1);
        System.out.print("after removal nth Node: ");
        traversLinkedList(head);
    }
    public static Node removeNthNodeFromLast(Node head, int n){
            // Initialize a dummy node which helps in handling edge cases like removing the head
            Node dummy = new Node(0);
            dummy.next = head;

            // Initialize two pointers both at the dummy node
            Node slow = dummy;
            Node fast = dummy;

            // Move fast ahead by n+1 steps to create the required gap
            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }

            // Move both pointers till fast reaches the end of the list
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            // Adjust the pointers to skip the nth node
            slow.next = slow.next.next;

            // Return the updated list starting from the node next to dummy
            return dummy.next;
        }
}
