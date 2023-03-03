package Queues;
import java.util.Stack;
public class QueueUsingStacks<T> {
    //Define the data members
    Stack<T> s1;
    Stack<T> s2;

    public QueueUsingStacks() {
        //Implement the Constructor
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public int size() {
        return s1.size();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void enqueue(T element) {
        s1.push(element);
    }

    public T dequeue() throws QueueEmptyException {
        if(s1.size()==0){
            throw new QueueEmptyException();
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        T temp= s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }

    public T front() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        T temp= s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }
}
