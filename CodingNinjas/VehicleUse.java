package CodingNinjas;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v =new Vehicle();
//        v.color= "red";
//        v.noOfTires =5 ;
//        Car c = new Car();
//        c.noOfTires=4;
//        c.color="grey";
//        c.nameOfCar= "Ford";
//        Vehicle d= new Vehicle();
//        Generic_Class<Integer,String> g1= new Generic_Class<Integer,String>();
//        g1.classNo=5;
//        g1.noOfItems=10;
//        g1.print(7,9);
//        Generic_Class<Integer,String> g2 = new Generic_Class<>();
//        g2.print(4,3);
//        Generic_Class<Generic_Class<Integer,String>,String> g3 = new Generic_Class<Generic_Class<Integer,String>,String>();
//        g3.classNo="Fifth";
//        g3.print(g1,"Tenth");
        Vehicle arr[]= new Vehicle[5];
        for (int i=0;i<5;i++){
            arr[i]= new Vehicle();
        }
        print(arr);

    }
    public static<T extends Vehicle> void print(T arr[]){
        for(T element: arr){
//            System.out.println(element);
            element.print();
        }

    }
}
