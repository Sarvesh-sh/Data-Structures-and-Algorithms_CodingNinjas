package HashMaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import HashMaps.map_Implementation.*;
import static HashMaps.removeDuplicatesFromArray.removeDuplicates;

public class usingInbuiltHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("abc",1);
        map.put("def",5);
        map.put("gef",6);
        System.out.println("The size of the map currently is "+map.size());
        if(map.containsKey("abc")){
            System.out.println("Map contains abc");
        }
        int a= map.get("abc");
        System.out.println(a);

        map.remove("gef");
        System.out.println("The size of the map currently is "+map.size());

        Set<String> keys= map.keySet();
        for(String s:keys){
            System.out.println(s);
        }
        int arr[] = {1,2,3,2,2,4,5,5,8,7};
        ArrayList<Integer> ans= removeDuplicates(arr);
        System.out.println(ans);

        map_Implementation<String,Integer> newMap= new map_Implementation<>();
        newMap.insert("Sarvesh",1);
        newMap.insert("Nikhil",2);
        System.out.println("The size of my self-made map is "+newMap.size());
    }
}
