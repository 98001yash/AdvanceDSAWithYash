//package Graphs;
//   number pf provinces solving through DFS
//public class graphs_02 {
//    public int findCircleNum(int[][] adj){
//        int n = adj.length;
//        int count = 0;
//        boolean[] vis = new boolean[n];
//        for(int i=0;i<n;i++){
//            if(!vis[i]){
//              Dfs(i,vis,adj);
//              count++;
//            }
//        }
//        return count;
//    }
//
//    public  void Dfs(int i, boolean[] vis,int[][] adj){
//        int n = adj.length;
//        vis[i] = true;
//        for(int j=0;j<n;j++){
//            if(adj[i][j]==1&& vis[j]==false){
//                Dfs(j,vis,adj);
//            }
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}



// number of islands using DFS algorithm
//package Graphs;
//import java.util.*;
//public class graphs_02 {
//      public int numIslands(char[][] grid){
//        int m = grid.length;
//        int n = grid[0].length;
//        int count = 0;
//        boolean[][] visited = new boolean[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(grid[i][j]=='1' && visited[i][j] == false){
//                    Dfs(i,j,grid,visited);
//                    count++;
//                }
//            }
//        }
//        return count;
//
//    }
//    private void Dfs(int i,int j, char[][] grid, boolean[][] visited){
//          int m = grid.length, n = grid[0].length;
//        visited[i][j] = true;
//         if(i-1>=0&& grid[i-1][j]=='1' && visited[i-1][j]==false)
//             Dfs(i-1,j,grid,visited);
//
//        if(i+1>=n-1&& grid[i-1][j]=='1' && visited[i+1][j]==false)
//          Dfs(i+1,j,grid,visited);
//
//        if(j-1>=0&& grid[i-1][j]=='1' && visited[i][j-1]==false)
//          Dfs(i,j-1,grid,visited);
//
//        if(j+1>=n-1&& grid[i][j+1]=='1' && visited[i][j+1]==false)
//          Dfs(i,j+1,grid,visited);
//      }
//
//    public static void main(String[] args){
//
//    }
//}


// code for the quick sort to arrange the code in the ascending order

//package Graphs;
//import java.util.*;
//public class graphs_02 {
//    public static void print(int[] arr){
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i]= arr[j];
//        arr[j] = temp;
//
//    }
//    public static int partition(int[] arr, int low , int high){
//        int pivot = arr[low],pIdx = low;
//        int smallerCount = 0;
//        for(int i=low+1;i<=high;i++){
//            if(arr[i]<=pivot) smallerCount++;
//        }
//        int correctIdx = low+smallerCount;
//        swap(arr,pIdx,correctIdx);
//        int i = low, j = high;
//        while(i<=correctIdx &&j>correctIdx){
//            if(arr[i]<=pivot) i++;
//            else if(arr[j]>pivot)j--;
//            else {
//                if(arr[i]>pivot &&arr[j]<=pivot){
//                    swap(arr,i,j);
//                }
//            }
//        }
//        return correctIdx;
//
//
//    }
//    public static void main(String[] args){
//
//    }
//
//}


// code for the quick sort
//package Graphs;
//import java.util.*;
//public class graphs_02 {
//    public static void print(int[] arr){
//        int n = arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int[]arr, int i, int j){
//        int temp  =arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
//
//    public static int partition(int[] arr, int low, int high){
//        int pivot = arr[low], pIdx = low;
//        int smallerCount = 0;
//        for(int i=low+1;i<=high;i++) {
//            if (arr[i] <= pivot) smallerCount++;
//        }
//            int correctIdx = low + smallerCount;
//
//            swap(arr,pIdx,correctIdx);
//            int i = low, j = high;
//            while(low<=high){
//                if(arr[i]<=pivot) i++;
//                else if(arr[i]>pivot)j--;
//                else if(arr[i]>pivot &&arr[j]<=pivot)
//                    swap(arr,i,j);
//            }
//            return correctIdx;
//
//    }
//
//    public static void quickSort(int[] arr, int low, int high){
//        if(low>=high) return;
//        int idx = partition(arr,low,high);
//        quickSort(arr,low,idx-1);
//        quickSort(arr,idx+1,high);
//    }
//    public static void main(String[] args){
//
//    }
//}



// solving th room and key problem with the help of DFS
//package Graphs;
//import java.util.*;
//public class graphs_02 {
//    public static boolean canVisitAllRooms(List<List<Integer>> adj){
//        int n = adj.size();
//        boolean[] visited = new boolean[n];
//        visited[0] = true;
//        Dfs(0,adj,visited);
//        for(boolean ele: visited){
//            if(ele==false) return false;
//        }
//        return true;
//    }
//    public static void Dfs(int start,List<List<Integer>> adj,boolean[] visited){
//        visited[0] = true;
//        for(int ele: adj.get(start)){
//            if(!visited[ele]) Dfs(ele,adj,visited);
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}




//  Is graph bipartite
//package Graphs;
//import java.util.*;
//public class graphs_02  {
//    public boolean isBipartite(int[][] graph) {
//        int n = graph.length;
//        int[] visited = new int[n];
//        Arrays.fill(visited, -1);
//
//        for (int i = 0; i < n; i++) {
//            if (visited[i] == -1) {
//                if (!bfs(i, graph, visited)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public boolean bfs(int i, int[][] graph, int[] visited) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(i);
//        visited[i] = 0; // 0 -> red, 1 -> green
//
//        while (!q.isEmpty()) {
//            int front = q.poll();
//            int color = visited[front];
//
//            for (int ele : graph[front]) {
//                if (visited[ele] == color) {
//                    return false;
//                }
//                if (visited[ele] == -1) {
//                    visited[ele] = 1 - color;
//                    q.add(ele);
//                }
//            }
//        }
//        return true;
//    }
//}
