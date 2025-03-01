//package yash;
//import java.util.HashSet;
//import java.util.*;
//public class newHashSet {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        HashSet<Integer> set = new HashSet<>();
//        set.add(20);
//        set.add(56);
//        set.add(76);
//        set.add(12);
//        set.add(90);
//        System.out.println(set);
//        //search
//        System.out.println(set.contains(100));
//        System.out.println(set.size());
//        // to remove the elements
//        set.remove(56);
//        System.out.println(set);
//        // to make the array with the sma set
//        Object[] arr = set.toArray();
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println();
//
//        // how to iterate in the Hashset
//    }
//}


// to iterate in the hashset
//package yash;
//import java.util.HashSet;
//import java.util.*;
//public class newHashSet {
//    public static void main(String[] args){
//        int[] arr={4,9,2,6,4,8,1};
//        for(int x: arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        HashSet<Integer> set = new HashSet<>();
//        set.add(20);
//        set.add(56);
//        set.add(76);
//        set.add(12);
//        set.add(90);
//        System.out.println(set);
//        for(int x : set){
//            System.out.print(x+" ");
//        }
//        set.clear(); // to clear the complete set
//        System.out.println(set);
//    }
//}


// leetcode 2442
//package yash;
//import java.util.*;
//public class newHashSet {
//    public static int reverse(int n){
//        int   r = 0;
//        while(n!=0){
//            r = r*10 + n%10;
//            n/=10;
//        }
//        return r;
//    }
//    public  static int CountDistinct(int[] nums){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//            set.add(reverse(nums[i]));
//
//        }
//        return set.size();
//    }
//    public static void main(String[] args){
//        int[] nums = {12,24,36,41};
//
//        System.out.println(CountDistinct(nums));
//
//    }
//}



// find the maximum number of String pair
// leetcode 2744
//package yash;
//import java.util.*;
//import java.util.HashSet;
//public class newHashSet {
//    public String reverse(String t){
//        StringBuilder sb = new StringBuilder(t);
//        sb.reverse();
//        return sb.toString();
//    }
//    public int maximumNumberOfStringPairs(String[] words){
//        HashSet<String> set = new HashSet<>();
//        int count = 0;
//        for(int i=0;i<words.length;i++){
//            String rev = reverse(words[i]);
//            if(set.contains(rev)){
//                count++;
//            }
//            else {
//                set.add(words[i]);
//            }
//        }
//        return count;
//
//    }
//    public static void main(String[] args){
//        Scanner sc  = new Scanner(System.in);
//
//    }
//}



                   // revision of the HashSet
// lecture number 1
//package yash;
//import java.util.*;
//public class newHashSet {
//    public static void main(String[] args){
//        HashSet<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(19);
//        set.add(98);
//        set.add(67);
//        set.add(38);
//        System.out.println(set);
//// to search the element in the HashSet
//        System.out.println(set.contains(98));
//
//        System.out.println(set.size());
//        set.remove(12);
//        System.out.println(set);
//
//        Object[] arr = set.toArray();
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}


// lecture number 2
// to traverse in the array ,we use for-each loop
//package yash;
//import java.util.*;
//public class newHashSet {
//    public static void main(String[] args){
//        HashSet<Integer> set = new HashSet<>();
//        int[] arr = {4,9,2,6,4,8,1};
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        set.add(12);
//        set.add(19);
//        set.add(98);
//        set.add(67);
//        set.add(38);
//        for(int ele: set){
//            System.out.println(set+" ");
//
//        }
//        System.out.println();
//        set.clear();
//    }
//}





// lecture number 3
// leetcode 2442
// count number of the distinct operation after reverse operation
//package yash;
//import java.util.*;
//public class newHashSet{
//    public static int reverse(int n){
//        int r = 0;
//        while(n!=0){
//            r = r*10 + n%10;
//            n/=10;
//        }
//        return r;
//    }
//    public static int countDistinct(int[] nums){
//        HashSet<Integer> set =  new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//            set.add(reverse(nums[i]));
//
//        }
//        return set.size();
//    }
//    public static void main(String[] args){
//
//
//    }
//}
//
//



