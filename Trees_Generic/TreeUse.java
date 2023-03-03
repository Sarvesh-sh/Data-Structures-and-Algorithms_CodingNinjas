package Trees_Generic;

import static Trees_Generic.numberOfNodesInTree.numberOfNodes;
import static Trees_Generic.printTree.printTreeBetter;
import static Trees_Generic.printTree.printTreePreOrderWise;
import static Trees_Generic.takingInput.takeInputLevelWise;
import static Trees_Generic.takingInput.takeInputRecursive;

public class TreeUse {
    public static void main(String[] args) {
        TreeNode<Integer> node1= new TreeNode<>(10);
        TreeNode<Integer> node2= new TreeNode<>(20);
        TreeNode<Integer> node3= new TreeNode<>(30);
        TreeNode<Integer> node4= new TreeNode<>(40);
        TreeNode<Integer> node5= new TreeNode<>(50);
        TreeNode<Integer> node6= new TreeNode<>(60);
        TreeNode<Integer> node7= new TreeNode<>(70);

        node1.children.add(node2);
        node1.children.add(node3);
        node1.children.add(node4);
        node2.children.add(node5);
        node2.children.add(node6);
        node4.children.add(node7);
//        printTreePreOrderWise(node1);
//        printTreeBetter(node1);
//        System.out.println(numberOfNodes(node1));
        TreeNode<Integer> root=takeInputLevelWise();
//        TreeNode<Integer> root=takeInputRecursive(null);
        printTreeBetter(root);
    }
}
