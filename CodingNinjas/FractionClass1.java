package CodingNinjas;
import java.util.*;
public class FractionClass1 {
    public static void main(String[] args) {
        Fraction_class1 obj1=new Fraction_class1(2,4);
        Fraction_class1 obj2= new Fraction_class1(5,6);
        //        obj1.increment();
//        obj1.add(obj2);
//        obj1.print();
        Fraction_class1 obj3 = Fraction_class1.add(obj1,obj2);
        obj3.print();

    }
}

class Fraction_class1{
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction_class1(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
     private void simplify(){
        int gcd=1;
        int smaller = Math.min(numerator,denominator);
        for(int i =2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
               gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void increment(){
        numerator=numerator+denominator;
    }

    public void add( Fraction_class1 b){
        this.numerator=this.numerator*b.denominator+ this.denominator*b.numerator;
        this.denominator=this.denominator*b.denominator;
        simplify();
    }
    public static Fraction_class1 add(Fraction_class1 f1, Fraction_class1 f2){
        int newNum= f1.numerator*f2.denominator+ f1.denominator*f2.numerator;
        int newDenom= f1.denominator* f2.denominator;
        Fraction_class1 obj3=new Fraction_class1(newNum,newDenom);
        return obj3;
    }
}