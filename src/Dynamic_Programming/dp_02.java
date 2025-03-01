////subset sum problem
// recursive code
//package Dynamic_Programming;
//
//public class dp_02 {
//    public static boolean subset(int i, int sum, int[] arr, int target){
//   if(i==arr.length){
//       if(sum==target) return true;
//       else return false;
//   }
//
//        boolean pick  =subset(i+1,sum+arr[i],arr,target);
//       boolean skip = subset(i+1,sum,arr,target);
//       return pick||skip;
//
//    }
//    public static void main(String[] args){
//        int[] arr = {8,5,2,4};
//        int target = 9;
//
//        System.out.println(subset(0,0,arr,target));
//    }
//}




// dp code to solve the subset sum problem

//package Dynamic_Programming;

//class Solution {
//    public  boolean subset(int i, int[] arr, int target, int[][] dp) {
//        if (i == arr.length) {
//            if (target == 0) return true;
//            else return false;
//        }
//        if (dp[i][target] != -1) return (dp[i][target] == 1);
//
//        boolean ans = false;
//
//        boolean skip = subset(i + 1, arr, target, dp);
//        if (target - arr[i] < 0) ans = skip;
//        else {
//            boolean pick = subset(i + 1,  arr, target-arr[i], dp);
//            ans =  pick || skip;
//
//        }
//
//        dp[i][target] = (ans) ? 1 : 0;
//        return ans;
//    }
//    public boolean canPartition(int[] nums) {
//        int sum = 0;
//        for(int ele: nums) sum+= ele;
//        if(sum%2!=0) return false;
//
//        int target = sum/2;
//
//        int[][] dp = new int[nums.length][target+1];
//        for(int i=0;i<dp.length;i++)
//            for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;
//
//        return subset(0,nums,target,dp);
//
//
//    }
//}
//
//}


// target sum problem
// recursive solution
//package Dynamic_Programming;
//public class dp_02 {
//    public int ways(int i,int[] arr,int target){
//        if(i==arr.length){
//            if(target==0) return 1;
//            else return 0;
//        }
//        int add = ways(i+1,arr,target-arr[i]);
//        int sub = ways(i+1,arr,target+arr[i]);
//        return add+sub;
//    }
//    public int findTargetSumWays(int[] arr, int target){
//        return ways(0,arr,target);
//    }
//    public static void main(String[] args){
//
//    }
//}




//DP  CODE
// target sum
//package Dynamic_Programming;
//public class dp_02 {
//    static int sum;
//    public int ways(int i,int[] arr,int res,int target, int[][] dp){
//        if(i==arr.length){
//            if(res==target) return 1;
//            else return 0;
//        }
//        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
//        int add = ways(i+1,arr,res+arr[i],target,dp);
//        int sub = ways(i+1,arr,res-arr[i],target, dp);
//        return  dp[i][res+sum] = add+sub;
//    }
//    public int findTargetSumWays(int[] arr, int target){
//        sum  = 0; int n = arr.length;
//        for(int ele: arr) sum +=ele;
//        int[][] dp = new int[n][2*sum+1];
//        for(int i=0;i<dp.length;i++)
//            for(int j = 0;j<dp[0].length;j++) dp[i][j] = -1;
//
//
//
//        return ways(0,arr,0,target,dp);
//    }
//    public static void main(String[] args){
//
//    }
//}


// tabulation form if the KnaPSack problem
// recursive  code
//package Dynamic_Programming;
//public class dp_02 {
//        public static int profit(int i, int[] wt, int[] val, int c, int[][] dp){
//        if(i<0) return 0;
//        if(dp[i][c]!= -1) return dp[i][c];
//
//        int skip = profit(i-1,wt,val,c,dp);
//        if(wt[i]>c)  return dp[i][c]= skip;
//        int pick = val[i]+profit(i-1,wt,val,c-wt[i],dp);
//        return dp[i][c] =  Math.max(pick,skip);
//
//    }
//    public static void main(String[] args){
//     int[] val = {5,3,9,16};
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


// longest common subsequences
// recursive code
//package Dynamic_Programming;
//public class dp_02 {
//    public static int longestCommonSubsequences(String a, String b){
//        int m = a.length(), n = b.length();
//        if(m==0||n==0) return 0;
//        String a2 = a.substring(0,m-1);// does not include m-1 index
//
//        String b2 = b.substring(0,n-1);
//
//        if(a.charAt(m-1)==b.charAt(n-1))
//            return 1+ longestCommonSubsequences(a2,b2);
//        else {
//            return Math.max(longestCommonSubsequences(a,b2),longestCommonSubsequences(a2,b));
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}



