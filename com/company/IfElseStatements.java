package com.company;

public class IfElseStatements {
    public static void main(String[] args) {
        int a= 50;
//        if(a<10){
//            System.out.println("no. is less than 10");
//        }
//        else {
//            System.out.println("No is greater than 10");

        switch (a) {
            case 20 -> System.out.println("You are greater than the number");
            case 50 -> System.out.println("You have reached the number");
            default -> System.out.println("WTF are you doing!");
        }
        System.out.println("You are out of the switch statement");
    }
}
