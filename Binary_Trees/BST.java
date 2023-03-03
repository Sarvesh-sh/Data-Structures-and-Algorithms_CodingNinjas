package Binary_Trees;

import static Binary_Trees.LargestNodeInTree.largestNode;
import static Binary_Trees.LargestNodeInTree.smallestNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size=0;
//    ---------------------isPresent Method------------------------------------------
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x){
        if(node==null){
            return false;
        }
        if(node.data==x){
            return true;
        }
        else if(node.data>x){
            return isPresentHelper(node.left,x);
        }
        else{
            return isPresentHelper(node.right,x);
        }
    }
    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }

//----------------Insert Method------------------------------------------------------
    public void insert(int x){
        root= insertHelper(root,x);
        size++;
    }
    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node,int x){
        if(node==null){
            node=new BinaryTreeNode<Integer>(x);
            return node;
        }
        if(x<node.data){
            BinaryTreeNode<Integer> leftNode=insertHelper(node.left,x);
            node.left=leftNode;
        }
        else{
            BinaryTreeNode<Integer> rightNode= insertHelper(node.right,x);
            node.right=rightNode;
        }
        return node;
    }

//--------------------------DELETE DATA METHOD-----------------------------------------------------
    public boolean deleteData(int x){
        deleteHelperClass ans = deleteDataHelper(root,x);
        root= ans.node;
        if(ans.wasDeleted){
            size--;
        }
        return ans.wasDeleted;
    }
    private deleteHelperClass deleteDataHelper(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return new deleteHelperClass(null,false);

        }
        if(root.data<x){
            deleteHelperClass rightOutput=deleteDataHelper(root.right,x);
            BinaryTreeNode<Integer> newRight=rightOutput.node;
            root.right= newRight;
            rightOutput.node=root;
            return rightOutput;
        }
        if(root.data>x){
            deleteHelperClass leftOutput=deleteDataHelper(root.left,x);
            BinaryTreeNode<Integer> newLeft=leftOutput.node;
            root.left= newLeft;
            leftOutput.node=root;
            return leftOutput;
        }
        if(root.left==null && root.right==null){
            return new deleteHelperClass(null,true);
        }
        if(root.left!=null && root.right==null){
            return new deleteHelperClass(root.left,true);
        }
        if(root.left==null && root.right!=null){
            return new deleteHelperClass(root.right,true);
        }
        int rightMin=smallestNode(root.right);
        root.data=rightMin;
        deleteHelperClass outputRight=deleteDataHelper(root.right,rightMin);
        root.right=outputRight.node;
        return new deleteHelperClass(root,true);

//
    }
//------------------------------SIZE METHOD-------------------------------------
    public int size(){
        return size;
    }
//-------------------------------PRINTTREE METHOD-------------------------------
    public void printTree(){
        printTreeHelper(root);
    }
    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node==null){
            return;
        }
        System.out.print(node.data+":");
        if(node.left!=null){
            System.out.print(" L "+node.left.data);
        }
        if(node.right==null){
            System.out.println();
        }
        if(node.right!=null){
            System.out.println(" R "+node.right.data);
        }

        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
}


class deleteHelperClass{
    BinaryTreeNode<Integer> node;
    boolean wasDeleted;
    public deleteHelperClass(BinaryTreeNode<Integer> node,boolean x){
        this.node=node;
        this.wasDeleted=x;
    }
}
