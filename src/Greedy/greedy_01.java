//package Greedy;
// maximum sum of the array after k negotations
//import java.util.Arrays;
//
//public class greedy_01 {
//
//    public static int LargestSumAfterNegotations(int[] nums, int k){
//        Arrays.sort(nums);
//        int i = 0;
//        while(i< nums.length && nums[i]<0&&k>0){
//            nums[i] *= -1;
//            i++;
//            k--;
//
//        }
//        if(k%2==1){
//            Arrays.sort(nums);
//            nums[0] *= -1 ;
//        }
//        int  sum = 0;
//        for(int x : nums){
//            sum += x;
//
//        }
//        return sum;
//
//    }
//    public static void main(String[] args){
//
//    }
//}




// Fractional KnapSack
//package Greedy;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class greedy_01 {
//    public static double getMaxValue(ItemValue[] arr, int capacity) {
//        // Sorting items by profit-to-weight ratio in descending order
//        Arrays.sort(arr, new Comparator<ItemValue>() {
//            @Override
//            public int compare(ItemValue item1, ItemValue item2) {
//                double cpr1 = (double) item1.profit / (double) item1.weight;
//                double cpr2 = (double) item2.profit / (double) item2.weight;
//                if (cpr1 < cpr2) {
//                    return 1;
//                } else if (cpr1 > cpr2) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//
//        double totalValue = 0d;
//        for (ItemValue i : arr) {
//            int curWt = i.weight;
//            int curVal = i.profit;
//
//            if (capacity - curWt >= 0) {
//                capacity = capacity - curWt;
//                totalValue += curVal;
//            } else {
//                double fraction = ((double) capacity / (double) curWt);
//                totalValue += (curVal * fraction);
//                break;
//            }
//        }
//        return totalValue;
//    }
//
//    public static class ItemValue {
//        int profit, weight;
//
//        // Item value constructor
//        public ItemValue(int profit, int weight) {
//            this.profit = profit;
//            this.weight = weight;
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}



// greedy question to solve thw question of the maximum units in the truck 1710

//package Greedy;
//import java.util.*;
//public class greedy_01 {
//
//        public int maximumUnits(int[][] boxTypes, int truckSize) {
//            Arrays.sort(boxTypes, (a1, a2) -> a2[1] - a1[1]);
//
//            int sum = 0;
//            for (int i = 0; i < boxTypes.length; i++) {
//                int nb = boxTypes[i][0];
//                int un = boxTypes[i][1];
//
//                int min = Math.min(nb, truckSize);
//                truckSize -= min;
//                sum += min * un;
//
//                if (truckSize == 0) return sum;
//            }
//            return sum;
//
//    }
//    public static void main(String[] args){
//
//    }
//}


// minimum number of the boats to save the people
//package Greedy;
//import java.util.*;
//public class greedy_01{
//    public  static int numResBoat(int[] people, int limits){
//      Arrays.sort(people);
//      int left = 0, right = people.length-1;
//      int ans = 0;
//      while(left<=right){
//          if(people[left]+people[right] <=limits){
//              left++;
//              right--;
//          }
//          else {
//              right--;
//          }
//          ans++;
//      }
//      return ans;
//    }
//    public static void main(String[] args){
//    }
//}


// Rabbit in the forest problem

//package Greedy;
//import java.util.*;
//public class greedy_01 {
//    public int numRabbits(int[] answers) {
//      int ans = 0;
//      Map<Integer,Integer> freq = new HashMap<>();
//      for(int answer :answers) {
//          freq.put(answer + 1, freq.getOrDefault(answer + 1, 0) + 1);
//      }
//          for(int key:freq.keySet()){
//              int val = freq.get(key);
//              int q = val/key;
//              int r = val % key;
//              ans+= q*key;
//              if(r>0){
//                  ans+= key;
//              }
//              System.out.println(key +" "+val +" "+ans);
//          }
//          return ans;
//      }
//
//
//    public static void main(String[] args){
//
//    }
//}



// merge intervals
//package Greedy;
//import java.util.*;
//public class greedy_01 {
//    public int[][] merge(int[][] intervals) {
//
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//
//        List<int[]> ans = new ArrayList<>();
//        for (int[] interval : intervals) {
//
//            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
//                ans.add(interval);
//            } else {
//                int[] newInterval = new int[2];
//                newInterval[0] = ans.get(ans.size() - 1)[0];
//                newInterval[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
//                ans.set(ans.size() - 1, newInterval);
//            }
//        }
//        return ans.toArray(new int[ans.size()][]);
//    }
//    public static void main(String[] args){
//
//    }
//}



