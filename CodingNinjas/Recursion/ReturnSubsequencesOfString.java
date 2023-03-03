package CodingNinjas.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnSubsequencesOfString {
    public static void main(String[] args) {
        String x= "Sarvesh";
        String[] ans=returnSubsequencesOfString(x);
        for (String element:ans) {
            System.out.println(element);
        }
    }
    public static String[] returnSubsequencesOfString(String word){
        int x =(int) Math.pow(2,word.length());
        String[] ans= new String[x];
        int lastIndex=0;
        if(word.length()==0){
            String[] output= new String[1];
            output[0]="";
            return output;
        }
        String[] temp=returnSubsequencesOfString(word.substring(1));
        for(int i=0;i<temp.length;i++){
            ans[lastIndex]=word.charAt(0)+temp[i];
            lastIndex++;
        }
        for(int i=0;i< temp.length;i++){
            ans[lastIndex]=temp[i];
            lastIndex++;
        }
        Arrays.sort(ans);
        return ans;
    }
}
