/*
 * 
 * Write a program that accepts a list of integers and make sure the elements are in ascending order from top to bottom, by removing any element that is smaller than any element(s) on top of it. You can use only java QUEUES.
 * 
 * 
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));
        Queue<Integer> sortedQueue = sort(queue);
        while (!sortedQueue.isEmpty()) {
            System.out.println(sortedQueue.poll());
        }
    }

    static Queue<Integer> sort(Queue<Integer> queue) {
        Queue<Integer> sortedQueue = new PriorityQueue<>(Comparator.reverseOrder());

         // finish the method below.







        return sortedQueue;
    }
}