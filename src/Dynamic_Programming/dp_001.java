//package Dynamic_Programming;
//// finding the fibonacci number using dynamic Programming
//import java.util.*;
//public class dp_001 {
//    public static int dp[];
//    public static int  fibo(int n){
//        if(n<=1) return n;
//        if(dp[n]!=0) return dp[n];
//        int ans = fibo(n-1)+ fibo(n-2);
//        return dp[n] = ans;
//    }
//    public static int fib(int n){
//        dp = new int[n+1];
//        return fibo(n);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int  n = sc.nextInt();
//        System.out.println(fib(n));
//        for(int i=0;i<n;i++) {
//            System.out.print(fib(i)+" ");
//        }
//        System.out.println();
//    }
//}



// Fibonacci number using Tabulation and Recursion
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int fib(int n){
//        if(n<=1) return n;
//        int[] dp = new int[n+1];
//        dp[0] = 0;dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }
//    public static void main(String[] args){
//
//    }
//}


// code for the MinCost of the climbing stairs using Recursion
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int minCost(int[] cost, int idx){
//        if(idx==0||idx==1) return cost[idx];
//        return cost[idx]+Math.min(minCost(cost,idx-1),minCost(cost,idx-2));
//    }
//    public static int minCostClimbingStairs(int[] cost){
//        int n  = cost.length;
//        return Math.min(minCost(cost,n-1),minCost(cost,n-2));
//    }
//    public static void main(String[] args){
//
//    }
//}





// using Dynamic Programming


//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int minCost(int[] cost, int idx, int[] dp){
//        if(idx==0||idx==1) return cost[idx];
//        if(dp[idx]!=-1) return dp[idx];
//        return dp[idx] = cost[idx]+ Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
//    }
//
//    public static int minCostClimbingStaairs(int[] cost){
//        int n = cost.length;
//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-1,dp));
//    }
//    public static void main(String[] args){
//
//    }
//}



//  Minimum climbing stairs using Tabulation
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int minimumClimbingStairs(int[] cost){
//        int n = cost.length;
//        int[] dp = new int[n];
//        dp[0] = cost[0];dp[1] =cost[1];
//        for(int i=2;i<n;i++){
//            dp[i] = cost[i] + Math.min(dp[i-2],dp[i-1]);
//        }
//        return Math.min(dp[n-2],dp[n-1]);
//    }
//    public static void main(String[] args){
//
//
//    }
//}




// House Robber
// recursive  code
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int amount(int[] nums, int i){
//        if(i>=nums.length) return 0;
//        int take = nums[i]+amount(nums,i+2);
//        int skip = amount(nums,i+1);
//        int ans = Math.max(take, skip);
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}

// recursion and memoization
//package Dynamic_Programming;
//
//import java.util.Arrays;
//
//public class dp_001 {
//    public static int amount(int[] nums, int i, int[] dp){
//        if(i>=nums.length) return 0;
//        if(dp[i]!=-1) return dp[i];
//        int take = nums[i]+amount(nums,i+2,dp);
//        int skip = amount(nums,i+1,dp);
//        int ans = Math.max(take,skip);
//        return dp[i] = ans;
//    }
//    public static int rob(int[] nums){
//        int n  = nums.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
//        return amount(nums,0,dp);
//    }
//    public static void main(String[] args){
//
//    }
//}




//Tabulation code
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int rob(int[] arr){
//        int n = arr.length;
//        if(n==1) return arr[0];
//        int[] dp = new int[n];
//        dp[0] = 0;
//        dp[1] = Math.max(arr[0],arr[1]);
//        for(int i=2;i<=n;i++){
//            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
//        }
//        return dp[n-1];
//    }
//    public static void main(String[] args){
//
//    }
//}


// Recursive code for the Friends Problems
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int pair(int n){
//        if(n<=2) return n;
//        return pair(n-1) + pair(n-2)*pair(n-1);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        System.out.println(pair(n));
//    }
//}



// Dp code for the friends  pairing problems
//package Dynamic_Programming;
//import java.util.*;
//public class dp_001 {
//    public static int pair(int n, int[] dp){
//        if(n<2) return n;
//        if(dp[n]!=-1) return dp[n];
//        return dp[n] = pair(n-1,dp)+ (n-1)*pair(n-2,dp);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        System.out.println(pair(n,dp));
//
//    }
//}



