package HashMaps;

import java.util.ArrayList;

public class map_Implementation<K,V> {
    ArrayList<mapNode<K,V>> buckets;
    int count;
    int numBuckets;
    public map_Implementation(){
        buckets = new ArrayList<>();
        numBuckets=20;
        for(int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
    }
    public int getBucketIndex(K key){
        int hc= key.hashCode();
        int index= hc%numBuckets;
        return index;
    }
    public void insert(K key, V value){
        int bucketIndex= getBucketIndex(key);
        mapNode<K,V> head= buckets.get(bucketIndex);
//        if element is already there simply update its value;
        while (head.next!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
//        if it is not there create the node make it the head and update the value at bucketIndex in the bucket;
        head=buckets.get(bucketIndex);
        mapNode<K,V> newNode= new mapNode<>(key,value);
        newNode.next=head;
        buckets.set(bucketIndex,newNode);
        count++;
        double loadFactor= (1.0*count)/numBuckets;
        if(loadFactor>0.7){
            rehash();
        }
    }

    public int size(){
        return count;
    }

    public V getValue(K key){
        int keyIndex=getBucketIndex(key);
        mapNode<K,V> head = buckets.get(keyIndex);
        while(!(head.next==null)){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
//    function to remove a key and return the value associated with that key;
    public boolean search(K key){
        int keyIndex=getBucketIndex(key);
        mapNode<K,V> head = buckets.get(keyIndex);
        while(!(head.next==null)){
            if(head.key.equals(key)){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public V removeKey(K key){
        int keyIndex=getBucketIndex(key);
        mapNode<K,V> head= buckets.get(keyIndex);
        mapNode<K,V> prevNode= null;
        while(!(head.next==null)){
            if(head.key.equals(key)){
                if(prevNode!=null) {
                    V ans = head.value;
                    mapNode<K, V> temp = head.next;
                    prevNode.next = temp;
                    count--;
                    return ans;
                }
                else{
                    buckets.set(keyIndex,head.next);
                }
            }
            prevNode=head;
            head=head.next;
        }
        return null;
    }
    public void rehash(){
        ArrayList<mapNode<K,V>> temp=buckets;
        buckets=new ArrayList<>();
        for(int i=0;i<2*numBuckets;i++){
            buckets.add(null);
        }
        count=0;
        numBuckets=2*numBuckets;
        for(int i=0;i< temp.size();i++){
            mapNode<K,V> head= temp.get(i);
            while(head.next!=null){
                K key = head.key;
                V value = head.value;
                insert(key,value);
            }
        }

    }
    public double loadFactor(){
        return (1.0*count)/numBuckets;
    }
}
