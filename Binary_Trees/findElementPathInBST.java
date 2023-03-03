package Binary_Trees;

import java.util.ArrayList;

public class findElementPathInBST {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        // ArrayList<Integer> ans= new ArrayList<Integer>();
        if (root.data == data) {
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(data);
            return output;
        }
        if (root.data > data) {
            ArrayList<Integer> leftOutput = new ArrayList<Integer>();
            leftOutput = getPath(root.left, data);
            if (leftOutput != null) {
                leftOutput.add(root.data);
                // ans= leftOutput;
                // return ans;
                return leftOutput;
            } else {
                return null;
            }
        } else {
            ArrayList<Integer> rightOutput = new ArrayList<Integer>();
            rightOutput = getPath(root.right, data);
            if (rightOutput != null) {
                rightOutput.add(root.data);
                // ans= rightOutput;
                // return ans;
                return rightOutput;
            } else {
                return null;
            }
        }
    }
}
