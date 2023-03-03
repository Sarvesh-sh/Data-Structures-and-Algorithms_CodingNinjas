package Array_List;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//
//        Add Function in ArrayList:
        arr.add(10);
        arr.add(20);
        arr.add(30);
//
//
//        Size/length function in Array_List:
//        System.out.println(arr.size());
//
//
//        Accessing elements of ArrayList:
//        for (Integer element:arr) {
//            System.out.println(element);
//        }
//
//
//        Accessing an element at a particular index in ArrayList:
//        System.out.println(arr.get(2));
//
//        Another method of accessing elements of ArrayList:
//        for(int i=0;i< arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
//        System.out.println(); // Just to provide a new line in the output.
//
//
//        Adding a element at a particular index --will force all elements from that index to shift right one index
//        System.out.println("Adding 50 to the index 1:");
//        arr.add(1,50);
//        for(int i=0;i< arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }

//        Finding the index of a particular element:
//        System.out.println(arr.indexOf(20));

//        Finding how to replace an element in the Array_List:
        arr.set(2,90);
        for (Integer element:arr) {
            System.out.println(element);
        }
    }
}