// DP CODE
// longest common substrings
//package Dynamic_Programming;
//public class dp_02 {
//    static int[][] dp;
//    public static int lcs(int i, int j,StringBuilder a, StringBuilder b){
//if(i<0||j<0) return 0;
//    if(dp[i][j]!= -1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j))
//            return dp[i][j] =  1+ lcs(i-1,j-1,a,b);
//        else
//            return  dp[i][j] =  Math.max(lcs(i-1,j,a,b),lcs(i,j-1,a,b));
//    }

//    public static int longestCommonSubsequences(String a, String b) {
//        StringBuilder x = new StringBuilder(a);
//        StringBuilder y  = new StringBuilder(b);
//        int m = x.length(), n = y.length();
//
//        dp = new int[m][n];
//        for(int i=0;i<dp.length;i++)
//            for(int j=0;j<dp[0].length;j++)
//                dp[i][j] = -1;
//
//        return lcs(m-1,n-1,x,y);
//    }
//    public static void main(String[] args){
//
//    }
//}



// dp code for the unbounded  knapsack


// UNBOUNDED KNAPSACK


//package Dynamic_Programming;
//public class dp_02 {
//    public static int profit(int i, int[] wt, int[] val, int c, int[][] dp){
//        if(i==wt.length) return 0;
//        if(dp[i][c]!= -1) return dp[i][c];
//
//        int skip = profit(i+1,wt,val,c,dp);
//        if(wt[i]>c)  return dp[i][c]= skip;
//        int pick = val[i]+profit(i,wt,val,c-wt[i],dp);
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




// coin count
// recursive code

//package Dynamic_Programming;
//public class dp_02 {
//    public long  coinCount(int i,int[] coins, int amount){
//        if(i==coins.length){
//            if(amount==0) return 0;
//            else return Integer.MAX_VALUE;
//        }
//       long skip = coinCount(i+1,coins,amount);
//       if(amount-coins[i]<0) return skip;
//       long pick = 1 + coinCount(i,coins,amount-coins[i]);
//       return Math.min(skip,pick);
//
//    }
//    public   int coinChange(int[] coins, int amount){
//
//        int ans = (int)coinCount(0,coins,amount);
//        if(ans==Integer.MAX_VALUE) return -1;
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}





// DP CODE
//package Dynamic_Programming;

//public class dp_02 {
//    public long  coinCount(int i,int[] coins, int amount, long[][] dp){
//        if(i==coins.length){
//            if(amount==0) return 0;
//            else return Integer.MAX_VALUE;
//        }
//        if(dp[i][amount]!=-1) return dp[i][amount];
//        long skip = coinCount(i+1,coins,amount,dp);
//        if(amount-coins[i]<0) return dp[i][amount] = (int) skip;
//        long pick = 1 + coinCount(i,coins,amount-coins[i],dp);
//        return Math.min(skip,pick);
//
//    }
//    public   int coinChange(int[] coins, int amount){
//// i = 0 to n-1 || amount  =  amount to 0
//        long[][] dp = new long[coins.length][amount+1];
//        for(int i=0;i<dp.length;i++)
//            for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;
//
//        int ans = (int)coinCount(0,coins,amount,dp);
//        if(ans==Integer.MAX_VALUE) return -1;
//        return ans;
//    }
//    public static void main(String[] args){
//
//    }
//}



// Longest Palindromic  subsequences
//package Dynamic_Programming;
//public class dp_02 {
//    public int lcs(int i,int j, StringBuilder a, StringBuilder b, int[][] dp){
//        if(i<0||j<0) return 0;
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j))
//            return dp[i][j] = 1 + lcs(i-1,j-1,a,b,dp);
//        else
//            return dp[i][j] = Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
//    }
//    public int longestCommonSubSequence(String text1, String text2){
//        StringBuilder a = new StringBuilder(text1);
//        StringBuilder b =new StringBuilder(text2);
//        int m  = a.length(), n = b.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++)
//            for(int j=0;j<n;j++) dp[i][j] = -1;
//            return lcs(m-1,n-1,a,b,dp);
//        }
//       public String reverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        s = sb.toString();
//        return s;
//       }
//
//        public int longestPalindromicSubSequence(String s){
//         return longestCommonSubSequence(s,reverse(s));
//        }
//    public static void main(String[] args){
//
//    }
//}




