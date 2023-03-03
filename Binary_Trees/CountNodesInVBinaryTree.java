package Binary_Trees;

public class CountNodesInVBinaryTree {
    public static int countNodes(BinaryTreeNode<Integer> root){
        int count=0;
        if(root==null){
            return 0;
        }
        count++;
        count+=countNodes(root.left)+countNodes(root.right);

        return count;
    }
}
