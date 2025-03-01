//package chauhan;
//import java.util.HashMap;
//public class hashMap_01 {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Yash", 2);// to add the elements in the hashMap
//        map.put("Rahul", 6);
//        map.put("Deepak", 5);
//        map.put("Ayushi", 4);
//        map.put("Nitin", 12);
//        System.out.println(map);
//        System.out.println(map.containsKey("Yash"));// to check the key is present or not
//        System.out.println(map.containsValue(2));  // to check the value is present or not
//        map.put("Yash", 1);  // to update or replace the elements in the hashMap
//        map.put("Harish", 1);
//        System.out.println(map);
//        map.remove("Rahul");// to remove the key and the value in  the given HashMap
//        System.out.println(map + " " + map.size()); // to give the size of the hashMop
//        System.out.println(map.get("Yash"));
//
//
//        for (String key : map.keySet()) {  // to print the key throygh the iteration
//            int val = map.get(key);
//            System.out.println(key + " " + val);
//        }
//        System.out.println();
//
//        for (int val : map.values()) {  // to print the values using iteration
//            System.out.println(val);
//        }
//        System.out.println();
//        for (Object pair : map.entrySet()){   // to print the key and the values both using iteration method
//            System.out.println(pair);
//        }
//    }
//}


//
//package chauhan;
//import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.HashSet;
//public class hashMap_01 {
// valid anagram leetcde 242
//    public boolean isAnangram(String s, String t) {
//
//        HashMap<Character, Integer> Smap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char key = s.charAt(i);
//            if (Smap.containsKey(key)) {
//                int freq = Smap.get(key);
//                Smap.put(key, freq + 1);
//            } else {
//                Smap.put(key, 1);
//            }
//        }
//        HashMap<Character, Integer> Tmap = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            char key = t.charAt(i);
//            if (Smap.containsKey(key)) {
//                int freq = Smap.get(key);
//                Smap.put(key, freq + 1);
//            } else {
//                Tmap.put(key, 1);
//            }
//        }
//    }


// two sum    leetcode 1
//    public int[] twoSum(int[] nums,  int target){
//        int[] ans  = {-1,-1};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int key = nums[i];
//            int rem = target - nums[i];
//            if(map.containsKey(nums[i])){
//            int j = map.get(rem);
//            ans[0] = i;
//            ans[1] = j;
//            break;
//            }
//            else map.put(nums[i],i);
//        }
//
//        return ans;
//    }



//public boolean uniqueOccurance(int[] arr){
//   leetcode 1207
//    HashMap<Integer, Integer> map = new HashMap<>();
//    for(int ele:arr){
//        if(map.containsKey(ele)){
//            int fre = map.get(ele);
//            map.put(ele,fre);
//        }
//        else map.put(ele,1);
//    }
//    HashSet<Integer> set = new HashSet<>();
//    for(int key:map.keySet()){
//        int val = map.get(key);
//        set.add(val);
//    }
//    return (map.size()==set.size());
//}


//
//    public int[] findEvenNumber(int[] arr){
//
//            HashMap<Integer, Integer> map = new HashMap<>();
//        for(int ele: arr){
//            if(map.containsKey(ele)){
//       int freq = map.get(ele);
//       map.put(ele,freq+1);
//            }
//            else map.put(ele,1);
//        }
//        ArrayList<Integer> ans  = new ArrayList<>();
//            for(int i=100;i<=999;i++){
//           int x = i;
//           int c = x%10;  x/=10;
//                int b = x%10;  x/=10;
//                int a = x;
//                if(map.containsKey(a)){
//                    int aFreq = map.get(a);
//                    map.put(a,aFreq-1);
//                    if(aFreq==1) map.remove(a);
//                    if(map.containsKey(b)){
//                        int bFreq = map.get(b);
//                        map.put(b,bFreq-1);
//                        if(bFreq==1) map.remove(b);
//                        if(map.containsKey(c)){
//                            int cFreq = map.get(c);
//                            map.put(c,cFreq-1);
//                            if(cFreq==1) map.remove(c);
//                            ans.add(i);
//                        }
//                        map.put(b,bFreq);
//                    }
//                    map.put(a,aFreq-1);
//                }
//        }
//            int[] ans2 = new int[ans.size()];
//            for(int i=0;i<ans2.length;i++ ){
//                ans2[i] = ans.get(i);
//            }
//            return ans2;
//    }


//}

//  //}