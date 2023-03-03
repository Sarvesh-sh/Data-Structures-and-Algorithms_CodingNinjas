package CodingNinjas.Recursion;

public class printFactorial {
    public static void main(String[] args) {
        fact(4,1);
    }
    public static void fact(int n,int f){
        if(n<=1){
            System.out.println(f);
            return;
        }
        f=n*f;
        fact(n-1,f);
    }
}
