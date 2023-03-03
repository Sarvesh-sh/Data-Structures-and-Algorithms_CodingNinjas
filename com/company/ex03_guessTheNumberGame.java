package com.company;
import java.util.Scanner;
import java.util.Random;
public class ex03_guessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("Guess the number");
//        int a= sc.nextInt();
        guessTheNumber obj=new guessTheNumber();
//        int x= obj.getNumber();
//        obj.checkNumber(a);

    }
}
class guessTheNumber{
    Random rand= new Random();
    private int b= rand.nextInt(1,101);
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    public int getNumber(){
        return b;
    }
    public void checkNumber(int x){
        int i=0;
        while (i<1){
            if (x == b) {
                System.out.println("Congratulations you got the number");
                return;
            } else if (x < b) {
                System.out.println("Try a little lower");
            } else {
                System.out.println("Try a little harder");
            }
        }
    }
}
