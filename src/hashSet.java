//package chauhan;
//import java.util.HashSet;
//public class hashmap_01 {
//    public static void main(String[] args){
//        HashSet<Integer> set = new HashSet<>();
//        set.add(12);// to add the elements in the hashset
//        set.add(2);
//        set.add(45);
//        set.add(89);
//        set.add(87);
//        System.out.println(set);        // to print the hashset
//        System.out.println(set.contains(12));    // to check the element is present or not
//        System.out.println(set.size());   // to give the size of the hashset
//        set.remove(45);               // to remove the element  from the hashset
//        System.out.println(set);
//
//        // to convert it into the array by using built-in function
//        Object[] arr = set.toArray();
//        for(int i=0;i<=arr.length-1;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}



//         making the hashset of the string
//package chauhan;
//import java.util.HashSet;
//public class hashmap_01 {
//    public static void main(String[] args){
//        HashSet<String> set = new HashSet<>();
//        set.add("Yash");
//        set.add("Rahul");
//        set.add("Mohit");
//        set.add("Gagan");
//        System.out.println(set);
//    }
//}

//\





// to check the distinct elemenys in the hashset
//package chauhan;
//import java.util.HashSet;
//public class hashmap_01 {
//    public static int reverse(int n){
//        int r = 0;
//        while(n!=0){
//        r = r*10 + n%10;
//        n/=10;
//    }
//        return r;
//        }
//    public static int countDistinct(int nums[]){
//        HashSet<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(2);
//        set.add(45);
//        set.add(89);
//        set.add(87);
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//            set.add(reverse(nums[i]));
//        }
//        return set.size();
//    }
//    public static void main(String[] args){
//        int[] nums  = new int[];
//        System.out.println(countDistinct(nums));
//
//    }
//}
//
//


//
//package chauhan;
//import java.util.HashSet;
//public class hashmap_01 {
//
//    public int maximumpair(String[] words) {
//        HashSet<String> s = new HashSet<>();
//        int count = 0;
//        for (int i = 0; i < words.length; i++) {
//            String rev = reverse(words[i]);
//            if (s.contains(rev)) {
//                count++;
//            }
//            else s.add(words[i]);
//        }
//        return count;
//
//}
//        public String reverse(String t) {
//         StringBuilder sb = new StringBuilder(t);
//            sb.reverse();
//            return sb.toString();
//        }
//    public static void main(String[] args){
//        HashSet<String> set = new HashSet<>();
//        set.add("ac");
//
//        set.add("cd");
//           set.add("bh");
//        set.add("tu");
//        set.add("zt");
//        set.add("tz");
//        set.add("mc");
//        set.add("cm");
////        System.out.println(set);
//    }
//}






// revision of the hashSet



//package chauhan;
//import java.util.HashSet;
//public class hashSet {
//    public static void main(String[] args){
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(4);
//        set.add(5);
//        set.add(3);
//        System.out.println(set);
//set.remove(3);
//        System.out.println(set);
//        System.out.println(set.size());
//        System.out.println(set.contains(5));
//    }
//}


//
//package chauhan;
//import java.util.HashSet;
//
//public class hashSet {
//    public static void main(String[] args){
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1); // to add the elements in the HashSet
//        set.add(2);
//        set.add(4);
//        set.add(5);
//        set.add(3);
//        System.out.println(set); // Normal printing of the set
//
//// we traverse in the HashSet with the help of the for each loop
//        for(int x : set){
//            System.out.print(x+" ");
//        }
//
//        System.out.println();
//    }
//
//
//}





//Leetcode 2442
// return the number of element which will left in the hashSet
// after adding the elements and the reverse of that elements
// at last return the size of the hashSet
//
//package chauhan;
//import java.util.HashSet;
//public class hashSet {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(12); // to add the elements in the HashSet
//        set.add(23);
//        set.add(4);
//        set.add(5);
//        set.add(3);
//        set.add(21);
//        set.add(32);
//        System.out.println(set);
//    }
//    public  static int reverse(int  n) {
//        int r = 0;
//        while (n != 0) {
//            r = r * 10 + n % 10;
//            n /= 10;
//        }
//        return r;
//    }
//    public  static int countDistinct(int[] nums){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//            set.add(reverse(nums[i]));
//        }
//        return set.size();
//    }
//
//}
//
//
//
//



//
//
//package chauhan;
//import java.util.*;
//
//public class hashSet {
//
//    public static void main(String[] args ){
//     HashSet<Integer>   set = new HashSet<>();
//     set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//     set.add(5);
//     set.add(6);
//        System.out.println(set);
//     set.remove(6);
//        System.out.println(set);
//        System.out.println(set);
//    }
//}
//
//
//
//

