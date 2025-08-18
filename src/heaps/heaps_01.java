//package heaps;
//import java.util.*;
//// it is the basically the priority Queue
//// Basic heap implementation
//public class heaps_01 {
//    public static void main(String[] args){
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        pq.add(1);
//        pq.add(2);
//        System.out.println(pq);
//        pq.add(4);
//        pq.add(5);
//        System.out.println(pq);
//        pq.add(89);
//        pq.poll();
//        System.out.println(pq);
//
//    }
//}


//    we are creating the maxHeap and doing operations
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//                                                                                                                                                                                                                                                                                                                                                                                                                                                            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        pq.add(1);
//        pq.add(2);
//        System.out.println(pq);
//        System.out.println(pq.peek());
//        pq.add(3);
//        pq.add(4);
//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq);
//    }
//}

// Find the  kth smallest element in the given array
   // we are using the minheap
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr = {10,2,8,3,-6,-2,9,-12};
//        int k =4;
//
//        // Worst approach
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int ele:arr){
//             pq.add(ele);
//         }
//         for(int i=1;i<=k-1;i++){
//             pq.remove();
//         }
//        System.out.println(pq.peek());
//    }
//}


// now we will solve with the help of the maxheap

//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr = {10,2,8,3,-6,-2,9,12};
//        int n =arr.length;
//        int k = 2;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int ele:arr){
//            pq.add(ele);
//            if(pq.size()>k) pq.remove();
//        }
//        System.out.println(pq.peek());
//    }
//}





// Now we are finding the kth Largest Element
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr ={10,2,3,8,-6,-2,9,12};
//        int n = arr.length;
//        int k = 2;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int ele: e);
//            if(pq.size()>k) pq.remove();
//        }
//        System.out.println(pq.peek());
//    }
//}


 //  kth sorted array or nearly sorted array
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public static void main(String[] args){
//        int[] arr = {6,5,3,2,8,10,9};
//        int n = arr.length;
//        List<Integer> ans = new ArrayList<>();
//        int k = 3;
//           MinHeap
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int ele:arr){
//            pq.add(ele);
//            if(pq.size()>k) ans.add(pq.remove());
//        }
//        while(pq.size()>0){
//            ans.add(pq.remove());
//        }
//        System.out.println(ans);
//    }
//}




 // This is The method-1  using HashMap
// Not so effective
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public class Pair {
//        int x;
//        int y;
//        Pair(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//    }
//    public int[][] kthSmallest(int[][] points, int k){
//        //MaxHeap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        HashMap<Integer,Pair> map = new HashMap<>();
//        for(int i=0;i<points.length;i++){
//            int x = points[i][0], y  =points[i][1];
//            int d2 = x*x + y*y;
//            pq.add(d2);
//            Pair coordinates = new Pair(x,y);
//            map.put(d2,coordinates);
//
//            if(pq.size()>k) pq.remove();
//        }
//        int[][] ans = new int[k][2];
//        for(int i=0;i<k;i++){
//            int dist = pq.remove();
//            Pair pt = map.get(dist);
//            ans[i][0] = pt.x;
//            ans[i][1] = pt.y;
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}

                 // revision of the above code
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public class Pair {
//        int x;
//        int y;
//
//        Pair(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//        public  int[][] kthSmallest(int[][] points, int k){
//            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//            HashMap<Integer,Pair> map = new HashMap<>();
//            for(int i=0;i<points.length;i++){
//                int x = points[i][0];
//                int y = points[i][1];
//                int d2 = x*x + y*y;
//                pq.add(d2);
//                Pair coordinates = new Pair(x,y);
//                map.put(d2,coordinates);
//
//                if(pq.size()>k) pq.remove();
//            }
//            int[][] ans = new int[k][2];
//            for(int i=0;i<k;i++) {
//                int dist = pq.remove();
//                Pair pt = map.get(dist);
//                ans[i][0] = pt.x;
//                ans[i][1] = pt.y;
//            }
//            return ans;
//
//    }
//    public static void main(String[] args){
//
//    }
//}



// now we will solve with the help of the custom comparator
//package heaps;
//import java.util.*;
//public class heaps_01{
//    public class Triplet implements Comparable<Triplet>{
//        int d;
//        int x;
//        int y;
//        Triplet(int d, int x, int y){
//            this.d = d;
//            this.x = x;
//            this.y = y;
//        }
//        @Override
//        public int compareTo(Triplet t) {
//            return this.d  - t.d;
//        }
//
//
//    }
//    public int[][] kClosest(int[][] points, int k){
//    // MaxHeap
//        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i=0;i<points.length;i++){
//            int x = points[i][0] , y = points[i][1];
//            int d =x*x + y*y;
//            pq.add(new Triplet(d,x,y));
//            if(pq.size()>k) pq.remove();
//        }
//        int[][] ans = new int[k][2];
//        for(int i=0;i<k;i++){
//            Triplet t = pq.remove();
//            ans[i][0] = t.x;
//            ans[i][1] = t.y;
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}

//package heaps;
//import java.util.*;
//public class heaps_01{
//    public class Triplet implements Comparable<Triplet>{
//        int d;
//        int x;
//        int y;
//        Triplet(int d, int x, int y){
//            this.d = d;
//            this.x = x;
//            this.y = y;
//        }
//        @Override
//        public int compareTo(Triplet t) {
//            return this.d  - t.d;
//        }
//
//
//    }
//    public int[][] kClosest(int[][] points, int k){
//    // MaxHeap
//        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i=0;i<points.length;i++){
//            int x = points[i][0] , y = points[i][1];
//            int d =x*x + y*y;
//            pq.add(new Triplet(d,x,y));
//            if(pq.size()>k) pq.remove();
//        }
//        int[][] ans = new int[k][2];
//        for(int i=0;i<k;i++){
//            Triplet t = pq.remove();
//            ans[i][0] = t.x;
//            ans[i][1] = t.y;
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}


// find k closet elements
//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public class Pair implements Comparable<Pair>{
//        int ele;
//        int diff;
//        Pair(int ele, int diff){
//            this.ele = ele;
//            this.diff = diff;
//        }
//
//        @Override
//        public int compareTo(Pair p) {
//            if(this.diff == p.diff)
//                return this.ele - p.ele;
//            return  this.diff-p.diff;
//        }
//    }
//
//    public List<Integer> findClosestElements(int[] arr, int k, int x){
//        // MaxHeap
//        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
//        for(int ele:arr){
//            int diff = Math.abs(x-ele);
//            pq.add(new Pair(ele ,diff));
//            if(pq.size()>k) pq.remove();
//        }
//        List<Integer> ans= new ArrayList<>();
//        while(pq.size()>0){
//            Pair p = pq.remove();
//            ans.add(p.ele);
//        }
//        Collections.sort(ans);
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}


