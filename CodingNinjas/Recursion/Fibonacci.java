package CodingNinjas.Recursion;

public class Fibonacci {
    static int count=10;

    public static void main(String[] args) {
        System.out.println(fibonacci(6));;
    }

    public static int fibonacci(int n){
        if(n==1 || n==2){
//            System.out.print(n-1+" ");
            return n-1;
        }
        int x= fibonacci(n-1);
        int y=fibonacci(n-2);
//        System.out.print(y+x+" ");
        return y+x;
    }
}