// lecture number 4
//leetcode 2744
// finding maximum number of string pairs
//package yash;
//import java.util.*;
//public class newHashSet{
//    public static String reverse(String t){
//        StringBuilder sb = new StringBuilder(t);
//        sb.reverse();
//        return sb.toString();
//    }
//
//
//    public static int maximumPair(String[] words){
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
//    public static void main(String[] args){
//
//    }
//}



// lecture number 5
// Introduction to the HashMap
//package yash;
//import java.util.*;
//public class newHashSet {
//    public static void main(String[] args){
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Yash",2);
//        map.put("Rahul",3);
//        map.put("Ankush",4);
//        map.put("Ridhima",5);
//        map.put("Shubham",6);
//        // to print the all the map
//        System.out.println(map);
//
//        // to search the element
//        System.out.println(map.containsKey("Yash"));
//
//        map.remove("Yash");
//        System.out.println(map);
//
//        System.out.println(map.get("Rahul"));
//    }
//}




// lecture number 6
// how to iterate in the HashMap
//package yash;

//import java.util.*;
//public class newHashSet {
//    public static void main(String[] args){
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Yash",2);
//        map.put("Rahul",3);
//        map.put("Ankush",4);
//        map.put("Ridhima",5);
//        map.put("Shubham",6);
//       // System.out.println(map);
//
//        for(String key: map.keySet()){
//            int val = map.get(key);
//            System.out.println(key+" "+val);
//        }
//        System.out.println();
//
//       for(Object pair:map.entrySet()){
//           System.out.println(pair);
//       }
//    }
//}



// lecture number 7
// leetcode 242
// valid anagram
//package yash;
//import java.util.*;
//public class newHashSet {
//    public static boolean isAnagram(String s, String t){
//        if(s.length()!=t.length()) return false;
//        HashMap<Character,Integer> smap = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            char key = s.charAt(i);
//            if(smap.containsKey(key)){
//                int freq = smap.get(key);
//                smap.put(key,freq+1);
//            }
//            else {
//                smap.put(key,1);
//            }
//        }
//        HashMap<Character,Integer> tmap = new HashMap<>();
//        for(int i=0;i<t.length();i++){
//            char key = t.charAt(i);
//            if(tmap.containsKey(key)){
//                int freq = tmap.get(key);
//                tmap.put(key,freq+1);
//            }
//            else {
//                tmap.put(key,1);
//            }
//        }
//        for(char key: smap.keySet()){
//            int val1 =smap.get(key);
//            if(!tmap.containsKey(key)) return false;
//            int val2 = tmap.get(key);
//            if(val1!=val2) return false;
//        }
//        return true;
//    }
//    public static void main(String[] args){
//
//    }
//}


//lecture number 8;
// leetcode 1
// two sum
//package yash;
//import java.util.*;
//public class newHashSet {
//    public int[] twoSum(int[] nums, int target){
//        int[] ans ={-1,-1};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int rem = target - nums[i];
//            if(map.containsKey(rem)){
//                ans[0] = i;
//                ans[1] = map.get(rem);
//                break;
//            }
//            else {
//                map.put(nums[i],i);
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}



// lecture number 9;
//TreeSet and TreeMap;






// lecture number 10
// leetcode 1207
// unique number of occurances
//package yash;
//import java.util.*;
//public class newHashSet {
//    public boolean uniqueOccurances(int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int ele : arr) {
//            if (map.containsKey(ele)) {
//                int freq = map.get(ele);
//                map.put(ele, freq + 1);
//            } else {
//                map.put(ele, 1);
//            }
//        }
//            HashSet<Integer> set = new HashSet<>();
//            for (int key : map.keySet()) {
//                int val = map.get(key);
//                set.add(val);
//            }
//
//            return (map.size() == set.size());
//        }
//
//
//    public static void main(String[] args){
//
//    }
//}




