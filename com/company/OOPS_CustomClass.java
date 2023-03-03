package com.company;

class Student{
    int id;
    String name;
    String detail;
    int marks;
    public void printDetails(){
        System.out.println("My id is "+id+" and my name is "+name);
        System.out.println(detail);
    }
    public int getMarks(){
        return marks;
    }
}

public class OOPS_CustomClass {
    public static void main(String[] args) {
        Student Sarvesh = new Student(); // ------------> Creating a new object of class Student;
//        Setting the value of attributes of the newly created object Sarvesh
        Sarvesh.id= 2011981221;
        Sarvesh.name="Sarvesh Sharma";
        Sarvesh.detail="Sarvesh is an awesome guy";
        Sarvesh.marks= 100;
//        Calling the methods for the respective objects.
        Sarvesh.printDetails();
        System.out.println("The marks scored are "+Sarvesh.getMarks());
    }
}