//package heaps;
//import java.util.*;
//public class heaps_01 {
//    public class Pair implements Comparable<Pair>{
//        int ele;
//        int freq;
//        Pair(int ele, int freq){
//            this.ele = ele;
//            this.freq = freq;
//        }
//        public int compareTo(Pair p){
//            return this.freq -  p.freq;
//        }
//    }
//    public int[] topKFrequent(int[] arr, int k){
//        int[] ans = new int[k];
//        Map<Integer,Integer> map = new HashMap<>();
//      for(int ele:arr){
//          if(map.containsKey(ele)){
//              map.put(ele,map.get(ele)+1);
//          }
//          else map.put(ele,1);
//      }
//      PriorityQueue<Pair> pq = new PriorityQueue<>();
//      for(int ele: map.keySet()){
//          int freq = map.get(ele);
//          pq.add(new Pair(ele,freq));
//
//          if(pq.size()>k)pq.remove();
//      }
//      for(int i=0;i<k;i++){
//          Pair p = pq.remove();
//          arr[i] = p.ele;
//      }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}

package heaps;
public class heaps_01 {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        System.out.println("Bitwise Operations:");
        System.out.println("a & b (AND): " + (a & b));
        System.out.println("a | b (OR):  " + (a | b));
        System.out.println("a ^ b (XOR): " + (a ^ b));
        System.out.println("~a (NOT):    " + (~a));
        int choice = 2;
        System.out.println("\nElse-If Example:");
        if (choice == 1) {
            System.out.println("You selected Option 1");
        } else if (choice == 2) {
            System.out.println("You selected Option 2");
        } else if (choice == 3) {
            System.out.println("You selected Option 3");
        } else {
            System.out.println("Invalid selection");
        }

        System.out.println("\nSwitch Example:");
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");
                break;
            case 2:
                System.out.println("You selected Option 2");
                break;
            case 3:
                System.out.println("You selected Option 3");
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
}