//
//package Dynamic_Programming;
//public class dp_02 {
//    public int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
//        if (i < 0 || j < 0) return 0;
//        if (dp[i][j] != -1) return dp[i][j];
//        if (a.charAt(i) == b.charAt(j))
//            return dp[i][j] = 1 + lcs(i - 1, j - 1, a, b, dp);
//        else
//            return dp[i][j] = Math.max(lcs(i - 1, j, a, b, dp), lcs(i, j - 1, a, b, dp));
//    }
//
//    public int longestCommonSubSequence(String text1, String text2) {
//        StringBuilder a = new StringBuilder(text1);
//        StringBuilder b = new StringBuilder(text2);
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++)
//            for (int j = 0; j < n; j++) dp[i][j] = -1;
//        return lcs(m - 1, n - 1, a, b, dp);
//    }
//
//    public String reverse(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        s = sb.toString();
//        return s;
//    }
//
//    public int longestPalindromicSubSequence(String s) {
//        return longestCommonSubSequence(s, reverse(s));
//    }
//    public int minInsertions(String s){
//        return s.length()-  longestPalindromicSubSequence(s);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}



// Edit distance
// recursive code
//package Dynamic_Programming;
//public class dp_02 {
//    public int minSteps(int i, int j,StringBuilder a, StringBuilder b){
//        if(i==-1) return j+1;
//        if(j==-1) return i+1;
//
//        if(a.charAt(i)==b.charAt(j)) return minSteps(i-1,j-1,a,b);
//     else {
//         int del = minSteps(i-1,j,a,b);
//         int ins = minSteps(i,j-1,a,b);
//         int rep = minSteps(i-1,j-1,a,b);
//          return 1 + Math.min(del,Math.min(ins,rep));
//     }
//    }
//    public int minDistance(String word1,String word2){
//        StringBuilder a = new StringBuilder(word1);
//        StringBuilder b = new StringBuilder(word2);
//        int m = a.length(),n = b.length();
//
//
//        return minSteps(m-1,n-1,a,b);
//    }
//    public static void main(String[] args){
//
//    }
//}


// DP CODE
//package Dynamic_Programming;
//public class dp_02 {
//    public int minSteps(int i, int j,StringBuilder a, StringBuilder b, int[][] dp){
//        if(i==-1) return j+1;
//        if(j==-1) return i+1;
//
//        if(dp[i][j]!=-1) return dp[i][j];
//
//        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=minSteps(i-1,j-1,a,b,dp);
//        else {
//            int del = minSteps(i-1,j,a,b,dp);
//            int ins = minSteps(i,j-1,a,b,dp);
//            int rep = minSteps(i-1,j-1,a,b,dp);
//            return dp[i][j] = 1 + Math.min(del,Math.min(ins,rep));
//        }
//    }
//    public int minDistance(String word1,String word2){
//        StringBuilder a = new StringBuilder(word1);
//        StringBuilder b = new StringBuilder(word2);
//        int m = a.length(),n = b.length();
//
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++)
//            for(int j=0;j<n;j++) dp[i][j] = -1;
//
//        return minSteps(m-1,n-1,a,b,dp);
//    }
//    public static void main(String[] args){
//
//    }
//}

// code for the print of the  longect Common Subsequences
//package Dynamic_Programming;
//public class dp_02 {
//    public static int longestCommonSubSequences(String a, String b) {
//        int m = a.length();
//        int n = b.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for (int i = 1; i <=m; i++) {
//            for (int j = 1; j <=n; j++) {
//                if (a.charAt(i - 1) == b.charAt(j - 1))
//                    dp[i][j] = 1 + dp[i - 1][j - 1];
//                else
//                    dp[i][j] = Math.max(dp[i][j - 1], dp[0][j]);
//            }
//            for (int j = 0; j <= n; j++) dp[0][j] = dp[i][j];
//        }
//
//        StringBuilder  str = new StringBuilder("");
//
//        int i = m, j = n;
//        while(i>0 && j>0){
//            if(a.charAt(i-1)==b.charAt(j-1)) str.append(a.charAt(i-1));
//            if(dp[i-1][j]>dp[i][j-1]) i--;
//            else  j--;
//        }
//
//        System.out.println(str);
//        return dp[m][n];
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//}
