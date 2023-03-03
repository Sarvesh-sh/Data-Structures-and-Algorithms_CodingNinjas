package Binary_Trees;

public class PrintBinaryTree {
    //    Methods to print the binary tree:---------------------->
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree((root.left));
        printTree(root.right);
    }

    public static void printTreeBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" : ");
        if(root.left!=null){
            System.out.print("L-"+root.left.data);
        }
        if(root.right!=null){
            System.out.print(" R-"+root.right.data);
        }
        System.out.println();
        printTreeBetter(root.left);
        printTreeBetter(root.right);
    }
//    ----------------------------------------------------------------------------------------------
}
