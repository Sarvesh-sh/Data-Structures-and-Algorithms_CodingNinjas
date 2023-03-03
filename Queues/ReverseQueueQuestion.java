package Queues;
import java.util.Queue;
import java.util.LinkedList;
//this method will reverse the given Queue:
public class ReverseQueueQuestion {
    public static void reverseQueue(Queue<Integer> q) {
        //Your code goes here
        if( q.size()==1){
            return;
        }
        else{
            int temp=q.remove();
            reverseQueue(q);
            q.add(temp);
            return;
        }
    }
}
