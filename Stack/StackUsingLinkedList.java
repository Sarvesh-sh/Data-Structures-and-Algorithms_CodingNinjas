package Stack;

import Linked_List.Node;

public class StackUsingLinkedList<T> {
    private Node<T> head;
    private int size;

//    private Node<T> tail;
//    private Node<T> preTailNode;
// //   Implementing stack by pushing elements at the end of the stack:
//    public StackUsingLinkedList(){
//        head=null;
//        tail=head;
//        size=0;
//    }
//
//    public int size(){
//        return size;
//    }
//
//    public boolean isEmpty(){
//        return size==0;
//    }
//
//    public T top() throws StackEmptyException{
//        if(size==0){
//            throw new StackEmptyException();
//        }
//        return tail.data;
//    }
//
//    public void push(T data){
////        if(size==0){
////            head= new Node<T>(data);
////            tail=head;
////            size++;
////        }
////        else {
////            tail.next=new Node<T>(data);
////            preTailNode=tail;
////            tail=tail.next;
////            size++;
////        }
//    }
//
//    public T pop(){
//        T temp= tail.data;
//        tail=preTailNode;
//        size--;
//        System.out.println(temp);
//        return temp;
//    }


    public StackUsingLinkedList(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T top() throws StackEmptyException{
        if(size==0){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public void push(T data){
        Node<T> newNode= new Node<>(data);
        if(size==0){
            head=newNode;
            size++;
        }
        else {
            newNode.next=head;
            head=newNode;
            size++;
        }
    }

    public T pop() throws StackEmptyException {
        if(size==0){
            throw new StackEmptyException();
        }
        T temp=head.data;
        head=head.next;
        size--;
//        System.out.println(temp);
        return temp;
    }


}
