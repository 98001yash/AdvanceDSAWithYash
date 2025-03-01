//package Revision;
//import java.util.*;
//public class MyHashMap {
//    public static void main(String[] args){
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Yash",76);
//        map.put("Raghav",100);
//        map.put("Kalpana",34);
//        System.out.println(map);
//        map.put("Rohit",45);
//        map.put("Virat",18);
//        System.out.println(map);
//        map.put("Yash",02);
//        System.out.println(map);
//        System.out.println(map.containsKey("yash"));
//        System.out.println(map.containsValue(2));
//        System.out.println(map.size());
//        map.remove("Raghav");
//        System.out.println(map);
//        System.out.println(map.get("Yash"));
//
//    }
//}


//HOW TO ITERATE IN THE HASHMAP
// for-Each Loop   ,KEYSET
//package Revision;
//import java.util.*;
//public class MyHashMap {
//    public static void main(String[] args){
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Yash",76);
//        map.put("Raghav",100);
//        map.put("Kalpana",34);
//        map.put("Rohit",45);
//        map.put("Virat",18);
//
//  // to traverse in the hasmap with key
//        for(String key:map.keySet()){
//            int val = map.get(key);
//            System.out.println(key+ " " +val);
//        }
//        System.out.println();
//
//        // to trvarse on the value set
//        for(int val: map.values()){
//            System.out.println(val);
//        }
//        System.out.println();
//        for(Object pair: map.entrySet()){
//            System.out.println(pair);
//        }
//    }
//}


// Valid Anagram'
//package Revision;
//import java.util.*;
//public class MyHashMap {
//    public static boolean ValidAnagram(String s, String t){
//        if(s.length()!=t.length()) return false;
//        HashMap<Character,Integer> smap =  new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            char key = s.charAt(i);
//            if(smap.containsKey(key)){
//                int freq = smap.get(key);
//                smap.put(key,freq+1);
//            }
//            else  smap.put(key,1);
//        }
//
//        HashMap<Character,Integer> tmap =  new HashMap<>();
//        for(int i=0;i<t.length();i++){
//            char key = s.charAt(i);
//            if(tmap.containsKey(key)){
//                int freq = tmap.get(key);
//                tmap.put(key,freq+1);
//            }
//            else  tmap.put(key,1);
//        }
//
//           for(char key:smap.keySet()){
//               int val1 = smap.get(key);
//               if(!tmap.containsKey(key)) return false;
//               int val2 = tmap.get(key);
//               if(val1!=val2)
//            return false;
//        }
//        return true;
//
//    }
//    public static void main(String[] args){
//
//    }
//}





// Two sum leetcode 1
//package Revision;
//import java.util.*;
//public class MyHashMap {
//    public static int[] findSum(int[] nums, int target){
//        int[] ans = {-1,-1};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int rem = target - nums[i];
//            if(map.containsKey(rem)){
//                int j = map.get(rem);
//               ans[0] = i;
//               ans[1] = j;
//               break;
//            }
//            else map.put(nums[i],i);
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}


// unique number of occurances using hashMap and HashSet
//package Revision;
//import java.util.*;
//public class MyHashMap {
//    public static boolean uniqueOccurances(int[] arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int ele:arr){
//            if(map.containsKey(ele)){
//                int freq = map.get(ele);
//                map.put(ele,freq+1);
//            }
//            else map.put(ele,1);
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for(int key:map.keySet()){
//            int val = map.get(key);
//            set.add(val);
//        }
//        return (map.size()==set.size());
//    }
//    public static void main(String[] args){
//
//    }
//}




