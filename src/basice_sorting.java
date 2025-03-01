//package chauhan;
// to check the array is sorted or not in the array
//import java.util.Scanner;
//public class basics_sorting {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }//package chauhan;
//// question of t two merge sorted array
////
////public class Advance_sorting {
////    static void print(int[] arr){
////        for(int x:arr){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////    static void merge(int[] a, int[] b, int[] c){
////        int i=0, j=0, k=0;
////        while(i<a.length&&j<b.length){
////            if(a[i]<b[j]){
////                c[k] = a[i];
////                i++;
////            }
////            else {
////                c[k] =  b[j];
////                j++;
////            }
////            k++;
////            if(i==a.length){
////                while(j<b.length){
////                    c[k] = b[j];
////                    j++;k++;
////                }
////                if(j==b.length){
////                    while(i<a.length){
////                        c[k] = a[i];
////                        i++;k++;
////                    }
////                }
////            }
////        }
////    }
////    public static void main(String[] args){
////        int[] a = {10,20,40,60,78,90};
////        int[] b = {15,25,30,45,50,80};
////        print(a);
////        print(b);
////        int[] c = new int[a.length+b.length];
////        merge(a,b,c);
////        print(c);
////    }
//// }
//
////
////package chauhan;
//// //merge sort algorithm
////import java.util.Scanner;
////public class Advance_sorting  {
////    static void print(int[] arr){
////        for(int x :arr){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////        static void merge(int[] a, int[] b, int[] c){
////        int i=0, j=0, k=0;
////        while(i<a.length&&j<b.length) {
////            if (a[i] <= b[j]) c[k++] = a[i++];
////
////            else c[k++] = b[j++];
////        }
////
////                while(j<b.length) {
////                    c[k++] = b[j++];
////                    while (i < a.length) {
////                        c[k++] = a[i++];
////                    }
////                }
////          }
////    static void mergesort(int[] arr){
////        int n = arr.length;
////        if(n==1) return;
////        int[] a = new int[n/2];
////        int[] b = new int[n-n/2];
////         for(int i=0;i<n/2;i++){
////             a[i] = arr[i];
////         }
////         for(int i=0;i<n-n/2;i++){
////             b[i] = arr[i+n/2];
////         }
////         mergesort(a);
////         mergesort(b);
////         merge(a,b,arr);
////    }
////    public static void main(String[] args) {
////        int[] arr = {80,30,50,20,60,10,70,40};
////        int n = arr.length;
////        print(arr);
////        mergesort(arr);
////        print(arr);
////
////    }
////}
////
////
////
////
//////package chauhan;
//// code for the quick sort to arrange the code in the ascending order
////public class Advance_sorting {
////    static void swap(int[] arr, int i, int j){
////        int temp = arr[i];
////        arr[i] = arr[j];
////        arr[j] = temp;
////    }
////    static void print(int[] arr){
////        for(int x : arr){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////    static int partition(int[] arr, int low, int high){
////       int pivot = arr[low],pIdx = low;
////       int smallerCount  = 0;
////       for(int i=low+1;i<=high;i++){
////           if(arr[i]<=pivot) smallerCount++;
////       }
////       int correctidx = low + smallerCount;
////       int temp = arr[pIdx];
////       arr[pIdx] = arr[correctidx];
////       arr[correctidx] = temp;
////       int i = low, j = high;
////        while(i<=correctidx&&j>correctidx){
////            if(arr[i]<=pivot) i++;
////            else if(arr[j]>pivot) j--;
////            else if(arr[i]>pivot&&arr[j]<=pivot){
////                swap(arr,i,j);
////            }
////        }
////    return correctidx;
////    }
////    static void quicksort(int[] arr, int low, int high){
////        if(low>=high) return;
////
////        int idx  =  partition(arr,low,high);
////        quicksort(arr,low,idx-1);
////        quicksort(arr,idx+1,high);
////    }
////    public static void main(String[] args){
////        int[] arr = {4,9,7,1,2,3,6,5,8};
////        int n = arr.length;
////        print(arr);
////        quicksort(arr,0,n-1);
////        print(arr);
////    }
////}
//
//
//
////
////package chauhan;
////public class Advance_sorting{
////    static void print(int[] arr){
////        for(int x :arr){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////    static void swap(int[] arr, int i, int j){
////        int temp = arr[i];
////        arr[i] = arr[j];
////        arr[j] = temp;
////    }
////    static int partition(int[] arr, int low, int high){
////        int pivot  = arr[low], pivotidx = low;
////        int smallerans = 0;
////        for(int i=low+1;i<=high;i++){
////            if(arr[i]<=pivot) smallerans++;
////        }
////        int correctidx = low+smallerans;
////        swap(arr,pivotidx,correctidx);
////        int i = low, j = high;
////        while(i<=correctidx&&j>correctidx){
////            if(arr[i]<=pivot)i++;
////            else if(arr[j]>pivot)j--;
////            else if(arr[i]>pivot&&arr[j]<pivot){
////                swap(arr,i,j);
////            }
////        }
////        return correctidx;
////    }
////    static void quicksort(int[] arr, int low, int high){
////        if(low>=high) return;
////        int idx = partition(arr,low,high);
////        quicksort(arr,low,idx-1);
////        quicksort(arr,idx+1,high);
////    }
////    public static void main(String[] args){
////        int[] arr = {4,9,7,1,2,3,6,5,8};
////        int n = arr.length;
////        print(arr);
////        quicksort(arr,0,n-1);
////        print(arr);
////    }
//// }
//
//
//
////package chauhan;
////public class Advance_sorting {
////    static void swap(int[] arr, int i, int j){
////        int temp = arr[i];
////        arr[i] = arr[j];
////        arr[j] = temp;
////    }
////    static void print(int[] arr){
////        for(int x :arr){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////    static int partition(int[] arr, int low, int high){
////        int pivot  = arr[low], pivotidx = low;
////        int smallans  = 0;
////        for(int i = low+1;i<=high;i++){
////            if(arr[i]<=pivot) smallans++;
////        }
////        int correctidx = low+smallans;
////        swap(arr,pivotidx,correctidx);
////        int i = low, j = high;
////        while(i<correctidx&&j>correctidx){
////            if(arr[i]<=pivot)i++;
////            if(arr[j]>pivot)j--;
////            if(arr[i]>=pivot&&arr[j]<pivot){
////                swap(arr, i, j);
////            }
////        }
////        return correctidx;
////    }
////    static void quicksort(int[] arr, int low, int high){
////        if(low>=high) return;
////        int idx = partition(arr,low,high);
////        quicksort(arr,low,idx-1);
////        quicksort(arr,idx+1,high);
////    }
////    public static void main(String[] args){
////        int[] arr = {4,3,7,6,0,9,1,2,5,12};
////        int n = arr.length;
////        print(arr);
////        quicksort(arr,0,n-1);
////        print(arr);
////
////    }
////}
//
//
//
////
////package chauhan;
////import java.util.Scanner;
////public class Advance_sorting {
////    static int smallestDivisor(int[] arr, int t){
////        int n = arr.length;
////        int mx = Integer.MIN_VALUE;
////        for(int i=0;i<n;i++){
////            Math.max(mx,arr[i]);
////        }
////        int d= 1;
////        for(d = 1;d<=mx;d++){
////            int sum = 0;
////            for(int i=0;i<n;i++){
////                if(arr[i]%d==0) sum+=arr[i]/d;
////                else sum+=arr[i]/d+1;
////            }
////            if(sum<=t) return d;
////        }
////        return d;
////    }
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////          int[] arr = {5,3,8,7,9,1,6};
////          int n = arr.length;
////          int t = 12;
////        System.out.println(smallestDivisor(arr,t));
////    }
////}
//
//
////
////package chauhan;
//// finding the smallest divisor in the threshold
////import java.util.Scanner;
////public class Advance_sorting {
////    static boolean isLess(int mid, int[] arr, int t){
////        int sum = 0;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]%mid==0) sum+=arr[i]/mid;
////            else sum+=arr[i]/mid+1;
////        }
////        if(sum<=t) return true;
////        return false;
////    }
////    public  static int smallestdivisor(int[] arr, int t){
////        int n = arr.length;
////        int mx = Integer.MAX_VALUE;
////        for(int i=0;i<n;i++){
////            mx = Math.max(mx,arr[i]);
////        }
////        int d = 1;
////        int low = 0, high = mx;
////        while(low<=high){
////            int mid = low+(high-low)/2;
////            if(isLess(mid,arr,t)==true){
////                d = mid;
////                high = mid-1;
////            }
////            else low = mid+1;
////        }
////        return d;
////    }
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        int[] arr = {5,8,3,2,9,12,90,21};
////        int n = arr.length;
////        int t = 9;
////        System.out.println(smallestdivisor(arr,t));
////        }
////}
//
//
//
////package chauhan;
////import java.util.Scanner;
////public class Advance_sorting {
////    static void display(int[] arr) {
////        int n = arr.length;
////        for (int x : arr) {
////            System.out.print(x + " ");
////        }
////        System.out.println();
////    }
////
////    static void swap(int[] arr, int i, int j) {
////        int temp = arr[i];
////        arr[i] = arr[j];
////        arr[j] = temp;
////    }
////
////    static void sortevenodd(int[] arr) {
////        int n = arr.length;
////        int left = 0, right = n - 1;
////        while (left < right) {
////            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
////                swap(arr, left, right);
////                left++;
////                right--;
////            }
////            if (arr[left] % 2 == 0) {
////                left++;
////            }
////            if (arr[right] % 2 == 1) {
////                right--;
////            }
////        }
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the number of the elements ");
////        int n = sc.nextInt();
////        int[] arr = new int[n];
////        for (int i = 0; i < n; i++) {
////            arr[i] = sc.nextInt();
////        }
////        display(arr);
////        sortevenodd(arr);
////        display(arr);
////        System.out.println("enter the number of the elements ");
////        int p = sc.nextInt();
////        int[] brr = new int[p];
////        for (int i = 0; i < p; i++) {
////            brr[i] = sc.nextInt();
////            display(brr);
////            sortevenodd(brr);
////            display(brr);
////        }
////    }
////}
//
//
//
//
//
//
//
//
////}
////package chauhan;
////import java.util.*;
////public class Advance_sorting {
////    static void swap(int[] arr, int i, int j) {
////        int temp = arr[i];
////        arr[i] = arr[j];
////        arr[j] = temp;
////    }
////    static void alternate(int arr[], int n )
////    {
////        Arrays.sort(arr) ;
////
////        Vector v1 = new Vector();
////        Vector v2 = new Vector();
////        for (int i = 0; i < n; i++)
////            if (arr[i] % 2 == 0)
////                v1.add(arr[i]);
////            else
////                v2.add(arr[i]);
////
////        int index = 0, i = 0, j = 0;
////
////        boolean flag = false;
////        if (arr[0] % 2 == 0)
////            flag = true;
////
////
////        while (index < n)
////        {
////
////            if (flag == true)
////            {
////                arr[index] = (int)v1.get(i);
////                i += 1 ;
////                index += 1 ;
////                flag = !flag;
////            }
////
////
////            else
////            {
////                arr[index] = (int)v2.get(j) ;
////                j += 1 ;
////                index += 1 ;
////                flag = !flag;
////            }
////        }
////
////
////        for (i = 0; i < n; i++)
////            System.out.print(arr[i] + " ");
////    }
////
////    static void sortevenodd(int[] arr) {
////        int n = arr.length;
////        int left = 0, right = n - 1;
////        while (left < right) {
////            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
////                swap(arr, left, right);
////                left++;
////                right--;
////            }
////            if (arr[left] % 2 == 0) {
////                left++;
////            }
////            if (arr[right] % 2 == 1) {
////                right--;
////            }
////        }
////    }
////
////    public static void main(String[] args) {
////        int[] firstArray = {23, 45, 12, 78, 4, 90, 1};
////        int[] secondArray = {77, 11, 45, 88, 32, 56, 3};
////        int l1 = firstArray.length;
////        int l2 = secondArray.length;
////        int[] result = new int[l1 + l2];
////        System.arraycopy(firstArray, 0, result, 0, l1);
////        System.arraycopy(secondArray, 0, result, l1, l2);
////        System.out.println(Arrays.toString(result));
////        sortevenodd(result);
////        System.out.println(Arrays.toString(result));
////        alternate(result,l1+l2);
////        }
////    }
////
//
//
//
////package chauhan;
//// rotate the  2-D array by 90 degree
////import java.util.Scanner;
////public class Advance_sorting {
////    static void display(int[][] arr){
////        int m = arr.length;
////        int n = arr[0].length;
////        for(int i=0;i<m;i++){
////            for(int j=0;j<n;j++){
////                System.out.print(arr[i][j]+" ");
////            }
////            System.out.println();
////        }
////        System.out.println();
////    }
////    public static void main(String[] args) {
////        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
////     int m = arr.length;
////     int n = arr[0].length;
////     display(arr);
////     for(int j=0;j<n;j++){   // transpoing
////         for(int i=0;i<m;i++){
////             System.out.print(arr[i][j]+" ");
////         }
////         System.out.println();
////     }
////        System.out.println();
////     for(int i=0;i<m;i++){
////         int a = 0, b = m-1;
////         while(a<b){
////             int temp = arr[i][a];
////             arr[i][a] = arr[i][b];
////             arr[i][b] = temp;
////             a++;
////             b--;
////         }
////     }
////     display(arr);
////    }
////}
//        boolean flag = true;
//        for(int i=0;i<n-1;i++){
//            if(arr[i]>arr[i+1]){
//                flag = false;
//                break;
//            }
//        }
//        if(flag==true){
//            System.out.println("array is sorted");
//        }
//        else {
//            System.out.println("array is unsorted");
//        }
//    }
//}




