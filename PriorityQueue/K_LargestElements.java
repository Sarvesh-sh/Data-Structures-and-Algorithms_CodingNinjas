package PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_LargestElements {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,7,5,9,8};
        ArrayList<Integer> kLargestElements= kLargest(arr,3);

    }
    public static ArrayList<Integer> kLargest(int input[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(input.length==0){
            return null;
        }
        for(int i=0;i<input.length;i++){
            if(i<k){
                pq.add(input[i]);
                continue;
            }
            int smallestInPQ=pq.peek();
            if(smallestInPQ < input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
        for(int i=0;i<k;i++){
            ans.add(pq.poll());
        }
        return ans;

    }
}
