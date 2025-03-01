//package BackTracking;
//  permutations
//import java.util.ArrayList;
//import java.util.List;
//
//public class permutations {
//    public void backTrack(List<List<Integer>> result,List<Integer> perm,int[] nums){
//        if(perm.size()==nums.length){
//            result.add(new ArrayList<> (perm));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(perm.contains(nums[i]))
//                continue;
//            perm.add(nums[i]);
//            backTrack(result,perm,nums);
//            perm.remove(perm.size()-1);
//        }
//    }
//    public List<List<Integer>> permute(int[] nums){
//        List<List<Integer>> result = new ArrayList<>();
//        backTrack(result,new ArrayList<>(),nums);
//        return result;
//    }
//    public static void main(String[] args){
//
//    }
//}




//package BackTracking;
// combinations

//
//import java.util.ArrayList;
//import java.util.List;
//
//public class permutations {
//    public void backTrack(List<List<Integer>> result,List<Integer> comb,int start, int n,int k){
//        if(comb.size()==k){
//            result.add(new ArrayList<>(comb));
//            return;
//        }
//        for(int i = start;i<=n;i++){
//            comb.add(i);
//            backTrack(result,comb,i+1,n,k);
//            comb.remove(comb.size()-1);
//        }
//    }
//    public List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> result =new ArrayList<>();
//        backTrack(result,new ArrayList<>(),1,n,k);
//        return result;
//    }
//    public static void main(String[] args){
//
//    }
//}


//package BackTracking;
//    N - queens


//import java.util.ArrayList;
//import java.util.List;
//
//public class permutations {
//
//    public static List<String> makeString(char[][] board){
//        List<String> l = new ArrayList<>();
//        for(int i = 0; i < board.length; i++){
//            String row = new String(board[i]);
//            l.add(row);
//        }
//        return l;
//    }
//
//    public void queen(char[][] board, int row, List<List<String>> ans){
//        if(row == board.length){
//            ans.add(makeString(board));
//            return;
//        }
//
//        for(int col = 0; col < board.length; col++) {
//            if (isSafe(board, row, col)){
//                board[row][col] = 'Q';
//                queen(board, row + 1, ans);
//                board[row][col] = '.';
//            }
//        }
//    }
//
//    public static boolean isSafe(char[][] board, int row, int col){
//        // for checking the vertical row
//        for (int i = 0; i < row; i++) {
//            if (board[i][col] == 'Q') {
//                return false;
//            }
//        }
//        // for checking the left diagonal
//        int maxLeft = Math.min(row, col);
//        for (int i = 1; i <= maxLeft; i++) {
//            if (board[row - i][col - i] == 'Q') {
//                return false;
//            }
//        }
//        // for checking the right diagonal
//        int maxRight = Math.min(row, board.length - 1 - col);
//        for (int i = 1; i <= maxRight; i++) {
//            if (board[row - i][col + i] == 'Q') {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public List<List<String>> solveNQueens(int n){
//        char[][] board = new char[n][n];
//        for(int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = '.';
//            }
//        }
//        List<List<String>> ans = new ArrayList<>();
//        queen(board, 0, ans);
//        return ans;
//    }
//public static void main(String[] args){
//
//
//      }
   //}


//  Rate in the maze problem

//package BackTracking;
//
//import java.util.ArrayList;
//
//public class permutations {
//    public static void solveMaze(ArrayList<String> ans , int r, int c, int[][] m, int n , String p,boolean[][] vis){
//        if(r==n-1 && c==n-1 && m[r][c]!=0){
//            ans.add(p);
//            return;
//        }
//        if(r >=0 &&r<n&&c>=0&&c<n){
//            if(vis[r][c]==true|| m[r][c]==0){
//                return;
//            }
//        }
//        vis[r][c] = true;
//        solveMaze(ans,r+1,c,m,n,p+'D',vis);// down
//        solveMaze(ans,r,c-1,m,n,p+'L',vis); // left
//        solveMaze(ans,r,c+1,m,n,p+'R',vis);// right;
//        solveMaze(ans,r-1,c,m,n,p+'U',vis); // up
//        vis[r][c] = false;
//    }
//
//    public static ArrayList<String> findPath(int[][] m, int n){
//        ArrayList<String> ans = new ArrayList<>();
//        boolean vis[][]  = new boolean[n][n];
//        solveMaze(ans,0,0,m,n,"",vis);
//        return ans;
//
//
//    }
//
//    public static void main(String[] args){
//
//    }
//}




// sudoku solver
//package BackTracking;
//public class permutations {
//    public void solveSudoku(char[][] board){
//        solve(board);
//    }
//    public boolean solve(char[][] board){
//        for(int i=0;i<board.length;i++) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[i][j] == '.') {
//                    for (char c = '1'; c <= '9'; c++) {
//                        if (isValid(board, i, j, c)) {
//                            board[i][j] = c;
//                            if (solve(board)) {
//                                return true;
//                            } else {
//                                board[i][j] = '.';
//                            }
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//            return true;
//        }
//
//
//    public static void main(String[] args){
//
//    }
//}