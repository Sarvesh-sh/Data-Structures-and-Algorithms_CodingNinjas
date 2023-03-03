package com.company;

public class Arrays {
    public static void main(String[] args) {
        int [] marks= new int[5]; //<-- declaration + memory allocation
        marks[0]=59;
        marks[1]= 70;
        marks[2]=80;
        marks[3]=98;
        marks[4]=76;
//        System.out.println(marks[4]);
        int [] number={4,6,3,6,3};  // <---declaration + memory allocation + initialisation.
//        System.out.println(number[4]);
        String [] friends = { "Sarvesh","Dhruv","Nikhils","Varun"};
        System.out.println(friends.length);
//        for (int i=0;i< friends.length;i++) {
//            System.out.println(friends[i]);
//        }

//        to print the elements in reverse order:
//        for (int i=friends.length-1;i>=0;i--){
//            System.out.println(friends[i]);
//        }

//        using for each loop displaying the array
//        for(String element: friends){
//            System.out.println(element);
//        }

//        -------------Multidimensional Array --------------------------------
        int [][] flats= new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        for (int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

    }
}
