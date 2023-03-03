package Dynamic_Programming;

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
//        System.out.println(fib(N));
        System.out.println(fibIterative(N));
    }
    public static int fib(int n){
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(1,1);
        map.put(0,0);
        if(map.containsKey(n)){
            return map.get(n);
        }
        else {
            int x= fib(n-1)+fib(n-2);
            map.put(n,x);
            return x;
        }
    }

    public static int fibIterative(int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        for(int i=2;i<=n;i++){
            map.put(i,map.get(i-1)+map.get(i-2));
        }
        return map.get(n);
    }
}
