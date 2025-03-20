//package Dynamic_Programming;
//   unique Binary search  tree

//public class dp_03 {
//    public int numTrees(int n){
//        if(n<=1) return 1;
//        int[] dp = new int[n+1];
//        dp[0] = 1; dp[1] = 1;
//        dp[2] = 2;
//        for(int i=3;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                dp[i] += dp[j-1] *dp[i-j];
//            }
//        }
//        return dp[n];
//
//    }
//     public static void main(String[] args){
//
//     }
//}



// shortest common superSequences
//Dynamic_Programming
// DP CODE TO SOLVE THE SHORTEST sEQUENCES PROBLEMS
//package Dynamic_Programming;
//public class dp_03 {
//    public String LCS(String a, String b){
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m+1][n+1];
//        int max = 0;
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++){
//                if(a.charAt(i-1)==b.charAt(j-1))
//                    dp[i][j] = 1+dp[i-1][j-1];
//                else
//                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//            }
//        }
//        StringBuilder str = new StringBuilder("");
//        int i=m, j=n;
//        while(i>0&& j>0) {
//            if (a.charAt(i - 1) == b.charAt(j - 1)) {str.append(a.charAt(i - 1));
//            i--;
//            j--;
//        }
//            else if(dp[i-1][j]>dp[i][j-1]) i--;
//            else j--;
//        }
//        str.reverse();
//        System.out.println(str);
//
//        return str.toString();
//
//    }
//
//    public String ShortestCommonSupersequence(String a, String b){
//        String lcs  = LCS(a,b);
//        int i=0, j=0, k=0;
//        String scs = "";
//        while(i<a.length()&& j<b.length()&& k<lcs.length()){
//            while(a.charAt(i)!=lcs.charAt(k)){
//                scs+= a.charAt(i);
//                i++;
//            }
//            while(b.charAt(j)!=lcs.charAt(k)){
//                scs += b.charAt(j);
//                j++;
//            }
//            scs += lcs.charAt(k);
//            i++;j++;k++;
//        }
//        if(i==a.length()){
//            while(j<b.length()){
//                scs += b.charAt(j);
//                j++;
//            }
//        }
//        if(j==b.length()) {
//            while (i < a.length()) {
//                scs += a.charAt(i);
//                i++;
//            }
//        }
//        return scs;
//
//    }
//    public static void main(String[] args){
//
//    }
//}


// KNAPSACK 0/1
//package Dynamic_Programming;
//public class dp_03 {
//    public static int profit(int i, int[] wt,int[] val, int c,int[][] dp){
//        if(i==wt.length) return 0;
//        if(dp[i][c]!= -1) return dp[i][c];
//
//
//        int skip = profit(i+1,wt,val,c,dp);
//        if(wt[i]>c) return dp[i][c] = skip;
//        int pick  = val[i]  + profit(i+1,wt,val,c-wt[i],dp);
//        return dp[i][c] =  Math.max(pick,skip);
//
//    }
//    public static void main(String[] args){
//        int[] val = {5,3,9,16};
//     int[] wt = {1,2,8,10};
//     int c = 8;int n = wt.length;
//     int[][] dp = new int[n][c+1];
//     for(int i=0;i<dp.length;i++)
//         for(int j=0;j<dp[0].length;j++)   dp[i][j] = -1;
//
//        System.out.println(profit(0,wt,val,c,dp));
//    }
//}



//
//package Dynamic_Programming;
//public class dp_03{
//    public static boolean subsetSum(int i, int sum, int[] arr, int target){
//        if(i==arr.length){
//            if(sum==target) return true;
//            else return true;
//
//        }
//        boolean skip = subsetSum(i+1,sum,arr,target);
//        boolean pick  = subsetSum(i+1,sum+arr[i],arr,target);
//        return pick||skip;
//    }
//    public static void main(String[] args){
//        int[] arr = {8,5,2,4};
//        int target = 9;
//        System.out.println(subsetSum(0,0,arr,target));
//
//    }
//}




// DP CODE
// Palindromic Substrings
//package Dynamic_Programming;
//public class dp_03 {
//    public static int countSubStrings(String s) {
//        int n = s.length(), count = 0;
//        int[][] dp = new int[n][n];
//        for (int k = 0; k < n; k++) {
//            int i = 0, j = k;
//            while (j < n) {
//                if (i == j) {
//                    dp[i][j] = 1;
//                    count++;
//                } else if (j == i + 1) {
//                    if (s.charAt(i) == s.charAt(j)) {
//                        dp[i][j] = 1;
//                        count++;
//                    }
//                } else {
//                    if (s.charAt(i) == s.charAt(j)) {
//                        if (dp[i + 1][j - 1] == 1) {
//                            dp[i][j] = 1;
//                            count++;
//                        }
//                    }
//                }i++;j++;
//            }
//        }
//        return count;
//
//    }
//    public static void main(String[] args){
//
//    }
//}


//longest Common SubString
//package Dynamic_Programming;
//public class dp_03 {
//    public static int longestCommonSubsequence(String a, String b){
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m+1][n+1];
//        int max = 0;
//        for(int i=1;i<m;i++){
//            for(int j=1;j<n;j++){
//                if(a.charAt(i)==b.charAt(j-1))
//                    dp[i][j] = 1 + dp[i-1][j-1];
//                else
//                    dp[i][j] = 0;
//                max = Math.max(max,dp[i][j]);
//
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args){
//
//    }
//}





// diamter of the binary trees

//package Dynamic_Programming;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class dp_03 {
//    public int levels(Node root, int[] dia){
//        if(root==null) return 0;
//        int left = levels(root.left,dia);
//        int right = levels(root.right,dia);
//        int path = left+right;
//        dia[0] = Math.max(dia[0],path);
//        return 1+Math.max(left,right);
//
//    }
//    public int diameter(Node root){
//        int[] dia = {0};
//        levels(root,dia);
//        return dia[0];
//    }
//    public static void main(String[] args){
//
//    }
//}




/// code for the diameter of the binary trees with the
// memoization with HashMap

//package Dynamic_Programming;
//import java.util.*;
//public class dp_03 {
//    public static Map<Node,Integer> dp;
//    class Node {
//        int data;
//        Node left;
//        Node right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    public static  int levels(Node root){
//        if(root==null) return 0;
//        if(dp.containsKey(root)) return dp.get(root);
//        int left = levels(root.left);
//        int right = levels(root.right);
//        dp.put(root,1+Math.max(left,right));
//        return dp.get(root);
//
//    }
//    public static int diameter(Node root){
//        if(root==null) return 0;
//        int myDia = levels(root.left)+levels(root.right);
//        int leftDia = diameter(root.left);
//        int rightDia = diameter(root.right);
//        return Math.max(myDia,Math.max(leftDia,rightDia));
//
//    }
//    public static int diameterOfBinaryTreees(Node root){
//        dp = new HashMap<>();
//        return diameter(root);
//    }
//    public static void main(String[] args){
//
//    }
//}



// Binary tree Maximum Path sum
//package Dynamic_Programming;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class dp_03 {
//    public static int maxSum;
//    public static  int lineSum(Node root){
//        if(root==null) return 0;
//        int leftLineSum = lineSum(root.left);
//        int rightLineSum = lineSum(root.right);
//        int pathSum = root.data;
//        if(leftLineSum>0) pathSum +=leftLineSum;
//        if(rightLineSum>0) pathSum +=rightLineSum;
//
//        maxSum = Math.max(maxSum,pathSum);
//        return root.data + Math.max(0,Math.max(leftLineSum,rightLineSum));
//    }
//    public static int maxPathSum(Node root){
//        maxSum = Integer.MIN_VALUE;
//        lineSum(root);
//        return maxSum;
//    }
//    public static void main(String[] args){
//
//    }
//}


// Russsian doll envelopes
//package Dynamic_Programming;
//
//import java.util.Arrays;
//
//public class dp_03 {
//    public class Envelop implements Comparable<Envelop> {
//        int w;
//        int h;
//        Envelop(int w, int h){
//            this.w = w;
//            this.h = h;
//        }
//
//        @Override
//        public int compareTo(Envelop e) {
//            if(this.w==e.w) return e.h = this.h;
//
//            return this.w = e.w;
//        }
//    }
//
//    public int maxEnvelopes(int[][] envelopes) {
//    int n = envelopes.length;
//    Envelop[] arr = new Envelop[n];
//    for(int i=0;i<n;i++){
//        int w = envelopes[i][0];
//        int h = envelopes[i][1];
//        arr[i] =new Envelop(w,h);
//    }
//    Arrays.sort(arr);
//    // LIS on this array
//int[] dp = new int[n];
//int max = 0;
//for(int i = 0;i<n;i++){
//    for(int j = 0;j<=i-1;j++){
//        if(arr[j].h < arr[i].h)
//            dp[i] = Math.max(dp[i],dp[j]);
//    }
//    dp[i] += 1;
//    return Math.max(max,dp[i]);
//}
//return max;
//    }
//
// public static void main(String[] args){
//
//    }
//}




// longest increasing subsequences
//package Dynamic_Programming;
//public class dp_03 {
//    public static int lengthOfLIS(int[] nums){
//        int n = nums.length;
//        int max  = 0;
//        int[] dp = new int[n];
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j <= i - 1; j++) {
//                if (nums[j] < nums[i])
//                    dp[i] = Math.max(dp[i], dp[j]);
//            }
//            dp[i] += 1;
//            max = Math.max(max, dp[i]);
//        }
//        return max;
//    }
//    public static void main(String[] args){
//
//    }
//}




// maximum number of the removal to make the mountain array
//package Dynamic_Programming;
//public class dp_03 {
//    public int maximumMountainRemovals(int[] nums) {
//        int n = nums.length;
//        int max = 0;
//        int[] dp1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i - 1; j++) {
//                if (nums[j] < nums[i])
//                    dp1[i] = Math.max(dp1[i], dp1[j]);
//            }
//            dp1[i] += 1;
//            max = Math.max(dp1[i], max);
//        }
//
//        int[] dp2 = new int[n];
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i + 1; j <= n - 1; j++) {
//                if (nums[j] < nums[i])
//                    dp2[i] = Math.max(dp2[i], dp2[j]);
//            }
//            dp2[i] += 1;
//
//        }
//        int maxLen = 0;
//        for (int i = 0; i < n; i++) {
//            if (dp1[i] > 1 && dp2[i] > 1) {
//                int len = dp1[i] + dp2[i] - 1;
//                maxLen = Math.max(maxLen, len);
//            }
//        }
//            if (maxLen < 3) return 0;
//            return n -maxLen;
//
//    }
//    public static void main(String[] args){
//
//    }
//}
//
//


