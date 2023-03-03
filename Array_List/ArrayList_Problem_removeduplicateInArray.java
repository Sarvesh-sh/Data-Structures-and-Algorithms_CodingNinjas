package Array_List;
import java.util.*;
public class ArrayList_Problem_removeduplicateInArray {
    public static void main(String[] args) {
        int [] arr1= {10,10,10,20,20,30,40,10};
        System.out.println(removeConsecutiveDuplicate(arr1));

    }

    public static ArrayList<Integer> removeConsecutiveDuplicate(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;

    }

}
