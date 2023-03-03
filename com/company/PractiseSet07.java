package com.company;
import java.util.Scanner;
public class PractiseSet07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
//        PractiseSet07 obj= new PractiseSet07;
//        multiplicationTable(a); //----Question 1.

//        printPattern(a); //-----Question 2

//        System.out.println(sumOfNaturalNumbers(a)); //----Question 3

//        printPattern2(a); //----Question 4

//        System.out.println(fibonacci(5)); //----Question 5

//        System.out.println(averageOfNumbers(5,6)); //-----Question 6

//        printPatternUsingRecursion(a); //-----Question 7 and Question 8;

//        System.out.println(CelciusToFahrenheit(a)); //-----Question 9;

//        System.out.println(sumOfNaturalUsingIteration(a)); //----Question 10;

    }
    //        Question 1--->
//    static void multiplicationTable(int n){
//        for(int i =1;i<=10;i++){
//            System.out.println(n+"X"+i+"="+n*i);
//        }
//    }

//        Question 2-->
//    static void printPattern(int n){
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    Question 3 -->
//    static int sumOfNaturalNumbers(int n){
//        if(n==1){
//            return 1;
//        }
//        else
//        return (n+sumOfNaturalNumbers(n-1));
//    }

//    Question 4 -->
//    static void printPattern2(int n){
//        for (int i=n;i>0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    Question 5 -->
//    static int fibonacci(int n){
//        if(n==1){      ///------can also be written as if(n==1||n==2) return n-1;
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
//        else return fibonacci(n-1)+fibonacci(n-2);
//    }

//    Question 6 -->
//    static float averageOfNumbers(float a,float b, float ...arr){
//        float sum=a+b;
//        for (int i=0;i<arr.length;i++){
//            sum= sum+arr[i];
//        }
//        float average= sum/(arr.length+2);
//        return average;
//    }

//      Question 7 -->
//        static void printPatternUsingRecursion(int n){
//        if(n>0) {
//            for (int i = 1; i <= n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            printPatternUsingRecursion(n-1);
//        }
//        }

//        Question 8 -->
//            static void printPatternUsingRecursion(int n){
//               if(n>0) {
//                   printPatternUsingRecursion(n-1);
//                   for (int i = 1; i <= n; i++) {
//                       System.out.print("*");
//                   }
//                   System.out.println();
//
//    }
//}


//    Question 9 -->
//        static float CelciusToFahrenheit(float x){
//         x=x*1.8f+32;
//         return x;
//        }

//    Question 10 -->
     static int sumOfNaturalUsingIteration(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return  sum;
    }

}
