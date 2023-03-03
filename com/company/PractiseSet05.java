package com.company;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class PractiseSet05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1
//        int n = sc.nextInt();
//        for(int i=n;i>0;i--){
//            for (int j= 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Question 2
        int n = sc.nextInt();
        int i=0;
        int sum= 0;
        while (i<n){
            sum=sum+2*i;
            i++;
        }
        System.out.println("The sum of first "+n+" even numbers is "+ sum);

//        Question 3
//        int n= sc.nextInt();
//        for(int i =1;i<=10;i++){
//            System.out.println(n+"X"+i+"="+n*i);
//        }

//        Question 4
//        int n= sc.nextInt();
//        for(int i =10;i>=1;i--){
//            System.out.println(n+"X"+i+"="+n*i);
//        }

//        Question 5
//        int n= sc.nextInt();
//        int factorial = 1;
//        for(int i=n;i>0;i--){
//            factorial=factorial*i;
//        }
//        System.out.println("The factorial of "+n+" is "+factorial);

//        Question 6
//        int n= sc.nextInt();
//        int factorial = 1;
//        int i =n;
//        while (i>0){
//            factorial=factorial*i;
//            i--;
//        }
//        System.out.println("The factorial of "+n+" is "+factorial);

//        Question 7
//        int n= sc.nextInt();
//        int i=n;
//        while (i>0){
//            int j= 1;
//            while (j<=i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i--;
//        }

//        Question 8
//        ans- true

//        Question 9
//        int n= sc.nextInt();
//        int sum=0;
//        for(int i =10;i>=1;i--){
//            sum=sum+ n*i;
//        }
//        System.out.println("The sum of the numbers occurring in the multiplication table of "+n+" is "+sum);

//        Question 10
//            ans-> atleast once

//        Question 11
//        int n= sc.nextInt();
//        int sum=0;
//        int i=0;
//        while(i<n){
//            sum=sum+2*n;
//            i++;
//            }
//        System.out.println("The sum of first "+n+" even numbers is "+ sum);
    }
}
