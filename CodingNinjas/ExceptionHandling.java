package CodingNinjas;
import java.util.Scanner;
public class ExceptionHandling {

    public static int divide(int a,int b) throws DivideByZeroException{
        return a/b;
    }
    public static void main(String[] args) throws DivideByZeroException{
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Solution.count(n));
//        int a=sc.nextInt();
//        int b=sc.nextInt();
////        if(b==0){
////            throw new ArithmeticException();
////        }
////        else System.out.println(a/b);
//        try {
////            System.out.println(a/b);
//            divide(a,b);
//        }
//
//        catch (DivideByZeroException z){
//            System.out.println("Got a divide by 0 exception");
//        }
//        System.out.println("This line is still working");
    }
}

class DivideByZeroException extends Exception{

}



 class Solution {

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }
}

