package Stack;
import java.util.Queue;
import java.util.LinkedList;
public class StackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueues() {
        //Implement the Constructor
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public int getSize() {
        return q1.size();
    }

    public boolean isEmpty() {
        return q1.isEmpty();

    }

    public void push(int element) {
        q1.add(element);
    }

    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()>1){
            int x=q1.remove();
            q2.add(x);
        }
        int temp= q1.remove();
        while(!q2.isEmpty()){
            int y =q2.remove();
            q1.add(y);
        }
        return temp;
    }

    public int top() {
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int temp= q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        q1.add(temp);
        return temp;
    }
}
