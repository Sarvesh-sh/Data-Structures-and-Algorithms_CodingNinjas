package Queues;
import Linked_List.Node;

public class QueueUsingLinkedList<T> {
    private Node<T> frontElement;
    private Node<T> rearElement;
    int size;
    public QueueUsingLinkedList(){
        this.frontElement=null;
        this.rearElement=null;
        this.size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T front() throws QueueEmptyException {
        if(frontElement==null){
            throw new QueueEmptyException();
        }
        return frontElement.data;
    }

    public void enqueue(T element){
        Node<T> newNode= new Node<T>(element);
        if(size==0){
            frontElement=newNode;
            rearElement=newNode;
            size++;
        }
        else{
            rearElement.next=newNode;
            rearElement=newNode;
            size++;
        }
    }

    public T dequeue() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        T temp=frontElement.data;
//        if(frontElement==rearElement){
//            frontElement=null;
//            rearElement=null;
//            size=0;
//            return temp;
//        }
        if(frontElement==null){
            rearElement=null;
            size=0;
            return temp;
        }
        frontElement=frontElement.next;
        size--;
        return temp;
    }
}
