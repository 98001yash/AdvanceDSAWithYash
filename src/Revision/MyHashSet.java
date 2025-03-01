//package Revision;
//import java.util.*;
//  Introduction to the HashSet
//public class MyHashSet {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(23);
//        System.out.println(set.size());
//        System.out.println(set);
//        set.add(45);
//        System.out.println(set.size());
//        System.out.println(set);
//        set.add(89);
//        System.out.println(set.size());
//        System.out.println(set); // to print the whole set
//        set.add(65);
//        set.add(90);
//        System.out.println(set.size());// to print the size
//        System.out.println(set);
//        System.out.println(set.contains(100));
//        set.add(100);
//        System.out.println(set);
//        System.out.println(set.size());
//        System.out.println(set.contains(100));
//
//        set.remove(100);
//        System.out.println(set);
//
//
//        // to convert it in to the array
//        Object[] arr = set.toArray();
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}


// traversal in the HashSet with the help of for-Each loop
//package Revision;
//import java.util.*;
//public class MyHashSet {
//    public static void main(String[] args){
//        int[] arr = {4,9,2,6,4,8,1};
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        HashSet<Integer> set = new HashSet<>();
//        set.add(20);
//        set.add(100);
//        set.add(10);
//        set.add(-8);
//        set.add(200);
//
//        for(int ele:set){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//}





// count number of distinct integer after reverse operation
//package Revision;
//import java.util.*;
//public class MyHashSet {
//    public static int reverse(int n){
//        int r = 0;
//        while(n!=0){
//            r=r*10 + n%10;
//            n/=10;
//        }
//        return r;
//    }
//    public int countDistinct(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//            set.add(reverse(nums[i]));
//        }
//        return set.size();
//    }
//    public static void main(String[] args){
//
//
//
//    }
//}


// Finding the maximum number of pairs String
//package Revision;
//import java.util.*;
//public class MyHashSet {
//    public static int amximumNumberOdfStringPairs(String[] words){
//        HashSet<String> set = new HashSet<>();
//        int count = 0;
//        for(int i=0;i<words.length;i++){
//            String rev = reverse(words[i]);
//            if(set.contains(rev)){
//                count++;
//            }
//            else set.add(words[i]);
//        }
//        return count;
//    }
//
//    public static String reverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb.toString();
//    }
//    public static void main(String[] args){
//
//    }
//}

