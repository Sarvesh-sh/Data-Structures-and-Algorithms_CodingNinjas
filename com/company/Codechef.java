package com.company;
import java.util.Scanner;
public class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++){
            int differenceOfNumbers= sc.nextInt();
            int multiplicationOfNumbers = sc.nextInt();
            int divisionOfNumbers = sc.nextInt();
            int sumOfNumbers = sc.nextInt();
            int firstNumber; int secondNumber;
            secondNumber= (sumOfNumbers - differenceOfNumbers)/2;
            firstNumber = sumOfNumbers - secondNumber;
            if((firstNumber + secondNumber != sumOfNumbers)||
                    (firstNumber - secondNumber != differenceOfNumbers)||
                    (firstNumber*secondNumber !=multiplicationOfNumbers)||
                    (firstNumber/secondNumber != divisionOfNumbers)){
                System.out.println("-1 -1");
            }
            else {
                System.out.println(firstNumber+" "+ secondNumber);
            }

        }

    }
}
