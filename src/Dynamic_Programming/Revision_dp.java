// Subset sum problem
//recursive code


//package Dynamic_Programming;
//public class Revision_dp {
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


// dp code
/*
 package Dynamic_Programming;
public class Revision_dp {
    public static boolean subsetSum(int i,  int[] arr, int target, int[][] dp){
        if(i==arr.length) {
            if(target==0) return true;
            else return false;

        }

    }
    public static void main(String[] args){

    }

}*/

// target sum
// recurive code

//package Dynamic_Programming;
//public class Revision_dp {
//    public static int ways(int i, int[] arr, int target){
//        if(i==arr.length){
//            if(target==0) return 1;
//            else return 0;
//        }
//        int add = ways(i+1,arr,target-arr[i]);
//        int sub = ways(i+1,arr,target+arr[i]);
//        return add+sub;
//    }
//
//    public static int findWays(int[] arr, int target){
//        return ways(0,arr,target);
//    }
//    public static void main(String[] args){
//
//    }
//}




// target sum
//package Dynamic_Programming;
//public class Revision_dp {
//    public static int sum;
//    public static int ways(int i, int[] arr,int res, int target, int[][] dp){
//        if(i==arr.length){
//            if(res==target) return 1;
//            else return 0;
//        }
//        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
//        int add = ways(i+1,arr,res+arr[i],target,dp);
//        int sub = ways(i+1,arr,res-arr[i],target,dp);
//        return dp[i][sum+res] = add+sub;
//    }
//    public static int findWays(int[] arr, int target){
//        int sum = 0, n  = arr.length;
//        for(int ele:arr) sum+=ele;
//          int[][] dp = new int[n][2*sum+1];
//          for(int i=0;i<dp.length;i++)
//              for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;
//
//          return ways(0,arr,0,target,dp);
//
//    }
//    public static void main(String[] args){
//
//    }
//}



// unbounded    knapSack
//package Dynamic_Programming;
//public class Revision_dp {
//    public static int profit(int i, int[] wt, int[] val, int c, int[][] dp){
//        if(i==wt.length) return 0;
//
//        if(dp[i][c]!= -1) return dp[i][c];
//        int skip = profit(i+1,wt,val,c,dp);
//        if(wt[i]>c) return dp[i][c] = skip;
//        int pick =val[i]+ profit(i,wt,val,c-wt[i],dp);
//        return Math.max(pick,skip);
//    }
//    public static void main(String[] args){
//        int[] val = {5,3,9,16};
//        int[] wt = {1,2,8,10};
//        int c = 8;
//        int n = wt.length;
//        int[][] dp = new int[n][c+1];
//        for(int i=0;i<dp.length;i++)
//            for(int j=0;j<dp[0].length;j++)  dp[i][j] = -1;
//
//
//        System.out.println(profit(0,wt,val,c,dp));
//
//
//    }
//}




// longest common Subsequences
//package Dynamic_Programming;
//public class Revision_dp {
//    public static int lcs(int i, int j ,StringBuilder a, StringBuilder b, int[][] dp){
//        if(i<0||j<0) return 0;
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j))
//            return lcs(i-1,j-1,a,b,dp);
//            else
//                return dp[i][j] =Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
//
//    }
//
//    public static int  longestSsub(String text1,String text2){
//        StringBuilder a = new StringBuilder(text1);
//        StringBuilder b = new StringBuilder(text2);
//        int m = a.length();
//        int n = b.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++)
//            for(int j=0;j<n;j++) dp[i][j] = -1;
//
//        return lcs(m-1,n-1,a,b,dp);
//    }
//
//    public String reverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        s = sb.toString();
//        return s;
//    }
//    public static void main(String[] args){
//
//    }
//}



// Revision
//  fiboancci number =
//package Dynamic_Programming;
//public class Revision_dp {
//    public static int[] dp;
//    public static int fibo(int n){
//        if(n<=1) return n;
//        if(dp[n]!=0) return dp[n];
//        int ans  = fibo(n-1)+ fibo(n-2);
//        return dp[n] = ans;
//    }
//    public static int fib(int n){
//        dp = new int[n+1];
//        return fib(n);
//    }
//    public static void main(String[] args){
//
//    }
//}


// Tabulation fibanacci
//package Dynamic_Programming;
//public class Revision_dp {
//    public static int fib(int n){
//        int[] dp = new int[n+1];
//        if(n<=1) return n;
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }
//    public static void main(String[] args){
//
//    }
//}