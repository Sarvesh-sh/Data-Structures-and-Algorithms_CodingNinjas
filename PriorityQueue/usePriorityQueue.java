package PriorityQueue;

public class usePriorityQueue {
    public static void main(String[] args) throws PriorityQueueEmptyException {
        Priority_Queue<Integer> q = new Priority_Queue<>();
        System.out.println(q.isEmpty());
        q.insert(50,1);
        q.insert(100,2);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.getMin());
        System.out.println(q.removeMinAgain());
        System.out.println(q.size());
    }
}
