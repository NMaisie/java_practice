package stack_queue_dequeue;
/**
 *    add: enqueue, offer()
 *    remove: dequeue, poll()
 */

import java.util.LinkedList;
import java.util.Queue;
public class QueueEx1 {
    public static void main(String[] args) {
        Queue<String> studentList = new LinkedList<String>();

        studentList.offer("Karen");
        studentList.offer("Chad");
        studentList.offer("Steve");
        studentList.offer("Harold");

        System.out.println(studentList.peek());// take out first element without deleting
        System.out.println(studentList);

        System.out.println(studentList.poll()); // take out and delete first element
        System.out.println(studentList);

        System.out.println(studentList.contains("Chad"));// check if the value exist


    }
}