package yash;
//lecture number 1
// heap visualization





// lecture number 2
// imolement the minheao by the Array
//package yash;
//import java.util.*;
//class MinHeap {
//    int[] arr;
//    int size;
//    MinHeap(int capacity){
//        arr = new int[capacity];
//        size = 0;
//
//    }
//    public void swap(int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j]  = temp;
//    }
//    public void upheapify(int idx){
//        if(idx==0) return;
//        int parent = (idx-1)/2;
//        if(arr[idx]<arr[parent]){
//            swap(idx,parent);
//        }
//    }
//    public void downheapify(int i){
// if(i>=size) return;
//        int lc = 2*i+1;
//        int rc = 2*1+2;
//
//
//        int minIdx = i;
//        if(lc<=size&&arr[lc]< arr[minIdx]) minIdx = lc;
//        if(rc<=size&&arr[rc]<arr[minIdx]) minIdx = rc;
//        if(i==minIdx) return;
//        swap(i,minIdx);
//        downheapify(minIdx);
//
//    }
//    public int size(){
//        return size;
//    }
//    public void add(int num){
//        if(size==arr.length){
//            System.out.println("Heap is Full");
//        }
//        arr[size++] = num;
//        upheapify(size-1);
//    }
//    public int peek(){
//        if(size==0){
//            System.out.println("heap is empty");
//            return -1;
//        }
//        return arr[0];
//    }
//
//    public int remove(){
//        if(size==0){
//            System.out.println("Heap is empty");
//        }
//        int peek = arr[0];
//        swap(0,size-1);
//        size--;
//        downheapify(0);
//        return peek;
//    }
//}
//public class heaps_02 {
//    public static void main(String[] args){
//        MinHeap pq =new MinHeap(10);
//         pq.add(1);
//         pq.add(6);
//         pq.add(2);
//        System.out.println(pq.size());
//        pq.add(5);
//        pq.remove();
//        System.out.println(pq.size());
//        System.out.println(pq.peek());
//
//    }
//}



//package yash;
// convert BST to MaxHeap
//import java.util.*;
//public class heaps_02 {
//    public static void main(String[] args){
//
//    }
//}


//class Node {
//    int val;
//    Node left;
//    Node right;
//    Node(int val){
//        this.val = val;
//
//    }
//}
//public class heaps_02 {
//    public static boolean isHeap(Node root){
//        if(root==null) return true;
//        if(root.left!=null&& root.val<root.left.val) return false;
//        if(root.right!=null&& root.val>root.right.val) return false;
//        return isHeap(root.left)&& isHeap(root.right);
//    }
//    public static boolean isCBT(Node root, int i, Integer n){
//        if(root==null) return true;
//        if(i>=n) return false;
//        return isCBT(root.left,2*i+1,n)&& isCBT(root.right, 2 * i+2,n);
//
//
//    }
//    private static int size(Node root){
//        if(root==null) return 0;
//        return 1+ size(root.left)+ size(root.right);
//    }
//    public static boolean isMaxHeap(Node root){
//        int n  = size(root);
//        return isHeap(root)&& isCBT(root,0,n);
//    }
//    public static void main(String[] args){
//        Node a = new Node(10);
//         Node b  = new Node(41);
//
//        Node c = new Node(3);
//        Node d = new Node(2);
//        Node e = new Node(6);
//        Node f = new Node(5);
//        a.left = b; a.right = c;
//        b.left  = d; b.right = e;
//        c.left =f;
//        System.out.println(isMaxHeap(a));
//    }
//
//}
//


// leetcode 295
//    Brute force approach

//
//public class heaps_02 {
//    public class MedianFinder {
//        List<Integer> arr = new ArrayList<>();
//
//        public MedianFinder(){
//
//        }
//
//        public void addNum(int num){
//            arr.add(num);
//
//
//        }
//        public double findMedian(){
//            Collections.sort(arr);
//            int n = arr.size();
//            if(arr.size()%2!=0) return arr.get(n/2);
//            else return (arr.get(n/2)+arr.get(n/2-1))/2.0;
//
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}


// 2nd approach


//import java.util.*;
//public class heaps_02 {
//    public class MedianFinder {
//        public void swap(int i, int j){
//            int temp = arr.get(i);
//            arr.set(i,arr.get(j));
//            arr.set(j,temp);
//         }
//        List<Integer> arr = new ArrayList<>();
//
//        public  MedianFinder(){
//
//        }
//
//        public void addNum(int num){
//            arr.add(num);
//            int i = arr.size()-1;
//            while(i>0){
//                if(arr.get(i)<arr.get(i-1)){
//                    swap(i,i-1);
//                    i--;
//
//                }
//                else break;
//            }
//
//
//        }
//        public double findMedian(){
//
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}


//public class heaps_02 {
//    public class MedianFinder {
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
//        PriorityQueue<Integer> minHeap  = new PriorityQueue<>();
//        public MedianFinder(){
//
//        }
//        public void addNum(int num){
//        if(maxHeap.size()==0)maxHeap.add(num);
//        else {
//            if(num<maxHeap.peek()) maxHeap.add(num);
//            else minHeap.add(num);
//        }
//
//        // balance the heaps
//            if(maxHeap.size()==minHeap.size()+2){
//                int top = maxHeap.remove();
//                minHeap.add(top);
//            }
//            if(minHeap.size()==maxHeap.size()+2){
//                int top = minHeap.remove();
//                maxHeap.add(top);
//            }
//        }
//        public double findMedian(){
//                if(maxHeap.size()==minHeap.size())
//                    return (maxHeap.peek()+minHeap.peek())/2.0;
//                else if(maxHeap.size()>minHeap.size())
//                    return maxHeap.peek();
//                else return minHeap.peek();
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}





// leetcode 532
// smallest range covering elements from k lists

//import java.util.*;
//public class heaps_02 {
//    public class Triplet implements Comparable<Triplet>{
//        int ele;
//        int row;
//        int col;
//        Triplet(int ele, int row, int col) {
//            this.ele = ele;
//             this.row = row;
//             this.col = col;
//        }
//        public int compareTo(Triplet t){
//            return this.ele  - t.ele;
//        }
//    }
//    public int[] smallestRange(List<List<Integer>> nums){
//        int[] ans = {0,Integer.MAX_VALUE};
//        PriorityQueue<Triplet> pq = new PriorityQueue<>();
//        int k = nums.size();
//        int max = Integer.MAX_VALUE;
//        for(int i=0;i<k;i++){
//            int ele = nums.get(i).get(0);
//            pq.add(new  Triplet(ele,i,0));
//              max =  Math.max(max,ele);
//
//        }
//        while(true){
//            Triplet top = pq.remove();
//            int ele = top.ele,row  = top.row, col = top.col;
//            //update the minimum range
//            if(max-ele<ans[1] - ans[0]){
//                ans[0] = ele;
//                ans[1]  =max;
//
//            }
//            if(col==nums.get(row).size()-1) break;
//            int next = nums.get(row).get(col+1);
//            max = Math.max(max,next);
//            pq.add(new Triplet(next,row,col+1));
//        }
//
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}