package com.company;

public class VariableArguementsinMethods {
    public static void main(String[] args) {
        System.out.println("The requied sum is "+ sum(1));
    }
//    static int sum(int ...arr){
//        int result=0;
//        for (int element: arr
//             ) {
//             result=result+element;
//        }
//        return  result;
//    }
//    -----in case we want that the user passes atleat one argument to the method we can do as followa
    static int sum(int x, int ...arr){   //<----- this will make it necessary for the user to atleast give one argument.
        int result=x;

        for (int element: arr
             ) {
             result=result+element;
        }
        return  result;
            }
}
