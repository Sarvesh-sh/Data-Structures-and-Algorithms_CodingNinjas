package PriorityQueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
    private ArrayList<Element<T>> heap;
    private int size=0;

    public Priority_Queue(){
        heap=new ArrayList<>();
    }

    public void insert(T value,int priority){
        Element<T> insertedElement= new Element<>(value,priority);
        heap.add(insertedElement);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        while(childIndex>0){
            if(heap.get(childIndex).priority<heap.get(parentIndex).priority){
                Element<T> temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else{
                break;
            }
        }
        size++;
    }
    public T getMin() throws PriorityQueueEmptyException{
        if(heap.isEmpty()){
            throw new PriorityQueueEmptyException();
        }
        return heap.get(0).value;
    }

    public T removeMin(){
        T removedElement= heap.get(0).value;
        Element<T> temp= heap.get(size-1);
        heap.get(0).value=temp.value;
        heap.get(0).priority= temp.priority;
        heap.remove(size-1);
        for(int i=0;i<size-2;i++){
            Element<T> smallerElement;
            if(heap.get(2*i+1).priority>heap.get(2*i+2).priority){
                smallerElement=heap.get(2*i+1);
            }
            else{
                smallerElement=heap.get(2*i+2);
            }
            if(heap.get(i).priority>smallerElement.priority){
                Element<T> temporary= heap.get(i);
                heap.set(i,smallerElement);
                smallerElement.priority= temporary.priority;
                smallerElement.value= temporary.value;
            }
        }
        size--;
        return removedElement;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public T removeMinAgain(){
        T removedElement= heap.get(0).value;
        heap.get(0).value=heap.get(heap.size()-1).value;
        heap.get(0).priority=heap.get(heap.size()-1).priority;
        heap.remove(heap.size()-1);
        int parentIndex=0;
        while(2*parentIndex+1<heap.size()){
            if(2*parentIndex+1< heap.size() && 2*parentIndex+2< heap.size()){
                Element<T> smaller = heap.get(2*parentIndex+1);
                parentIndex=2*parentIndex+1;
                if(smaller.priority> heap.get(2*parentIndex+1).priority){
                    smaller=heap.get(2*parentIndex+2);
                    parentIndex=2*parentIndex+2;
                }
                Element<T> temp = heap.get(parentIndex);
                heap.set(parentIndex,smaller);

                continue;
            }
            if(2*parentIndex+1< heap.size() && heap.get(2*parentIndex+1).priority<heap.get(parentIndex).priority){
                Element<T> temp = heap.get(parentIndex);
                heap.set(parentIndex,heap.get(2*parentIndex+1));
                parentIndex=2*parentIndex+1;
                continue;
            }
            if(2*parentIndex+2< heap.size() && heap.get(2*parentIndex+2).priority<heap.get(parentIndex).priority){
                Element<T> temp = heap.get(parentIndex);
                heap.set(parentIndex,heap.get(2*parentIndex+2));
                parentIndex=2*parentIndex+2;
                continue;
            }
        }
        size--;
        return removedElement;
    }
}
