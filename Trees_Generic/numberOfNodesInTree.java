package Trees_Generic;

public class numberOfNodesInTree {
    public static int numberOfNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count=0;
        count=count+1;
        for (int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp = root.children.get(i);
            count+=numberOfNodes(temp);
        }
        return count;
    }
}
