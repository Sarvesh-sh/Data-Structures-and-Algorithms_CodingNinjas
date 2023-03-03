package CodingNinjas.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        System.out.println(BinarySearch(x,3));
    }

    public static int  BinarySearch(int[] arr,int x){
        return BinarySearch(arr,x,0, arr.length-1);
    }
    public static int  BinarySearch(int[] arr,int x,int start,int end){
        if(start>end){
            return -1;
        }
        int first=start;
        int last=end;
        int mid=(first+last)/2;
        int ans=-1;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){
            ans=BinarySearch(arr,x,mid+1,last);
        }
        else{
            ans=BinarySearch(arr,x,start,mid-1);
        }
        return ans;
    }
}
