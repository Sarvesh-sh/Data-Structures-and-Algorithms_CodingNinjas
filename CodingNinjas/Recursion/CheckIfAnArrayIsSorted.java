package CodingNinjas.Recursion;

public class CheckIfAnArrayIsSorted {
    static int index=0;
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(isSorted(arr));
        System.out.println(isSortedBetter(arr,0));

    }

    public static boolean isSortedBetter(int[] x,int startIndex){
        if(x.length-1==startIndex){
            return true;
        }
        if(x[startIndex]>x[startIndex+1]){
            return false;
        }
        return isSortedBetter(x,++startIndex);
    }

    public static boolean isSorted(int[] x){
        if(x.length==1){
            return true;
        }
        if(x[0]>x[1]){
            return false;
        }
        int[] smallArray=new int[x.length-1];
        for (int i =1; i<x.length;i++){
            smallArray[i-1]=x[i];
        }
        boolean isSmallArraySorted = isSorted(smallArray);
        return isSmallArraySorted;
    }

}