// lecture number 11
//leetcode  2094
// finding the 3 digit even number

//package yash;
//import java.util.*;
//public class newHashSet {
//    public int[] findEvenNumbers(int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        ArrayList<Integer> ans = null;
//        for (int ele : arr) {
//            if (map.containsKey(ele)) {
//                int freq = map.get(ele);
//                map.put(ele, freq + 1);
//            } else {
//                map.put(ele, 1);
//
//            }
//            ans = new ArrayList<>();
//            for (int i = 0; i <= 999; i+=2) {
//                int x = i;
//                int a = x % 10;
//                x /= 10;
//                int b = x % 10;
//                x /= 10;
//                int c = x;
//                if (map.containsKey(a)) {
//                    int aFreq = map.get(a);
//                    map.put(a, aFreq - 1);
//                    if (aFreq == 1) map.remove(a);
//                    if (map.containsKey(b)) {
//                        int bFreq = map.get(b);
//                        map.put(b, bFreq - 1);
//                        if (bFreq == 1) map.remove(b);
//                        if (map.containsKey(c)) {
//                            ans.add(i);
//                        }
//                        map.put(b, bFreq);
//                    }
//                    map.put(a, aFreq);
//                }
//            }
//        }
//        int[] ans2 = new int[ans.size()];
//        for(int i=0;i<ans2.length;i++){
//            ans2[i] = ans.get(i);
//
//        }
//        return ans2;
//    }
//    public static void main(String[] args) {
//
//    }
//}





// lecture number 12
// leetcode 1497
// check if the array pair are divisible by k
//package yash;
//import java.util.*;
//public class newHashSet {
//    public static boolean canArrange(int[] arr, int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int i=0;i<arr.length;i++){
//            int ele =arr[i]%k;
//            if(ele<k) ele+=k;
//            if(map.containsKey(ele)){
//                int freq = map.get(ele);
//                map.put(ele,freq+1);
//            }
//            else {
//                map.put(ele,1);
//            }
//
//            if(map.containsKey(0)){
//                if(map.get(0)%2!=0) return false;
//                map.remove(0);
//            }
//            if(k%2==0 && map.containsKey(k/2)){
//                if(map.get(k/2)%2!=0) return false;
//                map.remove(k/2);
//            }
//            for(int key:map.keySet()){
//                int rem = k - key;
//                if(!map.containsKey(rem)) return false;
//                int keyFreq = map.get(key);
//                int remFreq = map.get(rem);
//                if(keyFreq!=remFreq) return false;
//            }
//
//        }
//
//return true;
//    }
//    public static void main(String[] args){
//
//    }
//}



// lecture  number 13
// top view of the binary trees
//package yash;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data){
//        this.data  = data;
//        left = null;
//        right =null;
//
//    }
//}
//public class newHashSet {
//    public static class Pair{
//        Node node;
//        int level;
//        Pair(Node node,int level){
//            this.node = node;
//            this.level = level;
//        }
//    }
//    public static void topView(Node root){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Queue<Pair> q = new LinkedList<>();
//        q.add(new Pair(root,0));
//
//        int minLevel = Integer.MAX_VALUE;
//        int maxLevel = Integer.MIN_VALUE;
//
//
//     while(q.size()>0){
//         Pair temp = q.remove();
//         Node n  = temp.node;
//         int lvl = temp.level;
//         minLevel = Math.min(minLevel,lvl);
//         maxLevel = Math.max(maxLevel,lvl);
//         if(map.containsKey(lvl))
//
//             map.put(lvl,n.data);
//
//         if(n.left!=null) q.add(new Pair(n.left,lvl-1));
//         if(n.right!=null) q.add(new Pair(n.right,lvl+1));
//     }
//     for(int i = minLevel;i<maxLevel;i++){
//         System.out.println(map.get(i)+" ");
//     }
//    }
//    public static void main(String[] args){
//
//    }
//}