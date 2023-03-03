package CodingNinjas;

public class Generic_Class<X,Y> {
    public X noOfItems;
    public Y classNo;
    public Generic_Class(){}
    public void print(X a, Y b){
        this.noOfItems= a;
        this.classNo=b;
        System.out.println("The no of items:"+noOfItems+" The classNo is: "+classNo);
    }
    void print(){
        System.out.println("The no of items:"+noOfItems+" The classNo is: "+classNo);
    }

}
