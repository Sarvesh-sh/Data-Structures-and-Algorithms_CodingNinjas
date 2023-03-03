package Queues;

public class QueueUsingArray {

    private int[] data;
    private int frontElementIndex;
    private int rearElementIndex;
    private int size;

    public QueueUsingArray(){
        data=new int[5];
        frontElementIndex=-1;
        rearElementIndex=-1;
        size=0;
    }
    public QueueUsingArray(int capacity){
        data= new int[capacity];
        frontElementIndex=-1;
        rearElementIndex=-1;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else {
            return false;
        }
    }

    public int front() throws QueueEmptyException {
        if(frontElementIndex==-1){
            throw new QueueEmptyException();
        }
        return data[frontElementIndex];
    }

    public void enqueue(int element) throws QueueFullException {
//        if(size==data.length){
//            throw new QueueFullException();
//        }
        if(size== data.length){
            doubleCapacity();
        }
        if(size==0){
            frontElementIndex++;
        }
//        rearElementIndex++;
//        if(rearElementIndex==data.length){
//            rearElementIndex=0;
//        }
//        alternate for above code is:
        rearElementIndex=(rearElementIndex+1)% data.length;
        data[rearElementIndex] = element;
        size++;

    }

    public int dequeue() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }

        int element=data[frontElementIndex];
//        frontElementIndex++;
//        if(frontElementIndex== data.length){
//            frontElementIndex=0;
//        }
//        alternate for above code is:
        frontElementIndex=(frontElementIndex+1)% data.length;
        size--;
        if(size==0){
            frontElementIndex=-1;
            rearElementIndex=-1;
        }
        return element;
    }

    private void doubleCapacity(){
        int [] temp= data;
        data = new int[2*temp.length];
        int index=0;
        for(int i=frontElementIndex;i<temp.length;i++){
            data[index++]=temp[i];
        }
        for(int i=0;i<frontElementIndex;i++){
            data[index++]=temp[i];
        }
        frontElementIndex=0;
        rearElementIndex=temp.length-1;
    }


}
