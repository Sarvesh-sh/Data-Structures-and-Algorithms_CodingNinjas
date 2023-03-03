package com.company;
import java.util.Scanner;
public class MethodsInJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        MethodsInJava obj = new MethodsInJava();
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=obj.logic(a,b);
//        int c= logic(a,b);
//        System.out.println(c);

    int[] a={2,5,3,5,3};
//    change(a);
        logic(5);
        logic(5,6);
//        System.out.println(a[0]);
    }

    static void logic(int y){
        System.out.println("Whats up bro!");
    }
     static void logic(int x, int y){
//        int z;
//        if(x>y){
//            z=x+y;
//        }
//        else {
//            z=(x+y)*5;
//        }
//        return z;
         System.out.println("Yo bro!");
    }
    static void change(int [] arr){
        arr[0]=50;
    }
}
