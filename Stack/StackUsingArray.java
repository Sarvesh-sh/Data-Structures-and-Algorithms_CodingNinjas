package Stack;

public class StackUsingArray {
    private int data[];
    private int topIndex;

    public StackUsingArray(){
        data= new int[10];
        topIndex=-1;
    }

    public StackUsingArray(int x){
        data= new int[x];
        topIndex=-1;
    }

    public void push(int element) throws StackFullException,StackEmptyException {
//        If the stack is full we can throw an exception
//        if(topIndex==data.length-1){
////            StackFullException e = new StackFullException();
////            throw e;
//            throw new StackFullException();
//        }

        if(topIndex== data.length-1){
            doubleCapacity();
        }
        this.data[++topIndex]= element;
    }

    public int pop() throws StackEmptyException {
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        topIndex--;
        return this.data[topIndex+1];
    }


    public int size(){
        return topIndex+1;
    }

    public int top() throws StackEmptyException {
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public boolean isEmpty(){
        return topIndex==-1;
    }

    private void doubleCapacity(){
        int temp[]=data;
        data=new int [2*data.length];
        for(int element=0;element<temp.length;element++){
            data[element]=temp[element];
        }
    }

}
