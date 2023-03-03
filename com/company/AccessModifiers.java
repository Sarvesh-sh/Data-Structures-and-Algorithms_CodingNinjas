package com.company;

public class AccessModifiers {
    public static void main(String[] args) {
        employee sarvesh = new employee();
//        sarvesh.name="Sarvesh";//------------wont work because of private access modifier;
        sarvesh.setId(2011981221);
        sarvesh.setName("Sarvesh");
        System.out.println("The id is "+sarvesh.getId()+" and the name is "+sarvesh.getName());
    }
}
class employee{
    private int id;
    private String name;
    public void setId(int x){
        id= x;
    }
    public void setName(String n){
        name=n;
    }
//    Getters:
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
