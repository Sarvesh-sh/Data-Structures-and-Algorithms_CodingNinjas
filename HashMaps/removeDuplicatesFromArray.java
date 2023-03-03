package HashMaps;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class removeDuplicatesFromArray {
    public static ArrayList removeDuplicates(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsValue(arr[i])){
               map.put(i,arr[i]);
               ans.add(arr[i]);
            }
        }
        return ans;
    }
}
