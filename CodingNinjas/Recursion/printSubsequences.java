package CodingNinjas.Recursion;

public class printSubsequences {
    public static void main(String[] args) {
        String s= "abc";
        printSubsequences(s,"");
    }
    public static void printSubsequences(String s,String stringSoFar){
        if(s.length()==0){
            System.out.println(stringSoFar);
            return;
        }
        printSubsequences(s.substring(1),stringSoFar);
        stringSoFar+=s.charAt(0);
        printSubsequences(s.substring(1),stringSoFar);
    }
}
