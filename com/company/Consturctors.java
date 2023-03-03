package com.company;

public class Consturctors {
    public static void main(String[] args) {
      simpleClass obj= new simpleClass(8,"Varun");
        System.out.println(obj.id+" "+obj.name);
    }
}
class simpleClass{
     int id;  String name;
    public simpleClass(){
        id =5;
        name="Sarvesh";
    }
    public simpleClass(int a,String x){
        this.id=a;
        this.name=x;
    }
}
