package CodingNinjas.Recursion;

public class printMinInArray {
    public static void main(String[] args) {
        int[] arr={10,4,3,6,34,11};
        minInArray(arr,Integer.MAX_VALUE,0);
    }
    public static void minInArray(int[] arr,int currentMin,int index){
        if(index==arr.length){
            System.out.println(currentMin);
            return;
        }
        if(arr[index]<currentMin){
            currentMin=arr[index];
        }
        minInArray(arr,currentMin,index+1);
    }
}
