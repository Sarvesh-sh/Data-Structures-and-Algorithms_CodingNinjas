package Linked_List;

public class InsertNodeInLinkedList {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        //Your code goes here
        Node<Integer> currentNode = new Node<Integer>(data);
        Node<Integer> temp = head;

        if(pos==0){
            currentNode.next= head;
            head = currentNode;
            return head;
        }
        int count=0;
        while(count<pos-1){
            if(temp.next==null){
                return head;
            }
            else{
                temp=temp.next;
                count++;
            }
        }
        currentNode.next= temp.next;
        temp.next= currentNode;
        return head;
    }

    public static Node<Integer> insertRecursinve(Node<Integer> head, int pos , int data){
        if(head==null && pos!=0){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode= new Node<Integer>(data);
            newNode.next= head;
            return newNode;
        }
        head.next= insertRecursinve(head.next,--pos,data);
        return head;
    }
}
