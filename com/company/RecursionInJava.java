package com.company;
import java.util.Scanner;
public class RecursionInJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int n1=0,n2=1,n3=0;
//        int x= factorial(a);
//        System.out.println("The factorial of "+a+" using recursive approach is "+x);
//        System.out.println("The factorial using iterative approach comes out to be"+ factorial_iterative(a));
//        System.out.print("0 1 ");
//        System.out.println(printFibonnaci(a-2));
    }
//    ---Method to find factorial using recursive approach.------
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
//    ----Method to find factorial using iterative approach------
    static int factorial_iterative(int n){
        int factorial=1;
        for(int i=n;i>0;i--){
         factorial=factorial*i;
        }
        return factorial;
    }

//    ------Method to print the fibonacci series till the nth element-----
    static void printFibonnaci(int n){


    }

}