package javasnippets;

import java.util.*;

public class S4_PriorityQueuePollMethodTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(2);
        pq.add(28);
        pq.add(6);
        pq.add(80);
        pq.add(28);
        pq.add(7);
        pq.add(15);

        System.out.println("Elements in the priority queue are: " + pq);

        System.out.println("Head Element removed from the priority queue is: " + pq.poll());

        System.out.println("Elements after removing head element in the priority queue are: " + pq);

    }
}
