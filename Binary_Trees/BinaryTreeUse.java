package Binary_Trees;

import java.util.Arrays;
import java.util.Scanner;

import static Binary_Trees.CountNodesInVBinaryTree.countNodes;
import static Binary_Trees.IsBinaryTreeBalanced.isBinaryTreeBalancedBetter;
import static Binary_Trees.LargestNodeInTree.largestNode;
import static Binary_Trees.NumberOfLeafNodes.numberOfLeafNodes;
import static Binary_Trees.PrintBinaryTree.printTreeBetter;
import static Binary_Trees.PrintNodesAtDepthK.printNodesAtDepthK;
import static Binary_Trees.RemoveLeafNodes.removeLeafNodes;
import static Binary_Trees.TakingInput.*;
import static Binary_Trees.MinAndMaxInBinaryTreeQuestion.getMinAndMax;

public class BinaryTreeUse {
    public static void main(String[] args) {

//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//        root.left = rootLeft;
//        root.right = rootRight;
//        BinaryTreeNode<Integer> toLeft = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> toRight = new BinaryTreeNode<>(5);
//        rootLeft.left = toLeft;
//        rootRight.right = toRight;

//        printTree(root);
//        printTreeBetter(root);

//        BinaryTreeNode<Integer> root = takeTreeInput();
//        BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,false);
//        BinaryTreeNode<Integer> root = takeTreeInputLevelWise();
//        printTreeBetter(root);
//        Pair<Integer,Integer> ans= getMinAndMax(root);
//        System.out.println("Minimum in the tree is: "+ans.minimum+" and maximum in the tree is: "+ans.maximum);
//
//        System.out.println("The number of nodes in the binary tree are: "+countNodes(root));
//
//        System.out.println("The largest node is:  "+largestNode(root));
//
//        System.out.println("The number of leaf nodes in this tree are: "+numberOfLeafNodes(root));
//
//        System.out.println("The elements at depth 3 are ");
//        printNodesAtDepthK(root,2);
//
//        root = removeLeafNodes(root);
//        printTreeBetter(root);

//        BalancedTreeReturn ans= isBinaryTreeBalancedBetter(root);
//        System.out.println("The tree is balanced: "+ans.isBalanced);

        BST obj= new BST();
        System.out.println(obj.isPresent(5));
        System.out.println(obj.size());
        obj.insert(6);
        obj.insert(5);
        obj.insert(4);
        obj.insert(9);
        obj.insert(3);
        obj.printTree();
        obj.deleteData(5);
        obj.printTree();
    }




}
