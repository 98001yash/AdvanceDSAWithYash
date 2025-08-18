//package chauhan;
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println("the size of the stack is:"+st.size());
//
//    }
//}




// to take the stack input from the users
//package chauhan;
//import java.util.Scanner;
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//        System.out.println("enter the size of the stacks");
//        int n = sc.nextInt();
//        System.out.println("enter the all the elements of the stack");
//        for(int i=1;i<=n;i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
//    }
//}



//package chauhan;
// to reverse the stack and create the copy of the stacks
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//        Stack<Integer> gt = new Stack<>();
//        while(rt.size()>0){
//            gt.push(rt.pop());
//        }
//        System.out.println(gt);
//    }
//}




 // to insert the elements in the stack at any index
import java.util.Stack;
public class stacks_01 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}


// array implementation of the stack




//public class stacks_01 {
//    public static class Stack {
//        int[] arr = new int[5];
//        private int idx = 0;
//        void push(int x){
//          arr[idx] =x;
//          idx++;
//        }
//        int peek(){
//            if(idx==0){
//                System.out.println("stack is empty");
//                return -1;
//            }
//            return arr[idx-1];
//        }
//        int pop(){
//            if(idx==0){
//                System.out.println("stack is empty");
//                return -1;
//            }
//            int top = arr[idx-1];
//            arr[idx-1] = 0;
//            idx--;
//            return top;
//        }
//        void display(){
//            for(int i =0;i<=idx-1;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
//        int size(){
//           return idx;
//        }
//        boolean isEmpty(){
//            if(size()==0) return true;
//            else return false;
//        }
//        boolean isFull(){
//            if(idx==arr.length) return true;
//            else return false;
//        }
//    }
//    public static void main(String[] args) {
//        Stack st = new Stack();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        System.out.println(st.peek());
//        st.display();
//
//        System.out.println(st.size());
//        st.pop();
//        st.display();
//
//    }
//}





// linkedlist implementation using stacks


//package chauhan;
//public class stacks_01 {
//    public static class Node {
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    public static class LLStack {
//      Node head = null;
//      int size = 0;
//      void push(int x){
//          Node temp = new Node(x);
//          temp.next =  head;
//          head = temp;
//          size++;
//      }
//      int pop(){
//          if(head==null){
//              System.out.println("stack is empty");
//              return -1;
//          }
//          int x = head.data;
//          head = head.next;
//          return x;
//      }
//      int peek(){
//          if(head==null){
//              System.out.println("stack is empty");
//              return -1;
//          }
//          return head.data;
//      }
//      void displayRec(Node head){
//          if(head==null) return;
//          displayRec(head.next);
//          System.out.print(head.data);
//      }
//      void display(){
//          displayRec(head);
//          System.out.println();
//      }
//      void displayrev(){
//          Node temp = head;
//          while(temp!=null){
//              System.out.print(temp.data+" ");
//              temp = temp.next;
//          }
//          System.out.println();
//      }
//      int size(){
//          return size;
//      }
//
//    }
//    public static void main(String[] args){
//        LLStack st = new LLStack();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(5);
//        st.push(9);
//        System.out.println(st.peek());
//        st.display();
//
//        System.out.println(st.size());
//        st.pop();
//        st.display();
//    }
//}
//
//
//




//
//package chauhan;
//    to check the bracket is balanced or not
//import java.util.Scanner;
//import java.util.Stack;
//public class stacks_01 {
//    public static boolean  isBalanced(String str){
//        Stack<Character> st = new Stack<>();
//        int n = str.length();
//        for(int i=0;i<n;i++){
//            char ch = str.charAt(i);
//            if(ch=='('){
//                st.push(ch);
//            }
//            else {
//                if(st.size()==0) return false;
//                if(st.peek()=='(') st.pop();
//            }
//        }
//        if(st.size()>0) return false;
//        else return true;
//    }
//    public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//String str = sc.nextLine();
//        System.out.println(str);
//        System.out.println(isBalanced(str));
//    }
//}
//





//
//package chauhan;
// remove the consecutive sequences of the array
//import java.util.Stack;
//public class stacks_01 {
//    static int[]  remove(int[] arr){
//        int n = arr.length;
//        Stack<Integer> st = new Stack<>();
//        for(int i=0;i<n;i++){
//            if(st.size()==0||st.peek()!=arr[i])
//                st.push(arr[i]);
//           else if(arr[i]==st.peek()){
//               if(i==n-1|| arr[i]!=arr[i+1]) st.pop();
//           }
//        }
//        int[] res = new int[st.size()];
//        int x = res.length;
//        for(int i = x-1;i>=0;i--){
//            res[i] = st.pop();
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,2,3,10,10,10,4,4,5,7,7,2};
//        int[] res = remove(arr);
//        for(int i=0;i<res.length;i++){
//            System.out.print(res[i]+" ");
//        }
//    }
//}



