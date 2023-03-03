package Trees_Generic;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class takingInput {
    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the root element: ");
        TreeNode<Integer> root=new TreeNode<Integer>(sc.nextInt());
        if(root.data==null){
            return null;
        }
        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
        q.add(root);
        while(!q.isEmpty()){
            System.out.println("Enter the number of children of: "+ q.peek().data);
            int numberOfChildren=sc.nextInt();
            TreeNode<Integer> temp= q.remove();
            for(int i=1;i<=numberOfChildren;i++){
                System.out.println("Enter the child no "+i+" of "+temp.data);
                TreeNode<Integer> child = new TreeNode<>(sc.nextInt());
                q.add(child);
                temp.children.add(child);
            }


        }
        return root;
    }
//    -----------------------------------------------------------------------------------------
    public static TreeNode<Integer> takeInputRecursive(TreeNode<Integer> root){
//        TreeNode<Integer> root=null;
        Scanner sc= new Scanner(System.in);
        if(root==null){
            System.out.println("Enter the root");
            root = new TreeNode<Integer>(sc.nextInt());
        }
        System.out.println("Enter the number of children of "+root.data);
        int numberOfChildren=sc.nextInt();

        for(int i=1;i<=numberOfChildren;i++){
            System.out.println("Enter child number "+i+" of "+root.data);
            TreeNode<Integer> child= new TreeNode<>(sc.nextInt());
            root.children.add(child);
            takeInputRecursive(child);
        }
//        System.out.println("Enter the children of "+root.data);
        return root;
    }
}
