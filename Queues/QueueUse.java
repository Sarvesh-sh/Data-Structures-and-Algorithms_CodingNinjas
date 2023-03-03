package Queues;

public class QueueUse {

    public static void main(String[] args) throws QueueFullException, QueueEmptyException {

//        ****Different ways to implement Queue:----->

//        QueueUsingArray queue= new QueueUsingArray();
//        QueueUsingLinkedList<Integer> queue= new QueueUsingLinkedList<Integer>();
        QueueUsingStacks<Integer> queue= new QueueUsingStacks<>();


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
//        System.out.println(queue.size());
//        System.out.println(queue.front());
        queue.dequeue();
        queue.dequeue();
//        System.out.println(queue.size());
//        System.out.println(queue.front());
//        System.out.println(queue.isEmpty());
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
//        System.out.println(queue.size());
        queue.enqueue(70);
        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
//        printFibonacciUsingQueue(5);

    }

//    Function to Print the fibonacci numbers using Queue:
//    public static void printFibonacciUsingQueue(int noOfElement) throws QueueFullException, QueueEmptyException {
//        QueueUsingArray q= new QueueUsingArray(noOfElement);
//        q.enqueue(0);
//        q.enqueue(1);
//        for (int i = 0; i < noOfElement; i++)
//        {
//            int a = q.dequeue();
//            int b = q.dequeue();
//            q.enqueue(b);
//            q.enqueue(a + b);
//            System.out.print(a);
//        }
//    }
}
