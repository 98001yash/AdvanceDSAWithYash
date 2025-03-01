//package Sorting;
////   code for the Count Sort best approach and worst approach
//public class sort_01 {
//    // finding the max number in the array to make the size of frequecy array
//    public static int findMax(int[] arr){
//        int mx  = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>mx){
//                mx = arr[i];
//            }
//        }
//        return mx;
//    }
//
//    public static void countSort(int[] arr){
//        //here we are creating  the frequency array
//        int max = findMax(arr);
//        int[] count = new int[max+1];
//        for(int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//        int k = 0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<count[i];j++){
//                arr[k++] = i;
//            }
//        }
//
//    }


// package Sorting;
// import java.util.*;
// public class sort_01{
//     public static int findMax(int[] arr){
//         int mx = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>mx){
//                 mx =arr[i];
//             }
//         }
//         return mx;
//     }

//     public static void countSort(int[]arr){
//         int max  = findMax(arr);
//         int[] count = new int[max+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//         int k = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<count[i];j++){
//                 arr[k++] = i;
//             }
//         }
//     }

//     public static void countSort(int[] arr){
//         int n = arr.length;
//         int max  = findMax(arr);
//         int[] output = new int[n];
//         int[] count = new int[max+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//
//         //MAKE PREFIX SUM ARRAY OF THE COUNT ARRAY
//         for(int i=0;i<count.length;i++){
//             count[i] +=count[i-1];
//         }
//         // now find the index of each element in the original and put in the output array
//         for(int i=n-1;i>=0;i--){
//            int idx = count[arr[i]] - 1;
//            output[idx] = arr[i];
//            count[arr[i]]--;
//        }
//         // copy all the element in the arr[i]
//         for(int i=0;i<n;i++){
//             arr[i] = output[i];
//         }
//
//     }
// public static void  main(String[] args){
//
// }
//
// }


