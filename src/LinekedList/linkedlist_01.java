// copy linkedList with Random Pointer

//package LinekedList;
//import java.util.*;
//class Node{
//    int data;
//    Node next;
//    Node random;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    public static Node deepCopy(Node head){
//        // step 1: create the deep copy without random connections
//        Node head2 =  new Node(head.data);
//        Node t1 = head.next;
//        Node t2 = head2;
//        while(t1!=null){
//            Node temp = new Node(t1.data);
//            t2.next = temp;
//            t2 = t2.next;
//            t1 = t1.next;
//        }
//        return head2;
//    }
//    public static Node copyRandomList(Node head){
//          Node head2 = deepCopy(head);
//    }
//    public static void main(String[] args){
//     TODO The next part
//    }
//}



//                    Doubly linkedlist

//package LinekedList;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//    Node prev;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    // print the linkedlist when the Node is at head
//   public static void print(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    // to print the linkedlist when the node is not head;
//    public static void display(Node node){
//        Node temp = node;
//        while(temp.prev!=null){
//            temp = temp.prev;
//        }
//        while(temp!=null){
//            System.out.println(temp.data +" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void reverse(Node tail){
//        Node temp = tail;
//        while(temp!=null){
//            System.out.println(temp.data+ " ");
//            temp = temp.prev;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args){
//
//    }
//
//}

package LinekedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;

    }
}
public class linkedlist_01 {
    class DLL {
        Node head = null;
        Node tail = null;
        int size = 0;
        void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data+ "");
                temp = temp.next;
            }
            System.out.println();
        }
        void insertAtTail(int val){
            Node temp = new Node(val);
            if(size==0) head = tail = temp;
            else {
                tail.next =  temp;
                temp.prev = tail;  // extra line added in the doubly linkedlist
                tail = temp;
            }
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(size==0) head = tail = temp;
            else {
                temp.next = head;
                head.prev =temp;
                head = temp;
            }
            size++;
        }

        void insert(int idx, int val){
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        if(idx<0 && idx> size){
            throw new RuntimeException("Invalid index....");
        }
        Node temp = new  Node(val);
        Node x = head;
        for(int i=0;i<=idx-1;i++){
            x = x.next;
        }
        Node y = x.next;
        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;
        size++;
        }

        void deleteAtHead(){
            if(head ==null) return;
            else{
                head = head.next;
                head.prev = null;
            }
            size--;
        }

        void deleteAtTail(){
            if(head==null) return;
            else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        void delete( int idx){
            if(head==null) return;
            Node temp = head;
            for(int i=0;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = temp.next;
            temp.prev = temp.prev.prev;
            size--;
        }
    }

    public static void main(String[] args){
    }

}



//
//package LinekedList;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//    Node prev;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    // orint the element of the linkedlist
//    public static void print(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    // Print the element  in the reverse order
//    public static void printReverse(Node tail){
//        Node temp = tail;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.prev;
//        }
//        System.out.println();
//    }
//
//    public static void printRandom(Node node){
//        Node temp = node;
//        while(temp.prev!=null){
//            temp = temp.prev;
//        }
//        print(temp);
//    }
//    public static void main(String[] args){
//     Node a = new Node(12);
//     Node b =  new Node(24);
//     Node c = new Node(36);
//     Node d = new Node(48);
//     a.next = b;   b.prev = a;
//     b.next = c;   c.prev = b;
//     c.next = d;   d.prev = c;
//     print(a);
//     printReverse(d);
//     printRandom(c);
//    }
//}



//package LinekedList;
//import java.util.*;
//class Node{
//    int data;
//    Node next;
//    Node prev;
//    Node(int data){
//        this.data = data;
//    }
//}
//class DLL {
//    Node head = null;
//    Node tail = null;
//    int size = 0;
//    void display(){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//
//    }
//














