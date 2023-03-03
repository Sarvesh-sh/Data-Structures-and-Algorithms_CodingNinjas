package com.company;
import java.util.Random;
public class Dream11 {
    public static void main(String[] args) {
        for (int i =0;i<11;i++){
            Random rand = new Random();
            int saveA=0;
            int a = rand.nextInt(1,23);
            if(a==saveA){
                continue;
            }
            System.out.println(a);
            saveA = a;
        }
    }
}
