package neetcode.s6_linkedlist;

import data_structues.LinkedList.Node;

import static data_structues.LinkedList.LL1_CreateNode.createLLAndGetHead;
import static data_structues.LinkedList.LL1_CreateNode.traversLinkedList;

public class S5_IdentifyCycleinLinkedList {
    public static void main(String[] args) {
        Node head = createLLAndGetHead(new int[]{5,3,4,6,2});
        traversLinkedList(head);
        System.out.print(isCyclePresent(head));
    }

    public static boolean isCyclePresent(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // if there is a cycle, fast and slow pointer definitely meets
            if(slow == fast)
                return true;
        }
        return false;
    }
}
