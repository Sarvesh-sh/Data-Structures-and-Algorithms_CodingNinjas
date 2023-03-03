package Binary_Trees;
import java.util.Arrays;
public class BuildTreeUsingPre_In_PostOrder {

//    Using Preorder and Inorder:----------------------------------------->
    public static BinaryTreeNode<Integer> buildTreeUsingPreOrder(int[] preOrder, int[] inOrder) {
        //Your code goes here
        int preOrderIndex=-1;
        int inOrderIndex=-1;
        if(preOrder.length==0 || inOrder.length==0){
            return null;
        }
        int rootData=preOrder[0];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        for(int i=0;i<inOrder.length;i++){
            if(inOrder[i]==rootData){
                inOrderIndex=i;
            }
        }

        BinaryTreeNode<Integer> leftNode= buildTreeUsingPreOrder(Arrays.copyOfRange(preOrder,1,inOrderIndex+1),Arrays.copyOfRange(inOrder,0,inOrderIndex));
        BinaryTreeNode<Integer> rightNode= buildTreeUsingPreOrder(Arrays.copyOfRange(preOrder,inOrderIndex+1,preOrder.length),Arrays.copyOfRange(inOrder,inOrderIndex+1,inOrder.length));
        root.left=leftNode;
        root.right=rightNode;
        return root;
    }

//    Using PostOrder and Inorder:---------------------------------------------------------->
    public static BinaryTreeNode<Integer> buildTreeUsingPostOrder(int[] postOrder, int[] inOrder) {
        //Your code goes here
        int postOrderIndex=-1;
        int inOrderIndex=-1;
        if(postOrder.length==0 || inOrder.length==0){
            return null;
        }
        int rootData=postOrder[postOrder.length-1];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        for(int i=0;i<inOrder.length;i++){
            if(inOrder[i]==rootData){
                inOrderIndex=i;
            }
        }

        BinaryTreeNode<Integer> leftNode= buildTreeUsingPostOrder(Arrays.copyOfRange(postOrder,0,inOrderIndex),Arrays.copyOfRange(inOrder,0,inOrderIndex));
        BinaryTreeNode<Integer> rightNode= buildTreeUsingPostOrder(Arrays.copyOfRange(postOrder,inOrderIndex,postOrder.length-1),Arrays.copyOfRange(inOrder,inOrderIndex+1,inOrder.length));
        root.left=leftNode;
        root.right=rightNode;
        return root;
    }
}