//
//package chauhan;
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        print(arr);
//        for(int x = 1;x<=n-1;x++){    // this is the worst case
//            for(int i=0;i<n-1-x;i++){    // of the bubble sort
//                if(arr[i]>arr[i+1]){
//                 int temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp;
//                }
//            }
//            System.out.println();
//        }
//        for(int x = 1;x<=n-1;x++){
//            for(int i=0;i<n-1-x;i++){    // this  is  the good approach
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//                System.out.println();
//            }
//        }
//print(arr);
//}
//}




//package chauhan;
// to sort the array by using selection sort algorithm
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {10,-6, 20,1,-4,8};
//        int n = arr.length;
//        print(arr);
//        for(int i=0;i<n-1;i++){
//            int min = Integer.MAX_VALUE;
//            int  mindx = -1;
//            for(int j = i;j<n;j++){
//                if(arr[j]<min){
//                    min = arr[j];
//                    mindx = j;
//                }
//            }// swap the arr[i] and arr[mindx]
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }
//        System.out.println();
//        print(arr);
//    }
//}
//
//
//
//



//
//package chauhan;
// code for the insertion sort   // 1 st method
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        print(arr);
//        for(int i=1;i<n;i++){
//            for(int j=i;j>=1;j--){
//                if(arr[j]<arr[j-1])
//                        swap(arr, j,j-1);
//                        else break;
//                }
//            System.out.println();
//            }
//        print(arr);
//        }
//    }
//




