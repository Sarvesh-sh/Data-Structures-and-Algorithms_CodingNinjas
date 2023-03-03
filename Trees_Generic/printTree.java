package Trees_Generic;

public class printTree {

    public static void printTreePreOrderWise(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp=root.children.get(i);
//            System.out.println(temp);
            printTreePreOrderWise(temp);
        }
    }
//    ---------------------------------------------------------------------------------

    public static void printTreeBetter(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp=root.children.get(i);
            System.out.print(temp.data+" ");
        }
        System.out.println();
        for(int j=0;j<root.children.size();j++){
            TreeNode<Integer> temp=root.children.get(j);
            printTreeBetter(temp);
        }
    }
}
