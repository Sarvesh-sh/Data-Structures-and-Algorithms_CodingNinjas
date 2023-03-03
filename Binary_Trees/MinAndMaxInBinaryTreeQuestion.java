package Binary_Trees;

public class MinAndMaxInBinaryTreeQuestion {
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here

        if(root==null){
            Pair ans= new Pair(0,0);
            return ans;
        }
        Pair<Integer,Integer> leftMinMax = getMinAndMax(root.left);
        Pair<Integer,Integer> rightMinMax = getMinAndMax(root.right);
        int minimum=0;
        int maximum=0;
        int rootData=root.data;
        // Comparing minimum of left and right-------------->
        if(leftMinMax.minimum<rightMinMax.minimum){
            minimum=leftMinMax.minimum;
        }
        else{
            minimum=rightMinMax.minimum;
        }
        // Comparing maximum of left and right------------>
        if(leftMinMax.maximum<rightMinMax.maximum){
            maximum=rightMinMax.maximum;
        }
        else{
            maximum=leftMinMax.maximum;
        }
        // Comparing rootData with minimum and maximum----------->
        if(rootData<minimum){
            minimum=rootData;
        }
        else if(rootData>maximum){
            maximum=rootData;
        }
        // Returning the correct ans------------------------->
        Pair<Integer,Integer> ans= new Pair(minimum,maximum);
        return ans;

    }
}

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}
