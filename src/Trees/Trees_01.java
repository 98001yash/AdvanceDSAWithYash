package Trees;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class Trees_01 {
    public static void print(Node  root){
        if(root==null) return;
        System.out.println(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void InOrder(Node root){
        if(root==null) return;
       InOrder(root.left);
        System.out.println(root.data+" ");
        InOrder(root.right);
    }
    public static void PostOrder(Node root){
        if(root==null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data+" ");
    }
    public static int max(Node root){
        if(root==null) return 0;
        int x = max(root.left);
        int y = max(root.right);
        int z = Math.max(x,y);
        return Math.max(z,root.data);
    }
    public static int count(Node root){
        if(root==null) return 0;
        int x = count(root.left);
        int y = count(root.right);
        return 1 + x + y;
    }
    public static int levels(Node root){
        if(root==null) return 0;
        int x = levels(root.left);
        int y = levels(root.right);
        int z = Math.max(x,y);
        return 1 + z;
    }
    public static void invert(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        Node temp  = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    // level Order Traversal using Queue
    static int n;
    public static void levelOrderTraversal(Node root){
        Queue<Node> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.println(front.data+" ");
           if(front.left!=null) q.add(front.left);
           if(front.right!=null) q.add(front.right);
        }
    }
    public static void nthLevel(Node root,int level){
        if(root==null) return;
        if(level==n) System.out.println(root.data+" ");
        nthLevel(root.left,level+1);
        nthLevel(root.right,level+1);
    }
    
    public static void main(String[] args){

    }
}
