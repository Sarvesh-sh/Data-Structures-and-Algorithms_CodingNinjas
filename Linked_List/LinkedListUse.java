package Linked_List;

import java.util.Scanner;

import static Linked_List.InsertNodeInLinkedList.insert;
import static Linked_List.InsertNodeInLinkedList.insertRecursinve;

public class LinkedListUse {
    public static void main(String[] args) {

//        Creating a node in the main class:
//        Node<Integer> n1= new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);

//        Node<Integer> head= createLinkedList();
//        System.out.println(head);
        Node <Integer> head= takeInput();
//        print(head);
//        if(searchElement(5,head)){
//            System.out.println("5 exists in the linked list");
//        }
//        else{
//            System.out.println("5 doesn't exist in the linked list");
//        }
//        head= insert(head,3,50);
        print(head);
        head = insertRecursinve(head,6,6);
        print(head);
//        increment(head);
//        print(head);
    }
//    A method which creates an integer type Linked List:
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1= new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }

    public static void print(Node<Integer> head){

//        Bad but possible way of printing a Linked List:
//        System.out.print(head.data+" ");
//        System.out.print(head.next.data+" ");
//        System.out.print(head.next.next.data+" ");
//        System.out.print(head.next.next.next.data+" ");

//        Better way of printing the linked list:
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

//    Method to increment data inside each node of the Linked List:
    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp!= null){
            temp.data++;
            temp=temp.next;
        }
    }


//    Method to take the linked list as input from the user:
    public static Node<Integer> takeInput(){
        Scanner sc= new Scanner(System.in);
        Node<Integer> head= null;
        Node<Integer> tail=null;
        int data = sc.nextInt();
        while(data!=-1){
            Node<Integer> currentNode= new Node<Integer>(data);
            if(head==null){
                head=currentNode;
                tail=currentNode;
            }
            else{
//                Node<Integer> tail = head;
//                while(tail.next!=null){
//                    tail=tail.next;

//                }
                tail.next=currentNode;
                tail=currentNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

//    Method to check if an element exists in the linked list or not:
    public static boolean searchElement(int data,Node<Integer> head){
        Node<Integer> temp = head;
        while(temp.next!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        if(temp.data==data) return true;
        return false;
    }
////    Method to insert a node in the linked list:
//    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
//        //Your code goes here
//        Node<Integer> currentNode = new Node<Integer>(data);
//        Node<Integer> temp = head;
//        if(pos==0){
//            currentNode.next= head;
//            head = currentNode;
//            return head;
//        }
//        int count=0;
//        while(count<pos-1){
//            if(temp.next==null){
//                return head;
//            }
//            else{
//                temp=temp.next;
//                count++;
//            }
//        }
//        currentNode.next= temp.next;
//        temp.next= currentNode;
//        return head;
//    }
}
