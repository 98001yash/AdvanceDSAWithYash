//package yash;
//import java.util.HashMap;
//public class HashMap_02 {
//    public static void main(String[] args){
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Yash",87);
//        map.put("Raghav",12);
//        map.put("Kalpana",32);
//        map.put("Raushni",65);
//        // to print the hashMap
//
//        System.out.println(map);
//
//        // to check the key exist in the HashMap
//        System.out.println(map.containsKey("Yash"));
//
//        // to check the value of the pair exist in the HashMap
//        System.out.println(map.containsValue(43));
//
//        // to remove the elements in the HashMap
//        map.remove("Raghav");
//        System.out.println(map);
//
//        //In the put method we pass  the key and return the value of thar key
//        System.out.println( map.get("Yash"));
//    }
//}
//
//
//
// //iteration in the HashMap
//package yash;
//import java.util.*;
//public class HashMap_02 {
//    public static void main(String[] args){
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Yash",87);
//     map.put("Raghav",12);
//   map.put("Kalpana",32);
//     map.put("Raushni",65);
//
//
//     // to print only the kay set
//     for(String key:map.keySet()){
//         System.out.print(key+" ");
//         System.out.println(map.get(key));
//     }
//
//     // to print the both kay and value pair together
//  for(Object pair: map.entrySet()){
//      System.out.println(pair);
//  }
//
//
//   }
//}
//
//
//
//
// //valid anagram
//
// //leetcode 242
//package yash;
//import java.util.*;
//public class HashMap_02 {
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length()) return false;
//
//        HashMap<Character, Integer> smap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char key = s.charAt(i);
//            if (smap.containsKey(key)) {
//                int freq = smap.get(key);
//                smap.put(key, freq + 1);
//            } else {
//                smap.put(key, 1);
//            }
//        }
//        HashMap<Character, Integer> tmap = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            char key = t.charAt(i);
//            if (tmap.containsKey(key)) {
//                int freq = tmap.get(key);
//                tmap.put(key, freq + 1);
//            } else {
//                tmap.put(key, 1);
//            }
//
//        }
//        for(char key: smap.keySet()){
//            int val1 =smap.get(key);
//            if(!tmap.containsKey(key)) return false;
//            int val2 = tmap.get(key);
//            if(val1!=val2) return false;
//        }
//        return true;
//
//    }
//
//public static void main(String[] args){
//
//    }
//}
//
//
//
// //two sum
// //leetcode 1
//package yash;
//import java.util.*;
//public class HashMap_02 {
//    public int[] towSum(int[] nums, int target){
//        HashMap<Integer,Integer> map =  new HashMap<>();
//        int[] ans = {-1,-1};
//        for(int i=0;i<nums.length;i++) {
//            int rem = target - nums[i];
//            if (map.containsKey(rem)) {
//                ans[0] = i;
//                ans[1] = map.get(rem);
//                break;
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//     int[] arr ={2,5,9,4,1};
//     int target = 10;
//
//    }
//}
//
//
//
//// TreeSet and TreeMaps -: Ordered Set
//
//
// //unique number of occurances
// //leetcode 1207
//package yash;
//import java.util.*;
//public class HashMap_02 {
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
//        return (map.size() == set.size());
//    }
//    public static void main(String[] args){
//
//    }
//}
//
//
//
//
// //Finding 3-digit Even numbers
// // leetcode 2094
//
//package yash;
//import java.util.*;
//public class HashMap_02{
//    public int[] findEvenNumbers(int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int ele : arr) {
//            if (map.containsKey(ele)) {
//                int freq = map.get(ele);
//                map.put(ele, freq + 1);
//            } else
//                map.put(ele, 1);
//            }
//            ArrayList<Integer> ans = new ArrayList<>();
//
//            for (int i = 100; i <= 999; i+=2) {
//                int x = i;
//                int c = x % 10;
//                x /= 10;
//                int b = x % 10;
//                x /= 10;
//                int a = x;
//                if (map.containsKey(a)) {
//                    int aFreq = map.get(a);
//                    map.put(a, aFreq - 1);
//                    if (aFreq == 1) map.remove(a);
//                    if (map.containsKey(b)) {
//                        int bFreq = map.get(b);
//                        map.put(b, bFreq - 1);
//                        if (bFreq == 1) map.remove(b);
//
//                        if (map.containsKey(c)) {
//                            ans.add(i);
//                        }
//                        map.put(b, bFreq);
//                    }
//                    map.put(a, aFreq);
//                }
//            }
//
//            int[] ans2 = new int[ans.size()];
//            for (int i = 0; i < ans2.length; i++) {
//                ans2[i] = ans.get(i);
//        }
//        return ans2;
//    }
//    public static void main(String[] args){
//
//    }
//}
//
//
//
//
//
//
// longest substring without repeating characters
//
// leetcode  3
//package yash;
//import java.util.*;
//public class HashMap_02 {
//    public int lengthOfLongectSubString(String s){
//        int n  = s.length();
//        int maxLen = 0;
//        int i=0, j = 0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        while(j<n){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)&& map.get(ch)>=i){
//                int len = j-1;
//                maxLen = Math.max(maxLen,len);
//               // i ko leke jap purani position ke aage
//                while(s.charAt(i)!=ch) i++;
//                i++;
//
//            }
//            else map.put(ch,j);
//            j++;
//
//        }
//        int len = j-i;
//        maxLen = Math.max(maxLen,len);
//        return maxLen;
//    }
//    public static void main(String[] args){
//
//    }
//}
//
//
//
//
//// check if any pairs are divisible by k
//// leetcode  1497
//
//package yash;
//import java.util.*;
//public class HashMap_02 {
//    public boolean canArrange(int[] arr, int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int ele = arr[i]%k;
//            if(ele<0) ele+= k;
//            if(map.containsKey(ele)){
//                int freq = map.get(ele);
//                map.put(ele,freq+1);
//            }
//            else {
//                map.put(ele,1);
//            }
//            if(map.containsKey(0)){
//                if(map.get(0)%2!=0) return false;
//                map.remove(0);
//            }
//            if(k%2==0&& map.containsKey(k/2)){
//                if(map.get(k/2)%2!=0) return false;
//                map.remove(k/2);
//            }
//            for(int key:map.keySet()){
//                int rem = k = key;
//                if(!map.containsKey(rem)) return false;
//                int keyFreq = map.get(key);
//                int remFreq = map.get(rem);
//                if(keyFreq!=remFreq) return false;
//
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//
//    }
//}