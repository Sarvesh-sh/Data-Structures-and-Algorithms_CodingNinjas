package Binary_Trees;

public class PrintNodesAtDepthK {
    public static void printNodesAtDepthK(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        printNodesAtDepthK(root.left,k-1);
        printNodesAtDepthK(root.right,k-1);

    }
}