//
//package chauhan;
// 1st approach
// finding the next greatest elements in the array
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,1,8,6,3,4};
//        int n = arr.length;
//        int[] res = new int[n];
//        for(int i=0;i<n;i++){
//            res[i] = -1;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]>arr[i]){
//                    res[i] = arr[j];
//                    break;
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<n;i++){
//            System.out.print(res[i]+" ");
//        }
//    }
//}
//
//
//





//
//package chauhan;
//import java.util.Scanner;
//import java.util.Stack;
//public class stacks_01 {
//    public static int[] nextgreatest(int[] arr){
//        int n = arr.length;
//        int[] res = new int[n];
//        Stack<Integer> st = new Stack<>();
//        st.push(arr[n-1]);
//        for(int i = n-1;i>=0;i--){
//            while(st.size()>0&&st.peek()<arr[i]) {
//                st.pop();
//            }
//                if(st.size()==0) res[i] = -1;
//                else res[i] = st.peek();
//                st.push(arr[i]);
//            }
//        return res;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,1,8,6,3,4};
//        int n=arr.length;
//        nextgreatest(arr);
//        for(int i=0;i<n;i++){
//            System.out.print(nextgreatest(arr);
//        }
//        System.out.println();
//    }
//}
//
//




//package chauhan;
// brute force approach
// finding the previous greatest elements
//import java.util.Scanner;
//public class stacks_01 {
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
//        int n = arr.length;
//        int[] res = new int[n];
//        for (int i = 0; i < n; i++) {
//            res[i] = -1;
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[i] < arr[j]) {
//                    res[i] = arr[j];
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(res[i]+" ");
//        }
//    }
//}




//package chauhan;
// fiding the previous greatest elements with the good T.C
//import java.util.Scanner;
//import java.util.Stack;
//public class stacks_01 {
//    public static void  prevGreater(int[] arr, int n){
//        Stack<Integer> st = new Stack<>();
//
//        st.push(arr[0]);
//        System.out.print("-1 ");
//        for(int i=1;i<n;i++){
//            while(!st.isEmpty()&&st.peek()<=arr[i]){
//                st.pop();
//            }
//            if(st.isEmpty())
//                System.out.print("-1 ");
//            else System.out.print(st.peek()+" ");
//            st.push(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {10,4,5,20,40,12,30};
//        int n = arr.length;
//        prevGreater(arr,n);
//    }
//}



//
//package chauhan;
// question based on the stock span
// brute force approach
//import java.util.Scanner;
//public class stacks_01 {
//    static void printarray(int[] arr){
//        int n = arr.length;
//        for(int x :arr){
//            System.out.print(x+" ");
//        }
//    }
//    static void CalculateSpan(int[] price, int n, int[] s){
//        s[0] =1;
//        for(int i=0;i<n;i++){
//            s[i] = 1;
//            for(int j=i-1;j>=0&&price[i]>=price[j];j--){
//                s[i]++;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] price  = {10,4,5,90,120,80};
//        int n = price.length;
//        int[] s = new int[n];
//        CalculateSpan(price,n,s);
//        printarray(s);
//    }
//}



//
//package chauhan;
//import java.util.Stack;
//import java.util.Scanner;
//public class stacks_01 {
//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> min = new Stack<>();
//    public class MinStack {
//        // constructor
//    }
//    public  void push(int val) {
//      if(st.size()==0){
//          st.push(val);
//          min.push(val);
//      }
//      else {
//          st.push(val);
//          if(min.peek()<val) min.push(min.peek());
//          else min.push(val);
//      }
//    }
//    public  void pop(){
//    st.pop();
//    min.pop();
//
//    }
//    public  int top() {
//    return st.peek();
//    }
//    public  int getMin() {
//          return min.peek();
//    }
//    public static void main(String[] args) {
//
//    }
//}



//
//package chauhan;
// code for the prefix operations in the java
// brute force approach to solve the question in the java
//import java.util.Scanner;
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        String str = "9-5*4/6";
//        Stack<Integer> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//      for(int i=0;i<str.length();i++){
//          char ch = str.charAt(i);
//          int ascii = (int)ch;
//          //0 = 48 , 9 = 57
//          if(ascii>=48&&ascii<=57){
//              val.push(ascii - 48);
//          }
//      }
//    }
//}





// to reverse the given stack
//package chauhan;
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//            System.out.println(rt);
//        }
//        System.out.println(rt);
//    }
//}



//package chauhan;
// to insert the elements at any position in the stack
//import java.util.Stack;
//public class stacks_01 {
//    public static void main(String[] args) {
//        Stack<Integer>  st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//
//        Stack<Integer> rt = new Stack<>();
//        int pos = 3;
//        int x = 8;
//        while(st.size()>=1){
//            rt.push(st.pop());
//        }
//        st.push(x);
//        while(rt.size()>0){
//            st.push(rt.pop());
//        }
//        System.out.println(st);
//    }
//}




//package chauhan;
// to display the stack in the reverse order using recursion
//import java.util.Stack;
//public class stacks_01 {
//    static void displayRec(Stack<Integer> st) {
//        if(st.size()==0) return;
//        int top = st.pop();
//        System.out.print(top+" ");
//        displayRec(st);
//        st.push(top);
//    }
//    public static void main(String[] args){
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        displayRec(st);
//
//    }
//}
//







// array implementation using stacks
//package chauhan;
//import java.util.*;
//
//public class stacks_01 {
//    public static class stacks {
//        int[] arr = new int[34];
//        int idx  = 0;
//        void push(int x){
//            if(idx==arr.length-1) {
//                System.out.println("stack is full");
//                return;
//            }
//            arr[idx] = x;
//            idx++;
//        }
//        int peek(){
//            if(idx==0){
//                System.out.println("stack is empty");
//                return 0;
//            }
//            return arr[idx-1];
//        }
//        int pop(){
//            if(idx==0) {
//                System.out.println("stack ie empty");
//                return -1;
//            }
//                int top = arr[idx-1];
//                arr[idx-1] = 0;
//                idx--;
//                return top;
//            }
//            void display(){
//            if(idx==0) {
//                System.out.println("stack is empty");
//                return;
//            }
//            for(int i=0;i<=idx-1;i++){
//                System.out.print(arr[i]+" ");
//            }
//            }
//
//            int size() {
//                if (idx == 0) {
//                    System.out.println("stack is empty");
//                }
//                return idx;
//            }
//        }
//    public static void main(String[] args){
//       stacks st = new stacks();
//        st.push(1);
//        st.push(5);
//        st.push(3);
//        st.push(4);
//        st.push(8);
//        st.display();
//        System.out.println();
//        System.out.println(st.peek());
//        System.out.println();
//        st.pop();
//        System.out.println();
//        st.display();
//        System.out.println();
//        System.out.println(st.size());
//        System.out.println();
//        st.display();
//    }
//}





// implementataion of the linkedlist using stacks


//package chauhan;
//import java.util.Stack;
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class stacks_01 {
//    public static class linkedlist {
//
//        Node head  = null;
//        int size = 0;
//        void push(int x){
//            Node temp = new Node(x);
//            temp.next = head;
//            head  = temp;
//            size++;
//        }
//        int peek(){
//            if(head==null) return -1;
//            return head.data;
//        }
//           int pop(){
//            if(head==null) return -1;
//            int x = head.data;
//            head  = head.next;
//            size--;
//            return x;
//           }
//           int size()
//           {
//               return size;
//           }
//
//           void display()
//           {
//               Node temp = head;
//               while(temp!=null){
//               System.out.print(temp.data + " ");
//               temp = temp.next;
//           }
//               System.out.println();
//           }
//    }
//    public static void main(String[] args) {
//        linkedlist  ll = new linkedlist();
//        ll.push(2);

//        ll.push(6);
//        ll.push(8);
//        ll.push(10);
//        ll.display();
//        System.out.println(ll.peek());
//        System.out.println();
//        ll.pop();
//        ll.display();
//    }
//}










