package Binary_Trees;

public class IsBinaryTreeBalanced {

    public static BalancedTreeReturn isBinaryTreeBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            BalancedTreeReturn ans= new BalancedTreeReturn(0,true);
            return ans;
        }

        BalancedTreeReturn leftOutput = isBinaryTreeBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBinaryTreeBalancedBetter(root.right);

        int height=1+ leftOutput.height+ rightOutput.height;
        boolean isBal=true;

        if(Math.abs(leftOutput.height-rightOutput.height)>1 || !leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal=false;
        }
//        if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
//            isBal=false;
//        }
        BalancedTreeReturn ans= new BalancedTreeReturn(height,isBal);
        return ans;
    }



    public static boolean isBinaryTreeBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int heightLeft= heightOfBinaryTree(root.left);
        int heightRight= heightOfBinaryTree(root.right);
        if(Math.abs(heightRight-heightLeft)>1){
            return false;
        }

        boolean isLeftBalanced=isBinaryTreeBalanced(root.left);
        boolean isRightBalanced=isBinaryTreeBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    public static int heightOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int heightLeft=heightOfBinaryTree(root.left);
        int heightRight=heightOfBinaryTree(root.right);

        return 1+Math.max(heightLeft,heightRight);
    }
}
