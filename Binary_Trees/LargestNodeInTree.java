package Binary_Trees;
import java.lang.Math;
public class LargestNodeInTree {
    public static int largestNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largestData= root.data;
        int leftLargestData= largestNode(root.left);
        int rightLargestData= largestNode(root.right);
        return Math.max(root.data,Math.max(leftLargestData,rightLargestData));
//        if(largestData>= leftLargestData && largestData>= rightLargestData ){
//            return largestData;
//        }
//        else if(leftLargestData>=rightLargestData){
//            return leftLargestData;
//        }
//        else {
//            return rightLargestData;
//        }

    }
    public static int smallestNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftSmallestNode=smallestNode(root.left);
        int rightSmallestNode=smallestNode(root.right);
        return Math.min(root.data,Math.min(leftSmallestNode,rightSmallestNode));
    }
}
