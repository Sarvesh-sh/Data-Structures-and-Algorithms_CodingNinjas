package Binary_Trees;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Scanner;

public class TakingInput {
    //    Method to take Input of the Binary Tree:------------------------------------>
    public static BinaryTreeNode<Integer> takeTreeInput(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter root data");

        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//        System.out.println("Enter the left child of "+ rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInput();
//        System.out.println("Enter the right child of"+ rootData);
        BinaryTreeNode<Integer> rightChild= takeTreeInput();
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
//   -------------------------------------------------------------------------------------------------------------->
    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
        Scanner sc = new Scanner(System.in);
        if(isRoot){
            System.out.println("Enter root data");
        }else {
            if(isLeft){
                System.out.println("Enter left of "+parentData);
            }
            else {
                System.out.println("Enter right of "+parentData);
            }
        }
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false,rootData,true);
        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false,rootData,false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
//    ------------------------------------------------------------------------------------------------------->
    public static BinaryTreeNode<Integer> takeTreeInputLevelWise(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the root node: ");
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> treeQueue= new LinkedList<BinaryTreeNode<Integer>>();
        treeQueue.add((root));
        while (!treeQueue.isEmpty()){
            BinaryTreeNode<Integer> x =treeQueue.peek();
            System.out.println("Enter the left of "+ ((BinaryTreeNode<?>) treeQueue.peek()).data);
            int leftData= sc.nextInt();
            if(leftData!=-1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftData);
                x.left=leftNode;
                treeQueue.add(leftNode);
            }else {
                x.left=null;
            }
            System.out.println("Enter the right of "+ ((BinaryTreeNode<?>) treeQueue.peek()).data);
            int rightData=sc.nextInt();
            if(rightData!=-1) {
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightData);
                x.right=rightNode;
                treeQueue.add(rightNode);
            }else {
                x.right=null;
            }
            treeQueue.remove();
        }
        return root;
    }
}