//package chauhan;
// code for insertion sort           // 2nd  method
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    static void swap(int[] arr, int i, int j){
//        int temp  = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        print(arr);
//        for(int i=1;i<n;i++){
//            int j  = i;
//            while(j>=1&&arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//                j--;
//            }
//            System.out.println();
//        }
//        print(arr);
//    }
//}



// revision part of the three sorting
//package chauhan;
                                      // code for the bubble sort
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        print(arr);
//        for(int x = 1;x<n-1;x++){
//            for(int i = 0;i<n-1-x;i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            System.out.println();
//        }
//        print(arr);
//    }
//}


//package chauhan;
                                      // code for selection sort
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the siz eof the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        print(arr);
//        for(int i=0;i<n-1;i++){
//            int min = Integer.MAX_VALUE;
//            int mindx = -1;
//            for(int j = i;j<n;j++){
//                if(arr[j]<min){
//                    min = arr[j];
//                    mindx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }
//        System.out.println();
//        print(arr);
//
//    }
//}


//package chauhan;
                            // code for insertion sort
//import java.util.Scanner;
//public class basics_sorting {
//    static void print(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of the array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        print(arr);
//        for(int i=1;i<n;i++){
//            int j = i;
//            while(j>0&&arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//                j--;
//            }
//        }
//        print(arr);
//    }
//}


// code for binary search
//package chauhan;
//import java.util.Scanner;
//public class basics_sorting {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {10,23,46,89,91,107,140,264};
//        int n = arr.length;
//        int target = 23;
//        int low = 0, high = n-1;
//        boolean flag = false;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]==target){
//                flag  = true;
//                break;
//            }
//            else if(arr[mid]>target)
//                high = mid - 1;
//
//            else if(arr[mid]<target)
//                low = mid +1;
//            }
//            if(flag ==true) System.out.println("target present");
//            else System.out.println("target not found");
//        }
//    }



//package chauhan;
// code for the lower bound by using binary search
//import java.util.Scanner;
//public class basics_sorting {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {12,23,45,65,76,78,123,125,345};
//        int n = arr.length;
//        int target = 123;
//        int lb = n;
//        int low = 0, high = n-1;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]>=target){
//                lb = Math.min(lb,mid);
//                high = mid-1;
//            }
//            else low = mid+1;
//        }
//        System.out.println(lb);
//    }
//}





// question on finding the lower and the upper bound in the array

//package chauhan;
//public class basics_sorting {
//    public static void main(String[] args){
//        int[] arr = {10,20,30,30,40,50,60,70};
//        int n =arr.length;
//        int target = 45;
//        int lb = n;
//        int low = 0, high = n-1;
//        while(low<=high){
//            int mid = low+(high-low)/2;
//            if(arr[mid]>=target){
//                lb = Math.min(lb,mid);
//                high = mid-1;
//            }
//            else low = mid+1;
//        }
//        System.out.println(lb);
//    }
//}





//question base on front position and last position
//package chauhan;
//public class basics_sorting {
//    public static void   main(String[] args){
//        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40};
//        int n = arr.length;
//        int[] ans  = {-1,-1};
//        int target = 20;
//        int fp = -1;
//        int low = 0, high = n-1;
//        boolean flag = false;
//        while(low<=high){
//            int mid = low+(high-low)/2;
//            if(arr[mid]==target){
//                flag = true;
//                break;
//            }
//            else if(arr[mid]>target) high = mid-1;
//            else if(arr[mid]<target) low = mid+1;
//        }
//
//        low = 0;high = n-1;
//        int lb = n;
//        while(low<=high){
//            int mid = low+(high-low)/2;
//            if(arr[mid]>=target){
//                lb = Math.min(lb,mid);
//                high = mid-1;
//            }
//            else low = mid+1;
//        }
//        ans[0] = lb;
//        low = 0; high = n-1;
//        int ub  = n;
//        while(low<=high){
//            int mid = low+(high-low)/2;
//            if(arr[mid]>target){
//                ub = Math.min(ub,mid);
//                high = mid-1;
//            }
//            else low = mid+1;
//        }
//        ans[1] = ub-1;
//    }
//
//}




//import java.util.*;
// to print the fibonacci series using recursion

//public class basice_sorting{
//
//    public static int fib(int n){
//        if(n==0||n==1){
//            return n;
//        }
//        else {
//            int x = fib(n-1);
//            int y = fib(n-2);
//            return 1+ x+y;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println(fib(i));
//        }
//    }
//}



