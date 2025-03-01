//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//   public static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static int sumoftrees(Node root){
//        if(root==null) return 0;
//       int x =  sumoftrees(root.left);
//      int y =   sumoftrees(root.right);
//        return root.data+x+y;
//    }
//    public static void main(String[] args){
//      Node a = new Node(1);
//        Node b = new Node(4);
//        Node c = new Node(3);
//        Node d = new Node(2);
//        Node e = new Node(6);
//        Node f = new Node(5);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.right = f;
//        System.out.println(a.data);
//        System.out.println(a.left.data);
//        System.out.println(b.data);
//        System.out.println(b.right.data);
//        System.out.println(a.left.right.data);
//        display(a);
//        System.out.println();
//    System.out.println("the sum of the elements of the tree is: "+sumoftrees(a));
//    }
//}





//package  chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static int max(Node root){
//        if(root==null) return -1;
//       int x =  max(root.left);
//       int y =  max(root.right);
//       int a =  Math.max(x,y);
//       return Math.max(root.data,a);
//    }
//    public static int count(Node root){
//        if(root==null) return 0;
//        int x = count(root.left);
//        int  y  = count(root.right);
//        return  1 + x + y;
//    }
//    public static int level(Node root){
//        if(root==null) return 0;
//        int x  = level(root.left);
//        int y = level(root.right);
//       int z =  Math.max(x,y);
//        return 1 + z;
//    }
//    public static void main(String[] args){
//        Node a = new Node(1);
//        Node b = new Node(41);
//        Node c = new Node(3);
//        Node d = new Node(32);
//        Node e = new Node(6);
//        Node f = new Node(5);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.right = f;
//        display(a);
//        System.out.println();
//        System.out.println("The maximum element of the trees is: "+ max(a));
//        System.out.println("the number of the Nodes in the trees is: "+count(a));
//        System.out.println("the level of the trees are: "+level(a));
//    }
//}

//








//operations of the traversal in the trees
//preorder
//inorder
//postorder
//package  chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
// public class binary_trees_01 {
//    public static void preorder (Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//    public static void inorder(Node root){
//        if(root==null) return;
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//    public static void postorder(Node root){
//        if(root==null) return;
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.data+" ");
//    }
//    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);
//    }
// }
//


//

