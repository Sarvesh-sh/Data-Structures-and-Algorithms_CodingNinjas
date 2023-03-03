package Binary_Trees;
import java.lang.Math;
public class IsBinaryTreeBST {
//    ------------------------------------------------------------------------------->
    public static boolean isBSTBetter(BinaryTreeNode<Integer> root) {
        Helper ans= isBSTUtil(root);
        return ans.isBST;
    }

    public static Helper isBSTUtil(BinaryTreeNode<Integer> root){
        if(root==null){
            Helper ans= new Helper(Integer.MIN_VALUE,Integer.MAX_VALUE,true);
            return ans;
        }

        Helper leftOutput= isBSTUtil(root.left);
        Helper rightOutput=isBSTUtil(root.right);
        boolean isBST= true;
        int minimum=Math.min(root.data,Math.min(leftOutput.minimum,rightOutput.minimum));
        int maximum=Math.max(root.data,Math.max(leftOutput.maximum,rightOutput.maximum));

        if(leftOutput.maximum>=root.data){
            isBST=false;
        }
        if(rightOutput.minimum<root.data){
            isBST=false;
        }
        if(leftOutput.isBST==false || rightOutput.isBST==false){
            isBST=false;
        }

        Helper ans= new Helper(minimum,maximum,isBST);
        return ans;

    }
//    --------------------------------------------------------------------------------------->

    public static boolean isBSTAnother(BinaryTreeNode<Integer> root) {
        return isBSTAnother(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }
    public static boolean isBSTAnother(BinaryTreeNode<Integer> root, int minrange, int maxrange){
        if(root==null){
            return true;
        }
        if(root.data<=minrange || root.data>maxrange){
            return false;
        }
        boolean leftOutput= isBSTAnother(root.left,minrange,root.data-1);
        boolean rightOutput=isBSTAnother(root.right,root.data,maxrange);

        return leftOutput && rightOutput;
    }
//    ---------------------------------------------------------------------------------------------------->
    public static boolean isBSTWorst(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int leftMax= maximum(root.left);
        if(leftMax>=root.data){
            return false;
        }

        int rightMin=minimum(root.right);
        if(rightMin<root.data){
            return false;
        }
        return isBSTWorst(root.left) && isBSTWorst(root.right);

    }

    public static int maximum(BinaryTreeNode<Integer> root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftMax=maximum(root.left);
        int rightMax=maximum(root.right);
        return Math.max(root.data,Math.max(leftMax,rightMax));
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftMin=minimum(root.left);
        int rightMin=minimum(root.right);
        return Math.min(root.data,Math.min(leftMin,rightMin));
    }
//        ---------------------------------------------------------------------------------------------------//
}

class Helper{
    int maximum;
    int minimum;
    boolean isBST;
    public Helper(int maximum,int minimum,boolean isBST){
        this.maximum=maximum;
        this.minimum=minimum;
        this.isBST=isBST;
    }

}
