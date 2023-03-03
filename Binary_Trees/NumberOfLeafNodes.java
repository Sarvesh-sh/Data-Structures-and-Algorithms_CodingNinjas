package Binary_Trees;

public class NumberOfLeafNodes {
    public static int numberOfLeafNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int numberOfLeafNodes=0;
        if(root.left==null && root.right==null){
            numberOfLeafNodes++;
            return numberOfLeafNodes;
        }
        numberOfLeafNodes+=numberOfLeafNodes(root.left)+numberOfLeafNodes(root.right);
        return numberOfLeafNodes;
    }
}
