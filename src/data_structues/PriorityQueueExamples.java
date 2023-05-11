package data_structues;
/* PriorityQueue is a class which implement Queue interface
*  it sort the items in default sorting order.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExamples {
    public static void main(String[] args) {

        System.out.println("with LinkedList ");
        //LinkedList maintain natual queue order fifo.
        Queue<Double> q = new LinkedList<>();
        q.add(3.5);
        q.add(90.7);
        q.add(5.0);
        q.add(1.0);

        for (Double item:q) {
            System.out.println(item);
        }

        //Priority queue maintain sorting order
        System.out.println("\nwith Priority queue ");
        Queue<Double> pq = new PriorityQueue<>();
        pq.add(3.5);
        pq.add(90.7);
        pq.add(5.0);
        pq.add(1.0);

        for (Double item:pq) {
            System.out.println(item);
        }
    }
}