// code to invert the binary tree
//package chauhan;
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    static void invert(Node root){
//        if(root==null) return;
//        if(root.left==null&&root.right==null) return;
//        Node temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        invert(root.left);
//        invert(root.right);
//    }
//    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        display(a);
//        System.out.println();
//        invert(a);
//        System.out.println();
//        display(a);
//    }

//}





//package chauhan;
// level order traversal display using queue
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    public static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    static void levelOrderDisplay(Node root){
//        Queue<Node> q = new ArrayDeque<>();
//      if(root!=null)  q.add(root);
//while(q.size()>0){
//    Node front  = q.remove();
//    System.out.print(front.data+" ");
//     if(front.left!=null)q.add(front.left);
//    if(front.right!=null)q.add(front.right);
//}
//    }
//    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        display(a);
//        System.out.println();
//System.out.println("tree after the level order traversal is:");
//        levelOrderDisplay(a);
//        System.out.println();
//        //display(a);
//    }
//}
//
//
//





// finding the elements of the nth  level
// and also printing the all the levels of the tree
//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
// static int n;
//   private  static void  nthlevel(Node root, int level){
//        if(root==null) return;
//       if(level==n) System.out.print(root.data+" ");
//        nthlevel(root.left,level+1);
//        nthlevel(root.right,level+1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        e.left = h; f.right = i;
//        display(a);
//        System.out.println();
////        System.out.println("enter the number");
////        int n = sc.nextInt();
////        nthlevel(a,0);
//
//
//        for(int x=0;x<=3;x++){
//            n = x;
//            nthlevel(a,0);
//            System.out.println();
//        }
//    }
//}
//
//
//
//
//package chauhan;
//import java.util.Scanner;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public  class binary_trees_01 {
//    public static class Pair {
//        Node node;
//        int level;
//        Pair(Node node ,int level){
//            this.node  = node ;
//            this.level = level;
//        }
//    }
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//private static void levelOrder(Node root){
//        int prevLvl = 0;
//        Queue<Pair> q = new ArrayDeque<>();
//        if(root!=null) q.add(new Pair(root,0));
//      while(q.size()>0){
//          Pair front  = q.remove();
//          Node temp   = front.node;
//          int lvl = front.level;
//          if(lvl!=prevLvl){
//              System.out.println();
//              prevLvl++;
//          }
//          System.out.print(temp.data+" ");
//          if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
//          if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
//      }
//    System.out.println();
//}
//    public static void main(String[] args){
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        e.left = h; f.right = i;
//        display(a);
//        System.out.println();
//        levelOrder(a);
//    }
//}



//
// code for the preorder traversal b iterative method
//package chauhan;
//import java.util.*;
// class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static List<Integer> preorder(Node root){
//        List<Integer> ans = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//        if(root!=null) st.push(root);
//        while(st.size()>0){
//            Node top = st.pop();
//            ans.add(top.data);
//            if(top.right!=null) st.push(top.right);
//            if(top.left!=null) st.push(top.left);
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        e.left = h; f.right = i;
//       display(a);
//        System.out.println();
//        System.out.print(preorder(a));
//
//    }
//}






// code for the post order traversal
// to arrange the code in the postorder iteratively
//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    public static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static  List<Integer> postorder(Node root){
//        List<Integer> ans = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//        if(root!=null) st.push(root);
//        while(st.size()>0){
//            Node top = st.pop();
//            ans.add(top.data);
//            if(top.left!=null) st.push(top.left);
//            if(top.right!=null) st.push(top.right);
//        }
//        Collections.reverse(ans);
//        return ans;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        e.left = h; f.right = i;
//        display(a);
//        System.out.println();
//        System.out.println(postorder(a));
//        ;
//    }
//}





// code for the inorder traversal by  iterative method
//
//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static List<Integer> inorder(Node root){
//        List<Integer> ans  = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//        Node temp = root;
//        while(true){
//            if(temp!=null){
//                st.push(temp);
//                temp = temp.left;
//            }
//            else {
//                if(st.size()==0) break;
//                Node top = st.pop();
//                ans.add(top.data);
//                temp =top.right;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args){
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        e.left = h; f.right = i;
//        display(a);
//        System.out.println();
//        System.out.println(inorder(a));
//    }
//}



//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//                                code to dtsplay the elements of the binary trees
//        if(root==null) return;
//        System.out.print(root.data+" ");
//         display(root.left);
//         display(root.right);
//    }
//    static int sum(Node root){
//                                code to find the sum of the elements of the binary trees
//        if(root==null) return 0;
//        int x = sum(root.left);
//        int y = sum(root.right);
//        return root.data+x+y;
//    }
//    static int MaxSum(Node root){
//                                    code  to find the maximum elements of the binary trees
//        if(root==null) return 0;
//        int x = MaxSum(root.left);
//        int y = MaxSum(root.right);
//        int z = Math.max(x,y);
//        return Math.max(root.data,z);
//    }
//    public static void main(String[] args){
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        a.left = b; a.right = c;
//        b.left = d;b.right = e;
//        c.left = f; c.right = g;
//        e.left = h; f.right = i;
//        display(a);
//        System.out.println();
//        System.out.println(MaxSum(a));
//        System.out.println();
//        System.out.println(sum(a));
//    }
//}


//package chauhan;
//import java.util.Scanner;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//
//        this.data = data;
//    }
//}
// public class binary_trees_01 {
//
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//        static int max(Node root){
//        if(root==null) return 0;
//        int x  = max(root.left);
//        int y =max(root.right);
//        int z = Math.max(x,y);
//        return Math.max(root.data,z);
//        }
//        static int levels(Node root){
//        if(root==null) return 0;
//        int x = levels(root.left);
//        int y = levels(root.right);
//        return 1+Math.max(x,y);
//        }
//       static void levelOrder(Node root){
//        Queue<Node> q = new ArrayDeque<>();
//        if(root!=null) q.add(root);
//        while(q.size()>0){
//            Node front  = q.remove();
//            System.out.print(front.data+" ");
//            if(front.left!=null) q.add(front.left);
//            if(front.right!=null) q.add(front.right);
//        }
//        }
//        static void preorder(Node root){
//        if(root==null) return;
//            System.out.print(root.data+" ");
//       preorder(root.left);
//        preorder(root.right);
// }
//        static void inorder(Node root){
//        if(root==null) return;
//        inorder(root.left);
//            System.out.print(root.data+ " ");
//            inorder(root.right);
//        }
//        static void postOrder(Node root){
//        if(root==null) return;
//        postOrder(root.left);
//        postOrder(root.right);
//            System.out.print(root.data+ " ");
//        }
//        static void nthLevel(Node root, int level){
//
//        if(root==null) return;
//        if(level==n) System.out.print(root.data+ " ");
//        nthLevel(root.left,level+1);
//        nthLevel(root.right,level+1);
//        }

//        public int  preorder(Node root){
//        List<Integer> ans = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//       if(root!=null) st.push(root);
//       while(st.size()>0){
//           Node top = st.pop();
//           ans.add(top.data);
//           if(top.right!=null) st.push(top.right);
//           if(top.left!=null) st.push(top.left);
//       }
//       return ans;
//        }
//            public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//                Node a = new Node(23);
//                Node b = new Node(90);
//                Node c = new Node(76);
//                Node d = new Node(45);
//                Node e = new Node(32);
//                Node f = new Node(12);
//                a.left = b;
//                a.right = c;
//                b.left = d;b.right = e;
//                c.left = f;
//                d.right = null;
//                display(a);

//                levelOrder(a);
//                System.out.println();
//                System.out.print("preorder traversal: ");
//                preorder(a);
//                System.out.println();
//                System.out.print("inorder traversal is:");
//                inorder(a);
//                System.out.println();
//                System.out.print("postOrder traversal is: ");
//                postOrder(a);
//                System.out.println();
//               int n = sc.nextInt();
//               nthLevel(a,2);
//display(a);
//           }
//     }



//package chauhan;
//import java.util.Scanner;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static List<Integer> preorder(Node root){
//        List<Integer> ans  = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//        if(root!=null) st.push(root);
//        while(st.size()>0){
//            Node top = st.pop();
//            ans.add(top.data);
//            if(top.right!=null)st.push(top.right);
//           if(top.left!=null) st.push(top.left);
//        }
//        return ans;
//    }
//    public static List<Integer> postorder(Node root){
//        List<Integer> answer = new ArrayList<>();
//        Stack<Node> s = new Stack<>();
//        if(root!=null)s.push(root);
//        while(s.size()>0){
//            Node top = s.pop();
//            answer.add(top.data);
//            if(top.left!=null) s.push(top.left);
//            if(top.right!=null) s.push(top.right);
//        }
//        Collections.reverse(answer);
//        return answer;
//    }
//    public static List<Integer> inorder(Node root){
//        List<Integer> ans = new ArrayList<>();
//        Stack<Node> st = new Stack<>();
//        Node temp = root;
//        while(true){
//            if(temp!=null){
//                st.push(temp);
//                temp = temp.left;
//            }
//            else {
//                if(st.size()==0) break;
//                Node top = st.pop();
//                ans.add(top.data);
//                temp = top.right;
//            }
//        }
//        return ans;
//    }

//    public static int levels(Node root) {
//        if (root == null) return 0;
//        return 1 + Math.max(levels(root.left), levels(root.right));
////    }
//        public static boolean isBalanced(Node root){
//        if(root==null) return true;
//            int diff = Math.abs(levels(root.left)-levels(root.right));
//            if(diff>1) return false;
//            boolean lst = isBalanced(root.left);
//            if(lst==false) return false;
//            boolean rst = isBalanced(root.right);
//            if(rst==false) return false;
//            return true;
//        }
//
//        public static int max(int a, int b, int c){
//
//        return Math.max(a,Math.max(b,c));
//        }
//    public static int levels(Node root) {
//        if (root == null) return 0;
//        return 1 + Math.max(levels(root.left), levels(root.right));
//    }
//        public static  int diameter(Node root ){
//        if(root==null) return 0;
//        int myDia = levels(root.left)+levels(root.right);
//        int leftDia  = levels(root.left);
//        int rightDia = levels(root.right);
//
//        return max(myDia,leftDia,rightDia);
//        }
//    public static void main(String[] args){
//        Node a = new Node(23);
//        Node b = new Node(90);
//        Node c = new Node(76);
//        Node d = new Node(45);
//        Node e = new Node(32);
//        Node f = new Node(12);
//        a.left = b;
//        a.right = c;
//        b.left = d;b.right = e;
//        c.left = f;
//        d.right = null;
//        display(a);
//        System.out.println();
//        System.out.print("preorder traversal using iterative method: ");
//        System.out.println(preorder(a));
//        System.out.println();
//        System.out.print("postorder traversal using iterative method: ");
//        System.out.println(postorder(a));
//        System.out.println();
//        System.out.print("inorder traversal using itearative method: ");
//        System.out.println(inorder(a));
//        System.out.println();
//       // System.out.println(isBalanced(a));
//
//        System.out.println(diameter(a));
//    }
//}






//
//package chauhan;
//import java.util.Scanner;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
// to search the elements in the binary trees
//    public static Node searchBST(Node root, int val){
//        if(root==null) return null;
//        if(root.data<val) return  searchBST(root.right,val);
//        else if(root.data>val) return searchBST(root.left,val);
//        else return root;
//    }
//    public static void main(String[] args){
//        Node a = new Node(23);
//        Node b = new Node(90);
//        Node c = new Node(76);
//        Node d = new Node(45);
//        Node e = new Node(32);
//        Node f = new Node(12);
//        a.left = b;
//        a.right = c;
//        b.left = d;b.right = e;
//        c.left = f;
//        d.right = null;
//        display(a);
//        System.out.println();
//        System.out.println(searchBST(a,32));
//    }
//}




// code to insert the elements in the binary trees
//
//package chauhan;
//import java.util.*;
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//    }
//
//}
//public class binary_trees_01 {
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    public static void insert(Node root, int val){
//        if(val<root.data){
//            if(root.left==null) root.left = new Node(val);
//            else insert(root.left,val);
//        }
//        else {
//            if(root.right==null) root.right = new Node(val);
//            else insert(root.right,val);
//        }
//    }
//    public static Node insertBST(Node root, int val){
//        if(root==null) return new Node(val);
//        insert(root,val);
//        return root;
//    }
//    public static void main(String[] args){
//        Node a = new Node(23);
//        Node b = new Node(90);
//        Node c = new Node(76);
//        Node d = new Node(45);
//        Node e = new Node(32);
//        Node f = new Node(12);
//        a.left = b;
//        a.right = c;
//        b.left = d;b.right = e;
//        c.left = f;
//        d.right = null;
//        System.out.println(insertBST(a,23));
//        display(a);
//    }
//}





//
//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//
//    }
//}
//public class binary_trees_01 {
//    static int k;
//    static void display(Node root){
//        if(root==null) return;
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);
//    }
//    static void inorder(Node root){
//        if(root==null) return;
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//
//    }
//
//
//        public static List<Integer> INORDER(Node root) {
//        k = 3;
//            List<Integer> ans = new ArrayList<>();
//            Stack<Node> st = new Stack<>();
//            Node temp = root;
//            while (true) {
//                if (temp != null) {
//                    st.push(temp);
//                    temp = temp.left;
//                } else {
//                    if (st.size() == 0) break;
//                    Node top = st.pop();
//                    ans.add(top.data);
//                    temp = top.right;
//                }
//
////            for(int i=0;i<=k-1;i++) {
////                System.out.println(ans.get(k-1));
//                int n = ans.get(k - 1);
//
//            }
////            }
//            return ans;
//        }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Node a = new Node(10);
//        Node b = new Node(7);
//        Node c = new Node(14);
//        Node d = new Node(3);
//        Node e = new Node(8);
//        Node f = new Node(11);
//        Node g = new Node(21);
//        a.left = b;
//        a.right = c;
//        b.left = d;
//        b.right = e;
//        c.left = f;
//        c.right = g;
//        g.left = null;
//        display(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        System.out.println(INORDER(a));
//        System.out.println();
//
//
//
//         }
//    }




// to check the the binary search tree is valid or not and return boolean
//
//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data = data;
//
//    }
//
//}
//public class binary_trees_01 {
//    public static void inorder(Node root, List<Integer> arr){
//        if(root==null) return;
//        inorder(root.left,arr);
//        System.out.print(root.data+" ");
//        inorder(root.right,arr);
//    }
//    public static boolean isValidList(Node root){
//        List<Integer> arr = new ArrayList<>();
//        inorder(root,arr);
//        for(int i=1;i<arr.size();i++){
//            if(arr.get(i)<arr.get(i-1)) return false;
//        }
//        System.out.println();
//        return true;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(7);
//        Node c = new Node(14);
//        Node d = new Node(3);
//        Node e = new Node(8);
//        Node f = new Node(11);
//        Node g = new Node(21);
//        a.left = b;
//        a.right = c;
//        b.left = d;
//        b.right = e;
//        c.left = f;
//        c.right = g;
//        g.left = null;
//
//        System.out.println(isValidList(a));
//    }
//}

// finding the diameter of the binary tree

//import java.util.*;
//class Node {
//    Node left;
//    Node right;
//    int data;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class binaryTrees_01 {
//    public int levels(Node root){
//        if(root==null) return 0;
//        int left = levels(root.left);
//        int right = levels(root.right);
//        return 1 + Math.max(left,right);
//    }
//    public int diamter(Node root){
//        if(root==null) return 0;
//        int mydia = levels(root.left)+levels(root.right);
//        int leftDia = diameter(root.left);
//        int rightDia  = diameter(root.right);
//
//        return Math.max(mydia,Math.max(leftDia,rightDia));
//    }
//    public static void main(String[] args){
//
//    }


//}



