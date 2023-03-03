package CodingNinjas;
import java.util.Scanner;
public class OOPS_Question1 {
//    int resultPower=1;
    public static int power(int x, int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(n==0){
            return 1;
        }
        else{
            return x*power(x,n-1);

        }

    }



    public static void main(String[] args) {
        int a= power(2,3);
        System.out.println(a);
//        Scanner s = new Scanner(System.in);
//
//        int real1 = s.nextInt();
//        int imaginary1 = s.nextInt();
//
//        int real2 = s.nextInt();
//        int imaginary2 = s.nextInt();
//
//        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
//        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
//
//        int choice = s.nextInt();
//
//        if(choice == 1) {
//            // Add
//            c1.plus(c2);
//            c1.print();
//        }
//        else if(choice == 2) {
//            // Multiply
//            c1.multiply(c2);
//            c1.print();
//        }
//        else {
//            return;
//        }
//    }
}
//class ComplexNumbers {
//    private int realPart;
//    private int imaginaryPart;
//
//    public ComplexNumbers(int realPart, int imaginaryPart){
//        this.realPart=realPart;
//        this.imaginaryPart= imaginaryPart;
//    }
//    public void print(){
//        System.out.println(this.realPart+" + i"+this.imaginaryPart);
//    }
//    public void plus(ComplexNumbers c2){
//        this.realPart=this.realPart+c2.realPart;
//        this.imaginaryPart=this.imaginaryPart+c2.imaginaryPart;
//    }
//
//    public void multiply(ComplexNumbers c2){
//        int temp=this.realPart;
//        this.realPart=this.realPart*c2.realPart-this.imaginaryPart*c2.imaginaryPart;
//        this.imaginaryPart= temp*c2.imaginaryPart+ this.imaginaryPart*c2.realPart;
//    }
}
