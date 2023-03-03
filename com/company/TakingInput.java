package com.company;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("This always works");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
}
