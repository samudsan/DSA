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
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both first and second until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node
        second.next = second.next.next;

        return dummy.next;
    }
}
