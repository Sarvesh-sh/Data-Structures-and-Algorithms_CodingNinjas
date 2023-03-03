package Binary_Trees;

import Linked_List.Node;

public class BST_to_LinkedList {
    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }
        Helper2 ans= constructLinkedList2(root);
        Node<Integer> head= ans.head;
        return head;
    }

    public static Helper2 constructLinkedList2(BinaryTreeNode<Integer> root){
        if(root.left==null && root.right==null){
            Node<Integer> lnode= new Node(root.data);
            Helper2 node= new Helper2(lnode,lnode);
            return node;
        }
        Helper2 leftOutput;
        Helper2 rightOutput;
        if(root.left!=null){
            leftOutput= constructLinkedList2(root.left);
        }
        else{
            Node<Integer> rootNode= new Node<Integer>(root.data);
            rightOutput=constructLinkedList2(root.right);
            rootNode.next=rightOutput.head;
            Helper2 node= new Helper2(rootNode,rightOutput.tail);
            return node;
        }

        if(root.right!=null){
            rightOutput=constructLinkedList2(root.right);
        }
        else{
            Node<Integer> rootNode= new Node<Integer>(root.data);
            leftOutput=constructLinkedList2(root.left);
            leftOutput.tail.next=rootNode;
            Helper2 node= new Helper2(leftOutput.head,rootNode);
            return node;
        }
        Node<Integer> rootNode= new Node<Integer>(root.data);
        leftOutput.tail.next=rootNode;
        rootNode.next=rightOutput.head;
        Helper2 node= new Helper2(leftOutput.head,rightOutput.tail);
        return node;
    }
}

class Helper2{
    Node<Integer> head;
    Node<Integer> tail;

    public Helper2(Node<Integer> head,Node<Integer> tail){
        this.head=head;
        this.tail=tail;
    }
}
