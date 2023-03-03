package com.company;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
//        --- print, println, printf(using %d/%f/%c etc) are some methods to print Sting
//        -- next() will take only first word as input; nextLine() will take the whole string
        String name = "sarvesh ";
        System.out.println(name);
//        int length = name.length();
//        System.out.println("The length of the string is "+ length);
//        String lstring = name.toLowerCase(Locale.ROOT);
//        System.out.println(lstring);
//        String ustring = name.toUpperCase(Locale.ROOT);
//        System.out.println(ustring);
//        String untrimmed = "     this is worst       ";
//        String trimmed= untrimmed.trim();
//        System.out.println(untrimmed);
//        System.out.println(trimmed);
//        System.out.println(name.substring(1)); //--- will print the string from index 1;
//        System.out.println(name.substring(1,7)); // ---will exclude the end index and print till before it;
        System.out.println(name.replace('s','d'));
        System.out.println(name);
        System.out.println(name.replace("s","yavv"));
   //---->startsWith(), endsWith(), charAt(), indexOf() lastIndexOf()
   //  equals() equalsIgnoreCase() are a few other methods of string.<------
//        \n -- used for new line.;
//        \t-- used for tab;
//        \" -- used to use a double quote with a string;
//        \\ -- used to use backslash within the string;



    }
}
