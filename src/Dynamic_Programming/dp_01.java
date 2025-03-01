//package Dynamic_Programming;
////   Dynamic programming fibonnaci number based on  th recursion and memoization
//public class dp_01 {
//    public  static int[] dp;
//
//    public int fibo(int n){
//        if(n<=1) return n;
//
//         if(dp[n]!=0) return dp[n];
//
//        int ans = fibo(n-1)+fibo(n-2);
//   dp[n] = ans;
//   return ans;
//
//    }
//    public static int fib(int n){
//        dp = new int[n+1]; // index from 0 to n
//
//            return fib(n);
//
//    }
//    public static void main(String[] args){
//
//    }
//}
      // revision of the dp of the fibocnacci

//package Dynamic_Programming;
//import java.util.*;
//public class dp_01 {
//    public static int[] dp;
//    public int fibo(int n){
//        if(n<=1) return n;
//        if(dp[n]!=0) return dp[n];
//        int ans = fibo(n-1) + fibo(n-2);
//        return dp[n] = ans;
//    }
//
//    public static int fib(int n ){
//        dp= new int[n+1];
//        return fib(n);//
//    }
//    public static void main(String[] args) {
//
//    }
//
//}


// lecture number3
// fibonacci Tabulation
//package Dynamic_Programming;
//public class dp_01 {
//    public static int fib(int n){
//        if(n<=1) return n;
//        int[] dp = new int[n+1];
//        dp[0] = 0;
//        dp[1]  = 1;
//        for(int i=2;i<=n;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//
//        }
//        return dp[n];
//    }
//    public static void main(String[] args){
//
//    }
//}

          // revision of the dp of the tabulation code

//package Dynamic_Programming;
//import java.util.*;
//public class dp_01{
//    public static int fib(int n){
//        if(n<=1) return n;
//        int[] dp = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//
//    }
//    public static void main(String[] args){
//
//    }
//}

// lecture number 4;
// leetcode  746
// minimum cost climbing trees
//                               recursive code
//
//package Dynamic_Programming;
//public class dp_01 {
//
//    public  static  int MinCost(int[] cost, int idx){
//      if(idx==0||idx==1) return cost[idx];
//return cost[idx]+Math.min(MinCost(cost,idx-1),MinCost(cost,idx-2));
//    }
//    public static int minCostClimbingStairs(int[] cost){
//        int n  = cost.length;
//     return Math.min(MinCost(cost,n-1),MinCost(cost,n-2));
//    }
//
//    public static void main(String[] args){
//
//    }
//}
        // revision of the minimum climbing cost  Recursive code
//package Dynamic_Programming;
//import java.util.*;
//public class dp_01 {
//    public static int MinCost(int[] cost, int idx){
//        if(idx==0 || idx==1) return cost[idx];
//        return cost[idx] + Math.min(MinCost(cost,idx-1),MinCost(cost,idx-2));
//    }
//
//    public static int MinimumClimbingCostStairs(int[] cost){
//        int n = cost.length;
//        return Math.min(MinCost(cost,n-1),MinCost(cost,n-2));
//    }
//    public static void main(String[] args){
//
//    }
//}

// Dp code to solve this
//package Dynamic_Programming;
//3
//import java.util.Arrays;
//
//public class dp_01 {
//    public static int MinCost(int[] cost , int idx , int[] dp){
//        if(idx==0||idx==1) return cost[idx];
//        if(dp[idx]!=-1) return dp[idx];
//        int ans = cost[idx]+Math.min(MinCost(cost,idx-1,dp),MinCost(cost,idx-2,dp));
//        dp[idx] = ans;
//        return dp[idx];
//    }
//    public static int minCostClimbingStairs(int[] cost){
//        int n = cost.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
//        return Math.min(MinCost(cost,n-1,dp),MinCost(cost,n-2,dp));
//
//    }
//    public static void main(String[] args){
//
//    }
//}



// code for the tabulation method
//package Dynamic_Programming;
//public class dp_01 {
//    public static int minCostClimbingStairs(int[] cost){
//        int n = cost.length;
//        int[] dp = new int[n];
//        dp[0] = cost[0];
//        dp[1] = cost[1];
//        for(int i=2;i<n;i++){
//            dp[i] = cost[i]+ Math.min(dp[i-2],dp[i-1]);
//
//        }
//return Math.min(dp[n-2],dp[n-1]);
//    }
//    public static void main(String[] args){
//
//    }
//}





// House robber
// recursive code
//package Dynamic_Programming;
//public class dp_01 {
//    public static int amount(int[] nums, int i){
//        if(i>=nums.length) return 0;
//        int take = nums[i]+amount(nums,i+2);
//        int skip = amount(nums,i+1);
//        int ans =  Math.max(take,skip);
//
//        return ans;
//    }
//    public int rob(int[] nums){
//        return amount(nums,0);
//    }
//    public static void main(String[] args){
//
//    }
//}





