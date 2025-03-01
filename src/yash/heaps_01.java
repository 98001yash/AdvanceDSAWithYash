//package yash
//import java.util.PriorityQueue;
//

//performing the basic  operations on the heaps
// the top elements in the heaps will be the smallest elements of the heaps
//  public class heaps {
//    public static void main(String[] args){
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(2); // adding the elements in the heaps
//        System.out.println(pq+" "+pq.peek());
//        pq.add(10);
//        System.out.println(pq+" "+pq.peek());
//        pq.add(5);
//        System.out.println(pq+" "+pq.peek());
//        pq.add(0);
//        System.out.println(pq+" "+pq.peek());
//        pq.remove();// removing the  elements from the heaps
//        System.out.println(pq+" "+pq.peek());
//        pq.add(-9);
//        System.out.println(pq+" "+pq.peek());
//    }
//}





// lecture number 2
//package yash;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//   PriorityQueue<Integer> pq = new PriorityQueue<>();
//   pq.add(2);
//        System.out.println(pq);
//        pq.add(12);
//        System.out.println(pq);
//        pq.add(7);
//        System.out.println(pq);
//        pq.add(89);
//        System.out.println(pq);
//        pq.add(0);
//        System.out.println(pq);
//    }
//}



// lecture number 3
// ArrayList Vs MinHeap



// lecture number 4
// maxHeap
//package yash;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//   pq.add(2);
//        System.out.println(pq);
//        pq.add(12);
//        System.out.println(pq);
//        pq.add(7);
//        System.out.println(pq);
//        pq.add(89);
//        System.out.println(pq);
//        pq.add(0);
//        System.out.println(pq);
//    }
//}



// lecture number 5
// problem identification
// finding the kth smallest element in the given array

//package yash;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr = {10,2,8,-6,-2,9,12};
//        int k = 4;
//
        // 1 st approach
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int ele:arr){
//            pq.add(ele);
//        }
//        for(int i=0;i<=k-1;i++){
//            pq.remove();
//
//        }



       // 2nd approcoh
        // solving by using the maxheap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int ele:arr){
//            pq.add(ele);
//            if(pq.size()>k) pq.remove();
//        }
//        System.out.println(pq.peek());
//    }
//}


// lecture number 6;
// leetcode 215
// finding the kth largest element in the given array
//package yash;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr ={10,2,8,-6,-2,9,12};
//        int k = 3;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int ele:arr){
//            pq.add(ele);
//            if(pq.size()>k) pq.remove();
//        }
//        System.out.println(pq.peek());
//    }
//}





// lecture number 7
// sort a "k" sorted array
//package yash;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr = {6,5,3,2,10,9};
//        int k = 2;
//        List<Integer> ans = new ArrayList<>();
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//           for(int ele:arr){
//               pq.add(ele);
//               if(pq.size()>k) ans.add(pq.remove());
//           }
//           while(pq.size()>0){
//               ans.add(pq.remove());
//           }
//        System.out.println(ans);
//
//    }
//}






// lecture number 8;
//leetcode   973
// K-Closet Points to origin
//package yash;
//
//import java.util.*;
//public class heaps_01 {
//
//static class Pair {
//    int x, y;
//
//    public Pair(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//
//public int[][] kClosest(int[][] points, int k) {
//    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
//    HashMap<Integer, Pair> map = new HashMap<>();
//
//    for (int i = 0; i < points.length; i++) {
//        int x = points[i][0], y = points[i][1];
//        int d2 = x * x + y * y;
//            pq.add(d2);
//            map.put(d2,new Pair(x,y));
//            if(pq.size()>k) pq.remove();
//        }
//    int[][] ans = new int[k][2];
//    for(int i=0;i<k;i++){
//        int dist = pq.remove();
//        Pair pt = map.get(dist);
//        ans[i][0] = pt.x;
//        ans[i][1] =pt.y;
//    }
//    return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}



// leetcode 658
//lecture number 9;
// find k Closest Elements

//package yash;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//
//    }
//}




// top frequent elements

//package yash;
//import java.util.*;
//public class Pair implements Comparable<Pair> {
//    int ele;
//    int freq;
//
//    Pair(int ele, int freq) {
//        this.ele = ele;
//        this.freq = freq;
//
//    }
//
//    public int compareTo(Pair p) {
//        return this.freq = freq;
//
//    }
//}
//    public class heaps_01 {
//
//
//        public int[] topKElement(int[] arr, int k) {
//            int[] ans = new int[k];
//            HashMap<Integer, Integer> map = new HashMap<>();
//            for (int ele : arr) {
//                if (map.containsKey(ele)) {
//                    map.put(ele, map.get(ele) + 1);
//                } else {
//                    map.put(ele, 1);
//                }
//                PriorityQueue<Integer> pq = new PriorityQueue<>();
//                for (ele:
//                     map.keySet()) {
//                    int freq = map.get(ele);
//                    pq.add(new Pair(ele, freq));
//                    if (pq.size() > k) pq.remove();
//                }
//            }
//                return ans;
//
//
//
//        }
//            public static void main (String[]args){
//
//            }
//        }
//