//    void insertAtTail(int val){
//       Node temp = new Node(val);
//       if(size==0) head = tail = temp;
//       else{
//           tail.next = temp;
//           temp.prev = tail;  // extra line
//           tail = temp;
//       }
//       size++;
//    }
//    void insertAtHead(int val){
//        Node temp = new Node(val);
//        if(size==0) head = tail = temp;
//        else {
//            temp.next = head;
//            head.prev = temp;
//            head = temp;
//        }
//        size++;
//    }
//    void insert(int idx, int val) {
//        if (idx == 0) {
//            insertAtHead(val);
//            return;
//        }
//        if (idx == size) {
//            insertAtTail(val);
//            return;
//        }
//        if (idx > size || idx < 0) {
//            System.out.println("invalid index");
//            return;
//        }
//        Node temp = new Node(val);
//        Node x = head;
//        for (int i = 1; i <= idx - 1; i++) {
//            x = x.next;
//        }
//        Node y = x.next;
//        x.next = temp;
//        temp.prev = x;
//        y.prev = temp;
//        temp.next = y;
//        size++;
//    }
//    void deleteAtHead(){
//
//        if(size==0) return;
//        else {
//            head = head.next;
//            head.prev = null;
//        }
//        size--;
//    }
//    void deleteAtTail(){
//        if(size==0) return;
//        else {
//            tail = tail.prev;
//            tail.next = null;
//        }
//        size--;
//    }
//
//    void delete(int idx){
//        if(head==null){
//            System.out.println("list is empty");
//        }
//        if(idx<0||idx>=size){
//            System.out.println("invalid index");
//        }
//        Node temp = head;
//        for(int i=1;i<=idx-1;i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        temp = temp.next;
//        temp.prev = temp.prev.prev;
//        size--;
//    }
//
//}
//public class linkedlist_01 {
//
//    public static void main(String[] args){
//    DLL list = new DLL();
//         list.display();
//        list.insertAtTail(10);
//        list.insertAtTail(34);
//        list.insertAtTail(56);
//        list.insertAtTail(76);
//        list.insertAtTail(32);
//        list.display();
//        list.insertAtTail(90);
//        list.display();
//        list.insertAtHead(60);
//        list.display();
//        list.insert(2,20);
//        list.display();
//        list.deleteAtHead();
//        list.display();
//        list.deleteAtTail();
//        list.display();
//        list.delete(2);
//        list.display();
//    }
//}



    // Assignment Questions


//package LinekedList;
//import java.util.*;
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01{
//    static void traverse(Node head){
//        while(head!=null && head.next!=null){
//            System.out.print(head.data+" ");
//            head = head.next.next;
//        }
//    }
//    public static void main(String[] args){
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        a.next = b;
//        b.next =c;
//        c.next = d;      output = 1 3
//        d.next = e;
//        traverse(a);
//
//    }
//}


//package LinekedList;  code to take the 2 d input from the user
//import java.util.*;
//public class linkedlist_01 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of rows: ");
//        int n = sc.nextInt();
//        System.out.println("enter the number of columm: ");
//        int m = sc.nextInt();
//        System.out.println("Enter the all the elements of the array: ");
//        int[][] arr = new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}




// to print the spiral of the matrix
//package LinekedList;
//import java.util.*;
//public class linkedlist_01 {
//    public static void print(int[][] arr){
//        int n = arr.length; int m = arr[0].length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.println(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
//        int m = arr.length, n = arr[0].length;
//        int minr = 0, maxr = m-1, minc = 0,maxc = n-1;
//
//        while(minr<=maxr &&minc<= maxc){
//            // from left to right
//            for(int j = minc;j<=maxc;j++){
//                System.out.print(arr[minr][j]+" ");
//            }  minr++;
//
//            // top to bottom
//            for(int i = minr;i<maxr;i++){
//                System.out.print(arr[i][maxc]+" ");
//            }maxc--;
//
//
//            // right to left
//            for(int j = maxc;j>=minc;j--){
//                System.out.print(arr[maxr][j]+" ");
//            } maxr--;
//
//
//            // bottom to top
//            for(int i =maxr;i>=minr;i--){
//                System.out.print(arr[i][minc]+" ");
//            }
//            minc++;
//        }
//        System.out.println();
//    }
//}