// package Sorting;
//
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static int findMax(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//            return max;
//        }
//
//        public static void basicCountSort(int[] arr){
//        int max  = findMax(arr);
//            int n = arr.length;
//            int[] count = new int[max+1];
//            int[] output = new int[n];
//
//            for(int i=0;i<arr.length;i++){
//                count[arr[i]]++;
//            }
//            // now make the prefix sum array
//            for(int i=0;i<count.length;i++){
//                count[i]+=count[i-1];
//            }
//            // now find the  index of each element  in the original array
//            for(int i = n-1;i>=0;i--){
//                int idx = count[arr[i]]-1;
//                output[idx] = arr[i];
//                count[arr[i]]--;
//            }
//            //copy all the elements
//            for(int i=0;i<n;i++){
//                arr[i] = output[i];
//            }
//        }

//    public static void main(String[] args){
//
//    }
//}


//    // THIS IS THE MORE STABLE CODE FOR THE COUNT SORT
//    public static void BasicCountSort(int[] arr){
//        int n = arr.length;
//        int[] output= new int[n];
//        int max = findMax(arr);
//        int[] count = new int[max+1];
//        for(int i=0;i<arr.length;i++){ // Making Frequcy array
//            count[arr[i]]++;
//        }
//        // Make prefix sum array of count array
//        for(int i=1;i<count.length;i++){
//            count[i] += count[i-1];
//        }
//
//        // Find the index of the each elements in the original and put
//        // it in the Output array
//
//        for(int i=n-1;i>=0;i--){
//            int idx = count[arr[i]] - 1;
//            output[idx] = arr[i];
//            count[arr[i]]--;
//        }
//
//
//        // Copy all the element of output to array
//        for(int i=0;i<n;i++){
//            arr[i] = output[i];
//        }
//
//    }
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        int[] arr = {1,4,5,2,2,5};
//        print(arr);
//        countSort(arr);
//        print(arr);
//
//    }
//}







//
//package Sorting;
////  code for the redix  Sort
//public class sort_01 {
//    // finding the max number in the array to make the size of frequecy array
//    public static int findMax(int[] arr){
//        int mx  = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>mx){
//                mx = arr[i];
//            }
//        }
//        return mx;
//    }
//
//
//    // THIS IS THE MORE STABLE CODE FOR THE COUNT SORT
//    public static void BasicCountSort(int[] arr,int place){
//        int n = arr.length;
//        int[] output= new int[n];
//        int max = findMax(arr);
//        int[] count = new int[10];
//        for(int i=0;i<arr.length;i++){ // Making Frequcy array
//            count[(arr[i]/place)%10]++;
//        }
//        // Make prefix sum array of count array
//        for(int i=1;i<count.length;i++){
//            count[i] += count[i-1];
//        }
//
//        // Find the index of the each elements in the original and put
//        // it in the Output array
//
//        for(int i=n-1;i>=0;i--){
//            int idx = count[(arr[i]/place)%10] - 1;
//            output[idx] = arr[i];
//            count[(arr[i]/place)%10]--;
//        }
//
//
//        // Copy all the element of output to array
//        for(int i=0;i<n;i++){
//            arr[i] = output[i];
//        }
//
//    }
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//
//    public static void redixSort(int[] arr){
//     int max = findMax(arr);
//
//     // apply counting sort to sort the elements based on place value
//        for(int place = 1; max/place>0; place *=10){
//            BasicCountSort(arr,place);
//        }
//
//    }
//    public static void main(String[] args){
//        int[] arr = {1,4,5,2,2,5};
//        print(arr);
//         redixSort(arr);
//        print(arr);
//
//    }
//}
//
//
//
//



 //count Sort
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        int n = arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static int findMax(int[] arr){
//        int mx  = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>mx){
//                mx = arr[i];
//            }
//        }
//        return mx;
//    }
//        public static void countSort(int[] arr) {
//            //here we are creating  the frequency array
//            int max = findMax(arr);
//            int[] count = new int[max + 1];
//            for (int i = 0; i < arr.length; i++) {
//                count[arr[i]]++;
//            }
//            int k = 0;
//            for (int i = 0; i <= max; i++) {
//                for (int j = 0; j < count[i]; j++) {
//                    arr[k++] = i;
//                }
//            }
//
//        }
//        // THIS IS THE MORE STABLE CODE FOR THE COUNT SORt
//    public static void BasicCountSort(int[] arr){
//        int n = arr.length;
//        int[] output= new int[n];
//        int max = findMax(arr);
//        int[] count = new int[max+1];
//        for(int i=0;i<arr.length;i++){ // Making Frequcy array
//            count[arr[i]]++;
//        }
//        // Make prefix sum array of count array
//        for(int i=1;i<count.length;i++){
//            count[i] += count[i-1];
//        }
//
//        // Find the index of the each elements in the original and put
//        // it in the Output array
//
//        for(int i=n-1;i>=0;i--){
//            int idx = count[arr[i]] - 1;
//            output[idx] = arr[i];
//            count[arr[i]]--;
//        }
//
//
//        // Copy all the element of output to array
//        for(int i=0;i<n;i++){
//            arr[i] = output[i];
//        }
//
//    }
//    public static void main(String[] args){
//        int[] arr ={1,4,5,2,2,5};
//        int n  = arr.length;
//        print(arr);
//        countSort(arr);
//        print(arr);
//    }
//}



// bubble sort code
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void bubbleSort(int[] arr){
//        int n = arr.length;
//        for(int x = 1;x<n-1;x++){
//            for(int i=0;i<n-1-x;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {5,4,9,2,6,1,89,32,45};
//        print(arr);
//        bubbleSort(arr);
//        print(arr);
//    }
//}



// code for the selection sort


//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void selectionSort(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<arr.length-1;i++){
//            int min  = Integer.MAX_VALUE;
//            int mindx = -1;
//            for(int j=i;j<n;j++){
//                if(arr[j]<min){
//                    min = arr[j];
//                    mindx = j;
//                }
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {5,4,9,2,6,1,89,32,45};
//        print(arr);
//        selectionSort(arr);
//        print(arr);
//    }
//}



//  code for the insertion sort
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void insertionSort(int[] arr){
//        int n = arr.length;
//        for(int i=1;i<n;i++){
//            int j  =i;
//            while(j>0&&arr[j]<arr[j-1]){
//                int temp = arr[j];
//                arr[j]  = arr[j-1];
//                arr[j-1] = temp;
//                j--;
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {5,4,9,2,6,1,89,32,45};
//        print(arr);
//        insertionSort(arr);
//        print(arr);
//    }
//}



//
//
//    code for the merge sort
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//
//        static void merge(int[] a, int[] b, int[] c){
//        int i=0, j=0, k=0;
//        while(i<a.length&&j<b.length) {
//            if (a[i] <= b[j]) c[k++] = a[i++];
//
//            else c[k++] = b[j++];
//        }
//
//                while(j<b.length) {
//                    c[k++] = b[j++];
//                    while (i < a.length) {
//                        c[k++] = a[i++];
//                    }
//                }
//          }
//
//    public static void mergeSort(int[] arr){
//        int n = arr.length;
//        if(n==1) return;
//        int[] a = new int[n/2];
//        int[] b = new int[n-n/2];
//        for(int i=0;i<n/2;i++){
//            a[i] = arr[i];
//        }
//        for(int i= 0;i<n-n/2;i++){
//            b[i] = arr[i+n/2];
//        }
//        mergeSort(a);
//        mergeSort(b);
//        merge(a,b,arr);
//    }
//    public static void main(String[] args){
//        int[] arr = {80,30,50,20,60,10,70,40};
//        print(arr);
//        mergeSort(arr);
//        print(arr);
//    }
//}





// code for the Quick Sort

//
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static int  partition(int[] arr, int low , int high){
//        int pivot  = arr[low], pIdx = low;
//        int n = arr.length;
//        int smallerCount = 0;
//        for(int i=low+1;i<=high;i++){
//            if(arr[i]<=pivot){
//                smallerCount++;
//            }
//
//        }
//        int CorrectIdx = low+smallerCount;
//        swap(arr,pIdx,CorrectIdx);
//        int i = low, j = high;
//        while(i<=CorrectIdx && j>CorrectIdx){
//            if(arr[i]<=pivot) i++;
//            else if(arr[j]>pivot) j--;
//            else if(arr[i]>pivot && arr[j]<pivot) swap(arr,i,j);
//        }
//        return CorrectIdx;
//    }
//    public static void QuickSort(int[]arr, int low , int high){
//        if(low>=high) return;
//        int idx = partition(arr,low,high);
//        QuickSort(arr,low,idx-1);
//        QuickSort(arr,idx+1,high);
//
//    }
//    public static void main(String[] args){
//        int[] arr = {80,30,50,20,60,10,70,40};
//        int n = arr.length;
//        print(arr);
//        QuickSort(arr,0,n-1);
//        print(arr);
//    }
//}
//
//
//




// code for the count sort
//
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//        public static int findMax(int[] arr){
//        int mx  = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>mx){
//                mx = arr[i];
//            }
//        }
//        return mx;
//    }
//
//    public static void countSort(int[] arr){
//        //here we are creating  the frequency array
//        int max = findMax(arr);
//        int[] count = new int[max+1];
//        for(int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//        int k = 0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<count[i];j++){
//                arr[k++] = i;
//            }
//        }
//    }
//
//    public static void basicCountSort(int[] arr){
//        int n = arr.length;
//        int max = findMax(arr);
//        int[] output = new int[n];
//        int[] count = new int[max+1];
//
//
//        for(int i=0;i<n;i++){
//            count[arr[i]]++;
//        }
//        for(int i=0;i<n;i++){
//            count[i] += count[i-1];
//        }
//
//        for(int i=n-1;i>=0;i--){
//            int idx = count[arr[i]] - 1;
//            output[idx] = arr[i];
//            count[arr[i]]--;
//        }
//        for(int i=0;i<n;i++){
//            arr[i]  = output[i];
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {1,4,5,2,2,5};
//
//        countSort(arr);
//        print(arr);
//    }
//}

//


//c++ code

//#include <iostream>
//using namespace std;
//
//void print(int arr[], int n) {
//    for (int i = 0; i < n; i++) {
//        cout << arr[i] << " ";
//    }
//    cout << endl;
//}
//
//void swap(int arr[], int i, int j) {
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//}
//
//int partition(int arr[], int low, int high) {
//    int pivot = arr[low], pIdx = low;
//    int smallerCount = 0;
//    for (int i = low + 1; i <= high; i++) {
//        if (arr[i] <= pivot) {
//            smallerCount++;
//        }
//    }
//    int correctIdx = low + smallerCount;
//    swap(arr, pIdx, correctIdx);
//    int i = low, j = high;
//    while (i <= correctIdx && j > correctIdx) {
//        if (arr[i] <= pivot) i++;
//        else if (arr[j] > pivot) j--;
//        else if (arr[i] > pivot && arr[j] < pivot) swap(arr, i, j);
//    }
//    return correctIdx;
//}
//
//void quickSort(int arr[], int low, int high) {
//    if (low >= high) return;
//    int idx = partition(arr, low, high);
//    quickSort(arr, low, idx - 1);
//    quickSort(arr, idx + 1, high);
//}
//
//int main() {
//    int arr[] = {80, 30, 50, 20, 60, 10, 70, 40};
//    int n = sizeof(arr) / sizeof(arr[0]);
//    print(arr, n);
//    quickSort(arr, 0, n - 1);
//    print(arr, n);
//    return 0;
//}
//


//
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[]arr){
//        int n = arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void merge(int[]a, int[] b, int[]c ){
//        int i = 0, j = 0, k = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]<=b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        // Copy remaining elements from array a
//        while(i<a.length) c[k++] = a[i++];
//        // Copy remaining elements from array b
//        while(j<b.length) c[k++] = b[j++];
//    }
//
//    public static void mergeSort(int[] arr){
//        int n = arr.length;
//        if(n==1) return;
//        int[] a = new int[n/2];
//        int[] b = new int[n-n/2];
//        for(int i=0;i<n/2;i++){
//            a[i] = arr[i];
//
//        }
//        for(int i=0;i<n - n/2;i++){
//            b[i] = arr[i+n/2];
//
//        }
//        mergeSort(a);
//        mergeSort(b);
//        merge(a,b,arr);
//    }
//    public static void main(String[] args){
//        int[] arr  = {3,2,9,6,0,5,56,78,54,4,44};
//        print(arr);
//        mergeSort(arr);
//        print(arr);
//    }
//}




//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static int partition(int[] arr, int low, int high) {
//        int pivot = arr[low], pIdx = low;
//        int smallerCount = 0;
//        for (int i = low + 1; i <= high; i++) {
//            if (arr[i] <= pivot)
//                smallerCount++;
//        }
//            int correctIdx = pIdx + smallerCount;
//            swap(arr, pIdx, correctIdx);
//        int i =low, j= high;
//        while(i<=correctIdx&&j>correctIdx){
//            if(arr[i]<=correctIdx) i++;
//            else if(arr[j]>correctIdx)j--;
//            else if(arr[i]>pivot && arr[j]<=pivot) swap(arr,i,j);
//        }
//        return correctIdx;
//    }
//
//    public static void QuickSort(int[] arr, int low, int high){
//        if(low>=high) return;
//
//        int idx = partition(arr,low, high);
//        QuickSort(arr,low,idx-1);
//        QuickSort(arr,idx+1,high);
//
//    }
//    public static void main(String[] args){
//
//    }
//}







//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void print(int[] arr){
//        for(int ele:arr){
//            System.out.println(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void merge(int[] a, int[]b, int[]c){
//        int i = 0, j = 0, k = 0;
//        while(i<a.length&&j<b.length){
//            if(a[i]<=b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        while(j<b.length){
//            c[k++] = b[j++];
//        }
//        while(i<a.length){
//            c[k++] = a[i++];
//        }
//    }
//    public static void mergeSort(int[] arr){
//     int n = arr.length;
//     if(n==1) return;
//     int[] a = new int[n/2];
//     int[] b = new int[n-n/2];
//     for(int i=0;i<n/2;i++){
//         a[i] = arr[i];
//     }
//     for(int i = 0;i<n-n/2;i++){
//         b[i] = arr[i+n/2];
//     }
//     mergeSort(a);
//     mergeSort(b);
//     merge(a,b,arr);
//    }
//
//    public static void main(String[] args){
//        int[] arr ={3,8,0,32,11,76,20,55,6};
//        print(arr);
//        mergeSort(arr);
//        print(arr);
//    }
//}


//package Sorting;
//import java.util.*;
//
//public class sort_01 {
//
//    public static int binarySearch(int[] arr, int target) {
//        int n = arr.length;
//        int low = 0, high = n - 1;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;  // Corrected position of mid calculation inside the loop
//            if (arr[mid] == target) {
//                return mid;  // Return the index of the target instead of the value
//            } else if (arr[mid] > target) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return -1;  // Return -1 if the target is not found
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 6, 8, 9, 12, 56, 78, 90, 99};
//        int target = 12;
//
//        int result = binarySearch(arr, target);
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }
//}



// bucket sort Implementation
//package Sorting;
//import java.util.*;
//public class sort_01 {
//    public static void bucketSort(float[] arr){
//        int n = arr.length;
//        // buckets
//        ArrayList<Float>[] buckets = new ArrayList[n];
//
//        // create empty buckets
//        for(int i=0;i<n;i++){
//            buckets[i] = new ArrayList<Float>();
//        }
//
//        // Add elements into the buckets
//        for(int i=0;i<n;i++){
//            int bucketIndex =(int) arr[i] * n;
//            buckets[bucketIndex].add(arr[i]);
//        }
//        // sort the each bucket individually
//        for(int i=0;i<buckets.length;i++){
//            Collections.sort(buckets[i]);
//        }
//
//        // merga  all bucket to get final sorted array;
//        int index = 0;
//        for(int i=0;i<buckets.length;i++){
//            ArrayList<Float> currBucket = buckets[i];
//            for(int j=0;j<currBucket.size();j++) {
//                arr[index++]  = currBucket.get(j);
//            }
//        }
//    }
//    public static void main(String[] args){
//        float[] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
//        bucketSort(arr);
//        for(float val: arr){
//            System.out.print(val+" ");
//        }
//        System.out.println();
//    }
//}
//

