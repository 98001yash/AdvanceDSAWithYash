//package Graphs;
//   number of provinces graphs
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class graphs_01 {
//    public static int findCircleNum(int[][] adj){
//        int n = adj.length;
//        int count = 0;
//        boolean[] vis = new boolean[n];
//        for(int i=0;i<n;i++){
//            if(!vis[i]){
//                Bfs(i,vis,adj);
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static void Bfs(int i, boolean[] vis, int[][] adj) {
//        int n = adj.length;
//        vis[i] = true;
//        Queue<Integer> q = new LinkedList<>();
//        q.add(i);
//        while(q.size()>0){
//            int front = q.remove();
//            for(int j=0;j<n;j++){
//                 if(adj[front][j]==1 && vis[j]==false){
//                     q.add(j);
//                     vis[j] = true;
//                 }
//            }
//        }
//    }
//
//    public static void main(String[] args){
//
//    }
//}



// rooms and keys  problems
//
//package Graphs;
//import java.util.*;
//public class graphs_01 {
//    public boolean canVisitAllRooms(List<List<Integer>> adj){
//        int n = adj.size();
//        boolean[] visited = new boolean[n];
//        visited[0] = true;
//
//        Bfs(0,adj,visited);
//
//        for(boolean ele: visited){
//            if(ele==false) return false;
//        }
//        return true;
//    }
//
//    private void Bfs(int i, List<List<Integer>> adj, boolean[] visited) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(i);
//        while(q.size()>0){
//            int front = q.remove();
//            for(int ele: adj.get(front)){
//                if(!visited[ele]){
//                    visited[ele] = true;
//                    q.add(ele);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args){
//
//    }
//}






// Find number of paths id exists
//
//package Graphs;
//import java.util.*;
//public class graphs_01 {
//    public boolean validPath(int n, int[][] edges, int start , int end){
//        if(start==end) return true;
//        List<List<Integer>> adj =new ArrayList<>();
//        for(int i=0;i<n;i++){
//            List<Integer> list = new ArrayList<>();
//            adj.add(list);
//        }
//      for(int i=0;i<edges.length;i++){
//          int a = edges[i][0],b = edges[i][1];
//          adj.get(a).add(b);
//          adj.get(b).add(a);
//      }
//        boolean[] vis = new boolean[n];
//      vis[start] = true;
//      Bfs(start,adj,vis,end);
//      return vis[end];
//    }
//
//    private void Bfs(int start, List<List<Integer>> adj, boolean[] vis, int end) {
//        Queue<Integer> q =new LinkedList<>();
//        q.add(start);
//        while(q.size()>0){
//            int front = q.remove();
//            for(int ele:adj.get(front)){
//
//                if(!vis[ele]){
//                    q.add(ele);
//                    vis[ele] = true;
//                    if(ele==end) return;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args){
//
//    }
//}




// Number of Islands problem
//package Graphs;
//import java.util.*;
//public class graphs_01 {
//    public int numIslands(char[][] grid){
//        int m = grid.length;
//        int n = grid[0].length;
//        int count = 0;
//        boolean[][] visited = new boolean[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(grid[i][j]=='1' && visited[i][j] == false){
//                    Bfs(i,j,grid,visited);
//                    count++;
//                }
//            }
//        }
//        return count;
//
//    }
//    class Pair {
//        int row;
//        int col;
//        Pair(int row, int col){
//            this.row = row;
//            this.col = col;
//
//        }
//    }
//
//    private void Bfs(int i,int j, char[][] grid, boolean[][] visited) {
//        int m = grid.length;
//        int n = grid[0].length;
//        Queue<Pair> q = new LinkedList<>();
//        q.add(new Pair(i,j));
//        while(q.size()>0){
//            Pair front = q.remove();
//            int row = front.row, col = front.col;
//            // top =  row-1,col
//            if(row>0){
//                if(visited[row-1][col]==false&& grid[row-1][col]=='1'){
//                    q.add(new Pair(row-1,col));
//                    visited[row-1][col]=true;
//                }
//            }
//
//            // bottom =  row+1,col
//            if(row+1<m) {
//                if (visited[row + 1][col] == false && grid[row + 1][col] == '1') {
//                    q.add(new Pair(row + 1, col));
//                    visited[row + 1][col] = true;
//                }
//            }
//
//            // left =  row,col-1
//            if(col>0) {
//                if (visited[row][col-1] == false && grid[row][col-1] == '1') {
//                    q.add(new Pair(row, col-1));
//                    visited[row][col-1] = true;
//                }
//            }
//
//            // right =  row,col+1
//            if(col+1<n) {
//                if (visited[row][col+1] == false && grid[row][col+1] == '1') {
//                    q.add(new Pair(row, col+1));
//                    visited[row][col+1] = true;
//                }
//            }
//
//
//        }
//    }
//
//    public static void main(String[] args){
//
//    }
//}



// number of provinces


// number of provinces
//package Graphs;
//import java.util.*;
//public class graphs_01 {
//
//    public static int findCircleNum(int[][] adj){
//        int n = adj.length;
//        int m = adj[0].length;
//
//
//        boolean[] isVisited = new boolean[n];
//        for
//    }
//    public static void main(String[] args){
//
//    }
//}

