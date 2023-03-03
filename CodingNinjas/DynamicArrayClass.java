package CodingNinjas;

public class DynamicArrayClass {
    public static void main(String[] args) {
        DynamicArray d1= new DynamicArray();
//        System.out.println(d1.get(0));
//        d1.add(1);
//        System.out.println(d1.get(0));
//        System.out.println(d1.isEmpty());
//        System.out.println(d1.size());
        for(int i = 1;i<=100;i++){
            d1.add(100+i);
        }
        System.out.println(d1.get(57));
        while (!d1.isEmpty()){
            System.out.println(d1.removeLast());
            System.out.println("Size= "+d1.size());
        }
    }
//    d1.isEmpty();
//    while(! d1.isEmpty()){
//        d
//    }
}

class DynamicArray{
    private int data[];
    private int nextElementIndex;

    //------creating the constructor to set the default values:
    public DynamicArray(){
        data = new int[5];
        nextElementIndex=0;
    }

    //--to find the number of elements inserted in the array:
    public int size(){
        return nextElementIndex; //-----as nextElementIndex tells the no. of elements we have inserted in the array.
    }

    //-----to check if the array is empty
    public boolean isEmpty(){
        return nextElementIndex==0;
    }

    //---to get the value at the i th index of the array:
    public int get(int i){
        if(i>=nextElementIndex){
            //throw error;
            return -1;
        }
        else {
            return data[i];
        }
    }

    //---function to add the next element in the array..
    public void add(int elem){
        if(nextElementIndex==data.length){
            doubleCapacity();
        }
        data[nextElementIndex]=elem;
        nextElementIndex++;
    }

    //----function to double the size of the array:
    public void doubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }

    public void set(int i,int elem){
        if(nextElementIndex>=data.length){
            //throw Exception
            return;
        }
        else {
            data[i] = elem;
        }
    }

    public int removeLast(){
        if(nextElementIndex==0){
            return -1;
        }
        int temp = data[nextElementIndex-1];
        data[nextElementIndex-1]=0;  //<---- not really necessary as this element will get overwritten in the next addition anyway.
        nextElementIndex--;
        return temp;
    }
}
