package CodingNinjas.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*factorial(x-1);
    }
}
