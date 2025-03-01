//package BackTracking;
//// code for the  merge two sorted array
//public class sort {
//    public static void print(int[] arr){
//        int n = arr.length;
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void merge(int[] a, int[] b, int[] c){
//        int i = 0, j = 0,k = 0;
//        while(i<a.length&&j<b.length){
//            if(a[i]<b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        if(i==a.length){
//            while(j<b.length) c[k++] = b[j++];
//        }
//        if(j==b.length){
//            while(i<a.length) c[k++] = a[i++];
//        }
//    }
//    public static void main(String[] args){
//        int[] a = {10,30,50,60,80,90};
//        int[] b = {21,42,72,78};
//        int[] c = new int[a.length+b.length];
//        print(a);
//        print(b);
//        merge(a,b,c);
//        print(c);
//
//
//    }
//}




// code for the merge sort
//package BackTracking;
//public class sort{
//public static void print(int[] arr) {
//        int n = arr.length;
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void merge(int[] a, int[] b, int[] c){
//        int i = 0, j = 0,k = 0;
//        while(i<a.length&&j<b.length){
//            if(a[i]<b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        if(i==a.length){
//            while(j<b.length) c[k++] = b[j++];
//        }
//        if(j==b.length){
//            while(i<a.length) c[k++] = a[i++];
//        }
//    }
//    public static void mergeSort(int[] arr){
//    int n = arr.length;
//    if(n==1) return;
//    int[] a   =  new int[n/2];
//    int[] b = new int[n-n/2];
//    for(int i=0;i<n/2;i++){
//        a[i] = arr[i];
//    }
//    for(int i=0;i<n-n/2;i++){
//        b[i] =arr[i+n/2];
//    }
//    mergeSort(a);
//    mergeSort(b);
//    merge(a,b,arr);
//    }
//    public static void main(String[] args){
//    int[] arr = {80,30,50,20,60,10,70,40};
//    int n =arr.length;
//    print(arr);
//    mergeSort(arr);
//    print(arr);
//    }
//}






//quick sort
//package BackTracking;
//public class sort {
//    public static void print(int[] arr){
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static int partition(int[] arr, int low, int high){
//        int pivot = arr[low],pIdx  =low;
//        int smallerCount = 0;
//        for(int i=low+1;i<=high;i++){
//            if(arr[i]<=pivot) smallerCount++;
//        }
//        int correctIdx = low +smallerCount;
//        swap(arr,pIdx,correctIdx);
//        int i = low, j = high;
//        while(i<=correctIdx && j>correctIdx){
//            if(arr[i]<=pivot) i++;
//           else  if(arr[j]>pivot)j--;
//         else
//             if(arr[i]>pivot&&arr[j]<=pivot){
//                 swap(arr,i,j);
//             }
//        }
//        return correctIdx;
//    }
//
//    public static void quickSort(int[] arr, int low, int high){
//        if(low>=high) return;
//        int idx = partition(arr,low,high);
//        quickSort(arr,low,idx-1);
//        quickSort(arr,idx+1,high);
//
//    }
//    public static void main(String[] args){
//        int[] arr  = {4,9,7,1,2,3,6,5,8};
//        int n = arr.length;
//        print(arr);
//        quickSort(arr,0,n-1);
//        print(arr);
//    }
//}
//
//




//  code for the Quick sort

//package BackTracking;
//import java.util.*;
//
//public class sort {
//    public static void print(int[] arr){
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static int partition(int[] arr, int low, int high){
//        int pivot = arr[low] ,pIdx  = low;
//        int smallerCount = 0;
//        for(int i=low+1;i<=high;i++){
//            if(arr[i]<=pivot) smallerCount++;
//
//        }
//        int correctIdx = low+smallerCount;
//        swap(arr,pIdx,correctIdx);
//        int i =low, j  = high;
//        while(i<=correctIdx && j> correctIdx){
//            if(arr[i]<=pivot) i++;
//            else if(arr[j]>pivot) j--;
//            else
//                if(arr[i]>pivot && arr[j]<=pivot){
//                swap(arr,i,j);
//            }
//        }
//        return correctIdx;
//    }
//    public static void QuickSort(int[] arr, int low, int high){
//     if(low>=high) return;
//     int idx = partition(arr,low,high);
//     QuickSort(arr,low,idx-1);
//     QuickSort(arr,idx+1,high);
//
//
//    }
//    public static void main(String[] args){
//        int[] arr ={4,8,3,2,6,9,1,7,11};
//        int n = arr.length;
//        print(arr);
//        QuickSort(arr,0,n-1);
//        print(arr);
//
//    }
//}


// merge sort code
//package BackTracking;
//public class sort  {
//
//    public static void print(int[] arr){
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void merge( int[] a, int[] b, int[] c){
//        int i =0, j = 0, k = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        if(i==a.length)
//            while(j<b.length){
//                c[k++] = b[j++];
//
//            }
//            if(j==b.length)
//                while(i<a.length){
//                    c[k++] = a[i++];
//
//
//        }
//    }
//    public static void mergeSort(int[] arr){
//        int n = arr.length;
//        if(n==1) return;
//
//        int[] a = new int[n/2];
//        int[] b = new int[n-n/2];
//        for(int i=0;i<n/2;i++){
//            a[i] = arr[i];
//        }
//        for(int i=0;i<n-n/2;i++){
//            b[i] = arr[i+n/2];
//
//        }
//        mergeSort(a);
//        mergeSort(b);
//        merge(a,b,arr);
//    }
//    public static void main(String[] args){
//        int[] arr = {4,7,9,3,1,12,6,2,90};
//        int n = arr.length;
//        print(arr);
//        mergeSort(arr);
//        print(arr);
//
//    }
//}


// Revision of the Dynamic Programming
// fibonaaci number using recursion and memoziation
//package BackTracking;
//
//import java.util.*;
//
//public class sort {
//    static int[] dp;
//    public static int fibo(int n){
//        if(n<=1) return n;
//        if(dp[n]!=0) return dp[n];
//        int ans = fibo(n-1)+ fibo(n-2);
//        return dp[n] = ans;
//    }
//    public static int fib(int n){
//        Arrays.fill(-1);
//         dp  = new int[n+1];
//        return fib(n);
//    }
//    public static void main(String[] args){
//
//
//
//    }
//}



// miniumum climbing cost using recursion

//package BackTracking;
//public class sort {
//
//    public static int minCost(int[] cost, int idx){
//        if(idx==0||idx==1) return cost[idx];
//        return Math.max(minCost(cost,idx-1),minCost(cost,idx-2));
//    }
//    public static int MinClimbingStairs(int[] cost){
//        int n = cost.length;
//        return Math.min(minCost(cost,n-1),minCost(cost,n-2));
//
//    }
//    public static void main(String[] args){
//
//    }
//}

// code for teh minimum climbing cost from the Dynmamic Programming
//package BackTracking;
//
//import java.util.Arrays;
//
//public class sort{
//    public static int minCost(int[] cost, int idx, int[] dp){
//        if(idx==0||idx==1) return cost[idx];
//        if(dp[idx]!=-1) return dp[idx];
//        int ans = cost[idx]+Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
//        return dp[idx] = ans;
//
//    }
//    public static int MinClimbingCost(int[] cost){
//        int n = cost.length;
//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
//
//    }
//    public static void main(String[] args){
//
//    }
//}



// house Robber
// recursive code

//package BackTracking;
//public class sort{
//    public static int amount(int[] nums, int i){
//        if(i>=nums.length) return 0;
//        int take = nums[i]+amount(nums,i+2);
//        int skip = amount(nums,i+1);
//
//        int ans = Math.max(take,skip);
//        return ans;
//
//
//    }
//    public static int rol(int[] nums){
//        return amount(nums,0);
//    }
//    public static void main(String[] args){
//
//    }
//}



// House Robber problem using Dynamic Programming
//package BackTracking;
//import java.util.Arrays;
//public class sort {
//    public static int amount(int[] nums, int i, int[] dp) {
//        if (i >= nums.length) return 0;
//       if(dp[i]!=-1) return dp[i];
//       int skip = amount(nums,i+1,dp);
//       int take = nums[i]+ amount(nums,i+2,dp);
//
//       int ans = Math.max(take,skip);
//       return dp[i] = ans;
//
//    }
//    public static int MaxProfit(int[] nums){
//        int n =nums.length;
//        int[] dp  = new int[n];
//        Arrays.fill(dp,-1);
//
//        return amount(nums,0,dp);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//
//package BackTracking;
//import java.io.*;
//import java.util.*;
//
//class Radix {
//
//
//    static int getMax(int arr[], int n)
//    {
//        int mx = arr[0];
//        for (int i = 1; i < n; i++)
//            if (arr[i] > mx)
//                mx = arr[i];
//        return mx;
//    }
//
//
//    static void countSort(int arr[], int n, int exp)
//    {
//        int output[] = new int[n]; // output array
//        int i;
//        int count[] = new int[10];
//        Arrays.fill(count, 0);
//
//
//        for (i = 0; i < n; i++)
//            count[(arr[i] / exp) % 10]++;
//
//
//        for (i = 1; i < 10; i++)
//            count[i] += count[i - 1];
//
//
//        for (i = n - 1; i >= 0; i--) {
//            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//            count[(arr[i] / exp) % 10]--;
//        }
//
//
//        for (i = 0; i < n; i++)
//            arr[i] = output[i];
//    }
//
//
//    static void radixsort(int arr[], int n)
//    {
//        // Find the maximum number to know number of digits
//        int m = getMax(arr, n);
//
//
//        for (int exp = 1; m / exp > 0; exp *= 10)
//            countSort(arr, n, exp);
//    }
//
//    // A utility function to print an array
//    static void print(int arr[], int n)
//    {
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }
//
//    // Main driver method
//    public static void main(String[] args)
//    {
//        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
//        int n = arr.length;
//
//        // Function Call
//        radixsort(arr, n);
//        print(arr, n);
//    }
//}
//
//
//


//package BackTracking;
//import java.util.*;
//public class sort {
//    public static void great(int a, int b, int c){
//        if(a>b&&a>c){
//            System.out.println("a is greatest");
//        }
//        if(b>a&&b>c){
//            System.out.println("b is greatest");
//        }
//        if(c>a&&c>b){
//            System.out.println("c is greatest");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc  = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        int y  = sc.nextInt();
//        int z = sc.nextInt();
//        great(x,y,z);
//    }
//}


//


// code for the Quick Sort
//package BackTracking;
//import java.util.*;
//public class sort {
//    public static void print(int[] arr){
//        int n = arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//         arr[j] = temp;
//    }
//    public static int partition(int[] arr, int low , int high){
//        int pivot = arr[low] ,pIdx  = low;
//        int smallerCount  = 0;
//        for(int i=low+1;i<=high;i++){
//            if(arr[i]<=pivot) smallerCount++;
//        }
//        int correctIdx =pIdx + smallerCount;
//        swap(arr,pIdx,correctIdx);
//
//        int i = low, j = high;
//        while(i<=correctIdx && j>correctIdx){
//            if(arr[i]<=pivot)i++;
//            else if(arr[j]>pivot)j--;
//
//            else if(arr[i]>pivot&&arr[j]<=pivot){
//                swap(arr,i,j);
//            }
//        }
//        return correctIdx;
//    }
//    public static void QuickSort(int[]arr, int low, int high){
//        if(low>=high) return;
//        int idx =partition(arr,low,high);
//        QuickSort(arr,low,idx-1);
//        QuickSort(arr,idx+1,high);
//    }
//    public static void main(String[] args){
//        int[] arr = {4,5,3,2,9,0,7,8,12,43,56,11};
//        int n = arr.length;
//        print(arr);
//        QuickSort(arr,0,n-1);
//        print(arr);
//    }
//}
//



// code for the mergeSort sorting
//package BackTracking;
//import java.util.*;
//public class sort{
//    public static void print(int[]arr){
//        int n  = arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int[] arr, int i, int j){
//        int temp  = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void reverse(int[] arr){
//        int n = arr.length;
//        int i =  0, j = n-1;
//        while(i<j){
//            if(arr[i]<arr[j]){
//                swap(arr,i,j);
//            }
//        }
//    }
//
//    public static void merge(int[] a, int[] b, int[] c){
//        int i = 0, j = 0, k = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j])c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        if(i==a.length){
//            while(j<b.length){
//                c[k++] = b[j++];
//            }
//        }
//        if(j==b.length){
//            while(i<a.length){
//                c[k++] = a[i++];
//            }
//        }
//    }
//    public static void mergeSort(int[] arr) {
//        int n = arr.length;
//        int[] a = new int[n / 2];
//        int[] b = new int[n - n / 2];
//        for (int i = 0; i < n / 2; i++) {
//            a[i] = arr[i];
//        }
//        for (int i = 0; i < n - n / 2; i++) {
//            b[i] = arr[i + n / 2];
//        }
//        mergeSort(a);
//        mergeSort(b);
//        merge(arr, a, b);
//    }
//
//    public static void main(String[] args){
//
//    }
//}