// House Robber
// leetcode 198
// recursive code+ dynamic code
//package Dynamic_Programming;
//
//import java.util.Arrays;
//
//public class dp_01 {
//    public static int amount(int[] nums, int i, int[] dp){
//        if(i>=nums.length) return 0;
//        if(dp[i]!=-1) return dp[i];
//        int take = nums[i]+amount(nums,i+2,dp);
//        int skip = amount(nums,i+1,dp);
//        int ans =  Math.max(take,skip);
//        dp[i]=  ans;
//        return dp[i];
//    }
//    public static int rob(int[] nums){
//        int n  = nums.length;
//        // i varies from 0 to n-1
//        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
//        return amount(nums,0,dp);
//    }
//    public static void main(String[] args){
//
//    }
//}

// house robber
// code for the tabulation form
//
//package Dynamic_Programming;
//public class dp_01 {
//    public int rob(int[] arr){
//        int n = arr.length;
//        if(n==1) return arr[0];
//        int[] dp = new int[n];
//        dp[0] = arr[0];
//        dp[1] = Math.max(arr[0],arr[1]);
//        for(int i=2;i<=n;i++){
//            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
//
//        }
//        return dp[n-1];
//    }
//    public static void main(String[] args){
//
//    }
//}
//
//


// friends pairing problem
// recursive code
//
//package Dynamic_Programming;
//import java.util.Scanner;
//public class dp_01 {
//    public static int pair(int n){
//        if(n<=2) return n;
//
//            return pair(n-1)+ (n-1)* pair(n-2);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(pair(n));
//    }
//}


// Friends Pairing  problems
// dynamic programming code
//package Dynamic_Programming;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class dp_01 {
//    public static int pair(int n , int[] dp){
//        if(n<=2) return n;
//        if(dp[n]!=-1) return dp[n];
//        return dp[n] = pair(n-1,dp)+(n-1)*pair(n-2,dp);
//    }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n  = sc.nextInt();
//         int[] dp  = new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(pair(n,dp));
//
//
//     }
// }



//// friends pairing problem solving through tabulation
//package Dynamic_Programming;
//
//import java.util.Scanner;
//
//public class dp_01 {
//    public static int friend(int n){
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//       if(n>2) dp[2] = 2;
//       for(int i=3;i<=n;i++){
//           dp[i] = dp[i-1] + (i-1)*dp[i-2];
//       }
//       return dp[n];
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(friend(n));
//    }
//}



// unique paths
// solve  using recursion only
//package Dynamic_Programming;
//public class dp_01 {
//    public static int paths(int row,int col, int m ,int n){
//        if(row==m||col==n) return 1;
//        int rightWays = paths(row,col+1,m,n);
//        int downWays = paths(row+1,col,m,n);
//        return rightWays+ downWays;
//
//    }
//    public static int UniquePaths(int m, int n){
//        return paths(1,1,m,n);
//    }
//    public static void main(String[] args){
//
//    }
//}



// unique paths
// DP code
//package Dynamic_Programming;
//public class dp_01 {
//    public static int paths(int row, int col, int m ,int n, int[][] dp){
//       if(row>=m||col>=n) return 0;
//        if(row==m-1||col==n-1) return 1;
//        if(dp[row][col]!=-1) return dp[row][col];
//        int rightWays = paths(row,col+1,m,n,dp);
//        int downWays = paths(row+1,col,m,n,dp);
//        return dp[row][col] = rightWays+ downWays;
//
//    }
//    public int UniquePaths(int m , int n){
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dp[i][j] = -1;
//            }
//        }
//        return paths(0,0,m,n,dp);
//    }
//    public static void main(String[] args){
//
//    }
//}




// unique paths
// solving through tabulation
//package Dynamic_Programming;
//public class dp_01 {
//    public int paths(int m ,int n){
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(i==0||j==0) dp[i][j] = 1;
//                else dp[i][j] = dp[i][j-1] + dp[i-1][j];
//            }
//        }
//        return dp[m-1][n-1];
//    }
//    public static void main(String[] args){
//
//    }
//}



// perfect square problem
// recursive code
//package Dynamic_Programming;
//public class dp_01 {
//    public static boolean isPerfect(int n){
//        int sqrt = (int)(Math.sqrt(n));
//        return (sqrt*sqrt==n);
//    }
//    public static int  numSquare(int n){
//        if(isPerfect(n)) return 1;
//        int min = Integer.MIN_VALUE;
//        for(int i=1;i<=n/2;i++){
//            int count = numSquare(i)  + numSquare(n-i );
//            min = Math.min(min,count);
//        }
//        return min;
//    }
//
//    public static void main(String[] args){
//
//    }
//}



// DP code
//package Dynamic_Programming;
//
//import java.util.Arrays;
//
//public class dp_01 {
//    public static boolean isPerfect(int n){
//        int sqrt = (int)(Math.sqrt(n));
//        return (sqrt*sqrt==n);
//    }
//    public static int  minSquares(int n, int[] dp){
//        if(isPerfect(n)) return 1;
//        if(dp[n]!=-1) return dp[n];
//        int min = Integer.MAX_VALUE;
//        for(int i=1;i<=n;i++){
//            int count = minSquares(i*i,dp)  + minSquares(n-i*i,dp);
//            min = Math.min(min,count);
//        }
//        return min;
//    }
//    public static int numSquares(int n){
//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        return minSquares(n,dp);
//
//    }
//    public static void main(String[] args){
//
//    }
//}



