//package Graphs;
//// DSU
////    code for the  kruskal algorithm
//
//import java.util.PriorityQueue;
//
//public class Graph_03 {
//    public static int[] parent, size;
//    static int leader(int u){
//        if(parent[u]==u) return u;
//        return parent[u] = leader(parent[u]);
//    }
//    static void union(int u, int v){
//        int a = leader(u);
//        int b = leader(v);
//        if(a!=b){
//            if(size[a]>size[b]){
//                parent[b] = a;
//                size[a] += size[b];
//            }else{
//                parent[a] = b;
//                size[b]+=size[a];
//            }
//        }
//    }
//    public static  class Triplet implements Comparable<Triplet>{
//        int u;
//        int v;
//        int dist;
//        Triplet(int u ,int v, int dist){
//            this.u = u;
//            this.v = v;
//            this.dist = dist;
//        }
//
//        @Override
//        public int compareTo(Triplet t) {
//            if(this.dist==t.dist) return  this.u  = t.u;
//            return this.dist - t.dist;
//        }
//    }
//
//    public static int minCostConnections(int[][] points){
//        int n = points.length;
//        parent  = new int[n];
//        size = new int[n];
//        for(int i=0;i<n;i++){
//            parent[i] = i;
//            size[i] = i;
//        }
//        PriorityQueue<Triplet> pq= new PriorityQueue<>();
//        for(int u=0;u<n;u++){
//            for(int v = u+1;v<n;v++){
//                int x1 = points[u][0], y1 = points[u][1];
//                int x2 = points[v][0], y2 = points[v][1];
//                int dist = Math.abs(x1-x2) + Math.abs(y1-y2);
//                pq.add(new Triplet(u,v,dist));
//            }
//        }
//        int cost = 0;
//        while(pq.size()>0){
//            Triplet top = pq.poll();
//            int u = top.u, v = top.v, dist = top.dist;
//            if(leader(u)!=leader(v)) {
//                cost += dist;
//                union(u, v);
//            }
//        }
//        return cost;
//    }
//    public static void main(String[] args){
//
//    }
//
//}
