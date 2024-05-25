package stack_queue_dequeue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQuerePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        int k =4;
        System.out.println(kLargestElements(pq,k));


        }
        public static Queue<Integer> kLargestElements(PriorityQueue<Integer> pq, int k) {
            int numPolled = pq.size()-k;
            for (int i=0; i<numPolled;i++){
                pq.poll();
            }
            return pq;
        }
}
