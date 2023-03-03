package Binary_Trees;

public class DiameterOfABinaryTree {
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        Answer ans= diameterOfBinaryTreeBetter(root);
        return ans.diameter;
    }

    public static Answer diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            int diameter=0;
            Answer ans= new Answer(0,0);
            return ans;
        }

        Answer leftOutput= diameterOfBinaryTreeBetter(root.left);
        Answer rightOutput=diameterOfBinaryTreeBetter(root.right);
        int height;
        int diameter;
        if(1+leftOutput.height+rightOutput.height> leftOutput.diameter && leftOutput.height+rightOutput.height>rightOutput.diameter){
            diameter=1+leftOutput.height+rightOutput.height;
            height=1+Math.max(leftOutput.height,rightOutput.height);
            Answer ans= new Answer(height,diameter);
            return ans;
        }
        else {
            height=1+Math.max(leftOutput.height,rightOutput.height);
            diameter=Math.max(leftOutput.diameter, rightOutput.diameter);
            Answer ans= new Answer(height,diameter);
            return ans;
        }
    }
}
class Answer{
    int height;
    int diameter;

    public Answer(int height,int diameter){
        this.height=height;

        this.diameter=diameter;

    }

}