// KnapSack 0/1
// recursive code


//package Dynamic_Programming;
//public class dp_01 {
//    public static int profit(int i, int[] wt, int[] val, int c){
//      if(i==wt.length) return 0;
//      int skip = profit(i+1,wt,val,c);
//      if(wt[i]>c) return skip;
//      int pick = val[i]+profit(i+1,wt,val,c-wt[i]);
//      return Math.max(pick,skip);
//
//    }
//    public static void main(String[] args){
//        int[] val = {5,3,9,16};
//        int[] wt = {1,2,8,10};
//        int c = 8;
//        System.out.println(profit(0,wt,val,c));
//    }
//}


// KNAPSACK 0/1
// DP CODE
//package Dynamic_Programming;
//public class dp_01 {
//    public static int profit(int i, int[] wt, int[] val, int c, int[][] dp){
//        if(i==wt.length) return 0;
//        if(dp[i][c]!= -1) return dp[i][c];
//
//        int skip = profit(i+1,wt,val,c,dp);
//        if(wt[i]>c)  return dp[i][c]= skip;
//        int pick = val[i]+profit(i+1,wt,val,c-wt[i],dp);
//        return dp[i][c] =  Math.max(pick,skip);
//
//    }
//    public static void main(String[] args){
//        int[] val = {5,3,9,16};
//        int[] wt = {1,2,8,10};
//        int c = 8;
//        int n = wt.length;
//        // i = 0 to n-1 | c= c to 0
//        int[][] dp =  new int[n][c+1];
//        for(int i=0;i<dp.length;i++)
//            for(int j=0;j<dp[0].length;j++)
//                dp[i][j] = -1;
//        System.out.println(profit(0,wt,val,c,dp));
//    }
//}



// unbounded knapsack'
// you can pick any number of the same product
//package Dynamic_Programming;
//import java.util.*;
//public class dp_01 {
//    public static int profit(int i, int[] wt, int[] val, int c, int[][] dp){
//        if(i==wt.length) return 0;
//        if(dp[i][c]!=-1) return dp[i][c];
//        int skip = profit(i+1,wt, val,c,dp);
//        if(wt[i]>c) return dp[i][c] = skip;
//        int pick = val[i] + profit(i,wt, val, c-wt[i], dp);
//        return dp[i][c] = Math.max(pick,skip);
//    }
//    public static void main(String[] args){
//     int[] val = {5,3,7,16};
//     int[] wt = {1,2,8,10};
//     int c = 8;
//     int n = wt.length;
//     int[][] dp = new int[n][c+1];
//     for(int i=0;i<dp.length;i++){
//         for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;
//     }
//        System.out.println(profit(0,wt,val,c,dp));
//    }
//
//}
//
//












// Fractional Knapsack problem
// Greedy approach works here because we always the highest value-to-weight ratio

//
//package Dynamic_Programming;
//import java.util.*;
//public class dp_01 {
//
//        // Function to get maximum profit for Fractional Knapsack
//        public static double fractionalKnapsack(int[] wt, int[] val, int capacity) {
//            int n = wt.length;
//
//            // Create an array of items with value-to-weight ratio
//            Item[] items = new Item[n];
//            for (int i = 0; i < n; i++) {
//                items[i] = new Item(wt[i], val[i]);
//            }
//
//            // Sort items by value-to-weight ratio in descending order
//            Arrays.sort(items, Comparator.comparingDouble(Item::ratio).reversed());
//
//            double maxProfit = 0.0;
//            for (Item item : items) {
//                if (capacity >= item.weight) {
//                    // Take the whole item
//                    maxProfit += item.value;
//                    capacity -= item.weight;
//                } else {
//                    // Take fraction of the item
//                    maxProfit += item.ratio() * capacity;
//                    break; // Knapsack is full now
//                }
//            }
//            return maxProfit;
//        }
//
//        // Helper class to store weight, value, and ratio
//        static class Item {
//            int weight, value;
//
//            Item(int weight, int value) {
//                this.weight = weight;
//                this.value = value;
//            }
//
//            // Method to calculate value-to-weight ratio
//            double ratio() {
//                return (double) value / weight;
//            }
//        }
//
//        public static void main(String[] args) {
//            int[] val = {5, 3, 9, 16};
//            int[] wt = {1, 2, 8, 10};
//            int capacity = 8;
//
//            double maxProfit = fractionalKnapsack(wt, val, capacity);
//            System.out.println("Maximum Profit for Fractional Knapsack: " + maxProfit);
//        }
 //   }





////  Greedy problem
//package Dynamic_Programming;
//import java.util.*;
//public class dp_01 {
//    public static int
//    public static void  main(String[] args){
//
//    }
//}