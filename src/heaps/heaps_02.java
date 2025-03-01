//package heaps;
//
//import java.util.*;
//                                       // implement the minHeap by array and visualize by the binary trees
//class MinHeap {
//    int[] arr;
//    int size = 0;
//    MinHeap(int capacity){
//        arr = new int[capacity];
//        size = 0;
//    }
//    public void swap(int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public void add(int num){
//        if(size==arr.length){
//            System.out.println("heap is full...");
//            return;
//        }
//        arr[size++] = num;
//        upheapify(size-1);
//    }
//    public void upheapify(int idx){
//        if(idx==0) return;
//        int parent = (idx-1)/2;
//        if(arr[idx]<arr[parent]){
//            swap(idx,parent);
//            upheapify(parent);
//        }
//    }
//    public int size(){
//        return size;
//    }
//    public int peek() throws Exception{
//        if(size==0){
//            throw new Exception("Heap is Empty..");
//        }
//        return arr[0];
//    }
//    public void downheapify(int i){
//        if(i>=size) return;
//        int lc = 2*i+1;
//        int rc = 2*i + 2;
//        int minIdx = i;
//        if(lc>=size && arr[lc]<arr[minIdx]) minIdx  = lc;
//        if(rc>=size && arr[rc]<arr[minIdx]) minIdx = rc;
//        if(i==minIdx) return;
//        swap(i,minIdx);
//        downheapify(minIdx);
//    }
//
//    public int remove() throws Exception {
//        if(size==0) throw new Exception("Heap is Empty");
//        int peek = arr[0];
//        swap(0,size-1);
//        size--;
//        downheapify(0);
//        return peek;
//    }
//}
//
//public class heaps_02 {
//    public static void main(String[] args) throws Exception {
//        MinHeap pq = new MinHeap(10);
//        pq.add(1);
//        pq.add(2);
//        pq.add(6);
//        System.out.println(pq.size());
//        pq.add(0);
//        System.out.println(pq.peek());
//        pq.remove();
//        System.out.println(pq.peek());
//    }
//}


package heaps;
import java.util.*;
public class heaps_02 {
    public static void main(String[] args){
   System.out.println("Hello worls");
    }
}
