package com.company;

import java.util.Locale;
import java.util.Scanner;

public class PractiseSet03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        QUESTION 1
//        String name= "AweSome";
//        name = name.toLowerCase(Locale.ROOT);
//        System.out.println(name);

//        QUESTION 2
//        String sentence="Sarvesh is awesome";
//        System.out.println(sentence.replace(" ","_"));

//        QUESTION 3
//        String name = sc.next();
//        String letter= "Dear <|name|> ,Thanks a lot.";
//        System.out.println(letter);
//        letter = letter.replace("<|name|>",name);
//        System.out.println(letter);

//        QUESTION 4
//        String sentence = "This  is the   given sentence";
//        System.out.println(sentence.indexOf("  "));
//        System.out.println(sentence.indexOf("   "));

//        QUESTION 5
        String letter= "Dear Harry, This Java Course is nice. Thanks.";
        System.out.println(letter);
        letter= "Dear Harry,\n\tThis Java Course is nice.\n\t\tThanks";
        System.out.println(letter);
    }
}
