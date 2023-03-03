package Queues;
import java.util.LinkedList;
import java.util.Queue;

import static Queues.ReverseQueueQuestion.reverseQueue;

public class ReverseFirst_K_ElementsInQueue {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        if (input.size() == 1) {
            return input;
        }
        int x = k;
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < x; i++) {
            q.add(input.remove());
        }
        reverseQueue(q);
        // System.out.println(q.peek());
        while (!input.isEmpty()) {
            q.add(input.remove());
        }
        while (!q.isEmpty()) {
            input.add(q.remove());
        }
        return input;


    }
}
