package com.company;

public class Inheritance {
    public static void main(String[] args) {

//        base b= new base();
//        b.setX(5);
//        System.out.println("I am in base and printing x= "+b.getX());
//        derived d= new derived();
//        System.out.println("I am in derived now and printing x= "+ d.getX());
//        d.setY(7);
//        System.out.println("I am in derived now and printing y= "+d.getY());
//        d.setX(8);
//        System.out.println(b.getX());
////        System.out.println(b.getY()); -------can't access this as parent can't access elements of child.//


//        Animal animal =new Animal();
//        Dog dog=new Dog();
//        animal.noOfLegs=4;
//        System.out.println(animal.getNoOfLegs());
//        dog.noOfLegs=4;
//        System.out.println(dog.getNoOfLegs());

//        Dog dog = new Dog();
        Puppy puppy=new Puppy();
    }
}
//class base{
//    public int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//}
//class derived extends base{
//    int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//}
class Animal{
    Animal() {
        System.out.println("i am within animal class.");
    }
    Animal(int a){
        System.out.println("I am an overloaded constructor of animal class");
    }
    public int noOfLegs;

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
class Dog extends Animal{
    Dog(){
        super(5);
        System.out.println("I am in dog class");
    }
    Dog(int a){
        super(6);
        System.out.println("I am an overloaded constructor of dog class");
    }
    public String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
class Puppy extends Dog{
    Puppy(){
        super(10);
        System.out.println("I am in puppy class");
    }
}