// Minuimum product subset in the array
//package Greedy;
//import java.util.*;
//public class greedy_01 {
//    static int minProductSubset(int a[], int n)
//    {
//        if (n == 1)
//            return a[0];
//        int negmax = Integer.MIN_VALUE;
//        int posmin = Integer.MAX_VALUE;
//        int count_neg = 0, count_zero = 0;
//        int product = 1;
//
//        for (int i = 0; i < n; i++) {
//            if (a[i] == 0) {
//                count_zero++;
//                continue;
//            }
//            if (a[i] < 0) {
//                count_neg++;
//                negmax = Math.max(negmax, a[i]);
//            }
//            if (a[i] > 0 && a[i] < posmin)
//                posmin = a[i];
//            product *= a[i];
//        }
//        if (count_zero == n
//                || (count_neg == 0 && count_zero > 0))
//            return 0;
//
//        if (count_neg == 0)
//            return posmin;
//        if (count_neg % 2 == 0 && count_neg != 0) {
//            product = product / negmax;
//        }
//        return product;
//    }
//    public static void main(String[] args){
//
//    }
//}





// minimum cost to cut the board into squares
//package Greedy;
//import java.util.*;
//public class greedy_01 {
//    public static int minimumCostOfBreaking(Integer X[],Integer Y[],int m, int n){
//        int res = 0;
//
//        // sort the horizontal cost in rev=rse order
//        Arrays.sort(X,Collections.reverseOrder());
//
//        // sort the vertical cost in reverse order
//        Arrays.sort(Y,Collections.reverseOrder());
//
//        int hor = 1, vert = 1;
//        int i = 0, j=0;
//        while(i<m&&j<n){
//            if(X[i]>Y[j]){
//                res +=X[i]* vert;
//                hor++;
//                j++;
//            }
//            else {
//                res+= Y[i]* hor;
//                // increase the current by 1
//                hor++;
//                i++;
//            }
//        }
//        // loop for the horizontal array
//        int total = 0;
//        while(i<m) {
//            total += X[i++];
//            res += total * vert;
//        }
//            // loop for the vertical array
//            total = 0;
//            while(j<n){
//                total+= Y[i++];
//                res += total* hor;
//            }
//        return res;
//    }
//    public static void main(String[] args){
//
//    }
//}



// minimum number of the arrow required to shot the balloon
//package Greedy;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class greedy_01 {
//    public int findArrowShots(int[][] points){
//        List<int[]> ans = new ArrayList<>();
//        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
//        for(int[] point : points){
//            System.out.println(Arrays.toString(point));
//            if(ans.size()==0||ans.get(ans.size()-1)[1]<point[0]){
//                ans.add(point);
//            }
//            else {
//                int start = Math.max(ans.get(ans.size()-1)[0],point[0]);
//                int end = Math.min(ans.get(ans.size()-1)[1],point[1]);
//
//                int[] intervals = {start,end};
//                ans.set(ans.size()-1,intervals);
//            }
//        }
//        return ans.size();
//    }
//    public static void main(String[] args){
//
//    }
//}




// erasing overlapping intervals
//package Greedy;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class greedy_01 {
//    public int eraseOverlapIntervals(int[][] points){
//        List<int[]> ans = new ArrayList<>();
//
//        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
//        for(int[] point : points){
//
//            if(ans.size()==0||ans.get(ans.size()-1)[1]<= point[0]) {
//                ans.add(point);
//            }
//            else {
//                int start = Math.max(ans.get(ans.size()-1)[0],point[0]);
//                int end = Math.min(ans.get(ans.size()-1)[1],point[1]);
//
//                int[] intervals = {start,end};
//                ans.set(ans.size()-1,intervals);
//            }
//        }
//        return points.length  - ans.size();
//    }
//    public static void main(String[] args){
//
//    }
//}



// maximum length of pair chain    646

//package Greedy;
//import java.util.*;
//public class greedy_01 {
//    public int findLongestChain(int[][] pairs){
//        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
//
//        int cur = Integer.MIN_VALUE, ans = 0;
//        for(int[] pair :pairs){
//            if(cur<pair[0]){
//                cur = pair[1];
//                ans++;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}