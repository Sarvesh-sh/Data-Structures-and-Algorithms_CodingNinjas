package com.company;
import java.util.Scanner;
import java.util.Random;
public class ex01_RockPaperScissorsGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissors");
//        int a= sc.nextInt();
//        int b= rand.nextInt(3);
//        System.out.println(b);
        int count = 0;
        for(int i =1;i<=5;i++) {
            int a= sc.nextInt();
            int b= rand.nextInt(3);
            System.out.println(b);
            if (a == b) {
                System.out.println("Draw");
            } else if (a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0) {
                System.out.println("You lose");
            } else {
                System.out.println("You win");
                count = count+1;
            }
        }
        if (count>=3) System.out.println("Overall you win");
        else System.out.println("Overall you lose");
    }
}
