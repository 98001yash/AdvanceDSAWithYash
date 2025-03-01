//package chauhan;
//
//class Node  {
//    int data;
  //  Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static void displayR(Node head){
//if(head==null) return;
//        System.out.println(head.data+" ");
//        displayR(head.next);
//    }
//public static void main(String[] args) {
//    Node a = new Node(12);
//    Node b = new Node(14);
//    Node c = new Node(23);
//    Node d = new Node(34);
//    Node e = new Node(32);
//    Node f = new Node(60);
//    a.next = b;
//    b.next = c;
//    c.next = d;
//    d.next = e;
//    e.next = f;
//    Node temp = a;
//    while(temp!=null){
//        System.out.print(temp.data+" ");
//        temp = temp.next;
//    }
//    displayR(a);
//}
//}
//
//package chauhan;
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//class SLL {
//    Node head;
//    Node tail;
//    int size;
//
//    void insertAtEnd(int val) {
//        Node temp = new Node(val);
//        if (head == null) {
//            head = temp;
//            tail = temp;
//        } else {
//            tail.next = temp;
//            tail = temp;
//        }
//    }
//
//    void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//
//    int size() {
//        Node temp = head;
//        int count = 0;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//
//    void insertAtHead(int data) {
//        Node temp = new Node(data);
//        if (head == null) {
//            head = temp;
//            tail = temp;
//        } else {
//            temp.next = head;
//            head = temp;
//        }
//    }
//
//    void insert(int idx, int val) {
//        Node temp = new Node(val);
//        if (idx == 0) {
//            insertAtHead(val);
//        }
//        if (idx == size()) {
//            insertAtEnd(val);
//        }
//        if (idx > size()) {
//            System.out.println("invalid index");
//            return;
//        }
//        Node x = head;
//        for (int i = 1; i <= idx - 1; i++) {
//            x = x.next;
//        }
//        temp.next = x.next;
//        x.next = temp;
//    }
//
//    int get(int idx) {
//        if (idx == size() - 1) return tail.data;
//        if (idx >= size() || idx < 0) {
//            System.out.println("invalid index!!");
//            return -1;
//        }
//        Node temp = head;
//        for (int i = 1; i <= idx; i++) {
//            temp = temp.next;
//        }
//        return temp.data;
//    }
//    void deleteAtHead() {
//        if(head==null){
//            System.out.println("list is empty");
//        }
//        head = head.next;
//        size--;
//    }
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
//        size--;
//    }
//}
//public class linkedlist_01 {
//
//    public static void main(String[] args) {
//SLL list = new SLL();
//list.insertAtEnd(12);
//        list.insertAtEnd(32);
//        list.insertAtEnd(11);
//        list.insertAtEnd(9);
//    list.print();
//    list.insertAtHead(1);
//        list.insertAtHead(98);
//        list.insertAtHead(90);
//        System.out.println();
//        list.print();
//        System.out.println();
//        list.insert(2,100);
//        list.insert(4,120);
//        System.out.println();
//        System.out.println(list.get(2));
//        list.print();
//        System.out.println();
//    System.out.println(list.size());
//        System.out.println();
//        list.deleteAtHead();
//        System.out.println();
//        list.delete(4);
//
//        list.print();
//    }
//}
//
//
//
//
//package chauhan;
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp  = temp.next;
//        }
//    }
//    static void deleteNode(Node a){
//       a.data = a.next.data;
//       a.next = a.next.next;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//    Node b = new Node(14);
//    Node c = new Node(23);
//    Node d = new Node(34);
//    Node e = new Node(32);
//    Node f = new Node(60);
//    a.next = b;
//    b.next = c;
//    c.next = d;
//    d.next = e;
//    e.next = f;
//    display(a);
//        System.out.println();
//    deleteNode(b);
//    display(a);
//    }
//}
////
//
//
//
//
//package chauhan;
//import java.util.Scanner;
// class Node {
//  int data;
//  Node next;
//  Node(int data){
//      this.data = data;
//  }
//}
//public class linkedlist_01 {
//     static Node  middleE(Node head){
//         Node temp = head;
//         int length = 0;
//         while(temp!=null){
//             temp = temp.next;
//             length++;
//         }
//         int mid = length/2 + 1;
//         temp = head;
//         for(int i=0;i<=mid-1;i++){
//             temp = temp.next;
//         }
//         return temp;
//     }


//static void display(Node head){
//    Node temp = head;
//    while(temp!=null){
//        System.out.print(temp.data+" ");
//        temp = temp.next;
//    }
//    System.out.println();
//}
//    static Node middleE(Node head){
//        Node slow = head;
//        Node fast = head;
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    public static void main(String[] args) {
//      Node a = new Node(12);
//    Node b = new Node(14);
//    Node c = new Node(23);
//    Node d = new Node(34);
//    Node e = n ew Node(32);
//    Node f = new Node(60);
//    a.next = b;
//    b.next = c;
//    c.next = d;
//    d.next = e;
//    e.next = f;
//        System.out.println(middleE(a).data);
//        display(a);
//
//        display(a);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//public class linkedlist_01 {
//    static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//package chauhan;
//import java.util.Scanner;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}

//    static boolean hasCycle(Node head) {
//        Node slow = head;
//        Node fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (fast == slow) return true;
//        }
////        return false;
//    }
//    static Node  findingnthnode(Node head, int n){
//        Node slow = head;
//        Node fast = head;
//        for(int i=1;i<=n;i++){
//            fast = fast.next;
//        }
//        while(fast!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//    static void  deletenthnodefromEnd(Node head, int n ){
//        Node slow = head;
//        Node fast = head;
//        for(int i=1;i<=n;i++){
//            fast = fast.next;
//        }
//        while(fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        slow.next = slow.next.next;
//
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//    Node b = new Node(14);
//    Node c = new Node(23);
//    Node d = new Node(34);
//    Node e = new Node(32);
//    Node f = new Node(60);
//    a.next = b;
//    b.next = c;
//    c.next = d;
//    d.next = e;
//    e.next = f;
//    display(a);
//        System.out.println(findingnthnode(a,3).data);
//        deletenthnodefromEnd(a,3);
//        System.out.println(hasCycle(a));
//    display(a);
//    }
//}
//
//
//
//
//
//
//
//package chauhan;
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//    public class linkedlist_01 {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static void displayr(Node head){
//        Node temp = head;
//        System.out.print(temp.data+" ");
//        displayr(temp.next);
//    }
//    static void displayreverse(Node head){
//        Node temp = head;
//        displayreverse(head.next);
//        System.out.println(temp.data);
//
//    }
//    static boolean hascycle(Node head){
//        Node slow = head;
//        Node fast = head;
//        while(fast!=null&&fast.next!=null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (fast == slow) return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node a = new Node(12);
//        Node b = new Node(14);
//        Node c = new Node(23);
//        Node d = new Node(34);
//        Node e = new Node(32);
//        Node f = new Node(60);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        display(a);
//        System.out.println(hascycle(a));
//        display(a);
//    }
//    }
//


//
//package chauhan;
//import java.util.Scanner;
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node  cyclestart(Node head) {
//        Node slow = head;
//        Node fast = head;
//        while (fast != null & fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (fast == slow) break;
//            Node temp = head;
//            while (temp != slow) {
//                temp = temp.next;
//                slow = slow.next;
//            }
//        }
//            return slow;
//        }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Node a = new Node(12);
//        Node b = new Node(14);
//        Node c = new Node(23);
//        Node d = new Node(34);
//        Node e = new Node(32);
//        Node f = new Node(60);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        display(a);
//        System.out.println(cyclestart(a));
//        display(a);
//    }
//}r
//
//
//
//
//package chauhan;
//
// removing the duplicates node in the list
//import java.util.Scanner;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node removeduplicates(Node head){
//        if(head==null) return head;
//        Node a = head;
//        Node b = head;
//        while(b!=null) {
//            if(b.data==a.data) b = b.next;
//            else {
//                a.next = b;
//                a = b;
//            }
//        }
//        a.next = null;
//        return head;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node a  = new Node(12);
//        Node b  = new Node(12);
//        Node c  = new Node(16);
//        Node d = new Node(16);
//        Node e  = new Node(17);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        System.out.println(removeduplicates(a).data);
//        display(a);
//    }
//}
//



//package chauhan;
//import java.util.Scanner;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static Node rotatelist(Node head, int k){
//        if(head==null||head.next==null)return head;
//        Node temp = head;
//        int n  = 0;
//        while(temp!=null){
//            temp = temp.next;
//            n++;
//        }
//        k %= n;
//        if(k==0)return head;
//        Node slow = head;
//        Node fast  = head;
//        for(int i=0;i<=k;i++){
//            fast = fast.next;
//        }
//        while(fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        Node newhead = slow.next;
//        slow.next = null;
//        fast.next = head;
//        return newhead;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node a = new Node(12);
//        Node b = new Node(14);
//        Node c = new Node(23);
//        Node d = new Node(34);
//        Node e = new Node(32);
//        Node f = new Node(60);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//    }
//}
//
//
//
//
//



//package chauhan;
//import java.util.Scanner;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node mergelist(Node list1, Node list2){
//        Node dummy = new Node(100);
//        Node temp = dummy;
//        Node temp1 = list1;
//        Node temp2 = list2;
//        while(temp!=null&&temp2!=null){
//            if(temp.data<=temp2.data){
//                temp.next = temp1;
//                temp1 = temp1.next;
////            }
//            else {
//                temp.next = temp2;
//                temp2 = temp2.next;
//            }
//            temp = temp.next;
//        }
//        if(temp1==null) temp.next  = temp2;
//        else temp.next = temp2;
//        return dummy.next;
//    }

/**
 * static Node mergeList(Node list1, Node list2){
 *     Node dunny = new Node(100);
 *     Node temp1 = list1;
 *     Node temo2 = list2;
 *     while(temp!=null && temp2!=null){
 *         if(temp.data<=temp2.data){
 *             temp.next = temp1;
 *             temp1  = temp1.next;
 *         }
 *         else {
 *             temp.next = twmp2;
 *             temp2 = twmp2.next;
 *         }
 *         temp = temp.mext;
 *     }
 *     if(temp!=null ) temp.next = temp2;
 *
 *     else temp.next = temp2
 *     return dummy.next
 *
 * }
 */







//    static Node sortlist(Node head){
//        if(head==null&&head.next==null) return head;
//        Node a = head;
//        Node slow = head;
//        Node fast = head;
//        while(fast.next!=null&&fast.next.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        Node b  = slow.next;
//        slow.next = null;
//        a = sortlist(a);
//        b = sortlist(b);
//        Node ans = mergelist(a,b);
//        return ans;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b = new Node(21);
//        Node c = new Node(13);
//        Node d = new Node(9);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//     display(a);
//        Node m = new Node(22);
//        Node n = new Node(1);
//        Node o = new Node(8);
//        Node p = new Node(40);
//        m.next = n;
//        n.next = o;
//        o.next = p;
//        display(m);
//        mergelist(a,b);
//        display(a);
//
//    }
//}






//package chauhan;
// reversing the array
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static Node  reverselist(Node head){
////        Node curr = head;
////        Node prev = null;
////        Node Next = head;
////        while(curr!=null){
////         Next = curr.next;
////         curr.next = prev;
////         prev = curr;
////         curr = Next;
////        }
////        return prev;
//        // reverse the linkedlist recursively
//        if(head==null||head.next==null) return head;
//        Node a = head.next;
//        Node newHead = reverselist(a);
//        a.next = head;
//        head.next = null;
//        return newHead;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(11);
//        Node b = new Node(34);
//        Node c = new Node(21);
//        Node d = new Node(89);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        display(a);
//        System.out.println(reverselist(a));
//        display(a);
//
//    }
//}




//package chauhan;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//        public static Node  reverselist(Node head) {
//            Node curr = head;
//            Node prev = null;
//            Node Next = head;
//            while (curr != null) {
//                Next = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = Next;
//            }
//            return prev;
//        }
//    public static boolean isPalindrome(Node head){
//        if(head.next==null) return true;
//        // creating the shallow copy
//        Node newHead = new Node(head.data);
//        Node t1 = head.next;
//        Node t2 = newHead;
//        while(t1!=null){
//            Node temp = new Node(t1.data);
//            t2.next = temp;
//            t2 = t2.next;
//            t1 = t1.next;
//        }
//        newHead = reverselist(newHead);
//        t1 = head;
//        t2 = newHead;
//        while(t1!=null){
//            if(t1.data!=t2.data) return false;
//            t2 = t2.next;
//            t1 = t1.next;
//        }
//        return true;

// 2nd approach to check the palindrome

//        Node slow = head;
//        Node fast = head;
//        while(fast!=null&&fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        Node j = reverselist(slow);
//        Node i = head;
//        while(j!=null){
//            if(i.data!=j.data) return false;
//            i = i.next;
//            j = j.next;
//        }
//        return true;
//    }
//    public static void main(String[] args)  {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(20);
//        Node e = new Node(10);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        System.out.println(isPalindrome(a));
//    }
//}



// reverse linkedlist ||
//package chauhan;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data  = data;
//    }
//}
//public class linkedlist_01 {
//    public static Node reverse(Node head){
//        Node  curr = head;
//        Node prev = null;
//        Node Next = head;
//        while(curr!=null){
//            Next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = Next;
//        }
//        return prev;
//    }
//public static Node reverse(Node head, int left, int right){
//  Node a = null;
//  Node b = null;
//  Node c = null;
//  Node d = null;
//  Node temp = head;
//  int pos = 1;
//  while(temp!=null){
//      if(pos==left-1) a = temp;
//      if(pos==left) b = temp;
//      if(pos==right) c = temp;
//      if(pos==right+1) d = temp;
//      temp = temp.next;
//      pos++;
//  }
// if(a!=null) a.next = null;
// if(c!=null) c.next  = null;
//  reverse(b);
//  if(a!=null) a.next = c;
//  b.next = d;
//  if(a==null) return c;
//  return head;
// }
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        Node f = new Node(60);
//        Node g = new Node(70);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//    }
//}
//








//package chauhan;

// reorder the linkedlist
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data  = data;
//    }
//}
//public class linkedlist_01 {
//    public static Node reverse(Node head){
//        Node curr= head;
//        Node prev =null;
//        Node Next = head;
//        while(curr!=null){
//            Next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = Next;
//        }
//        return prev;
//    }
//    public static Node middleNode(Node head){
//        Node slow = head;
//        Node fast = head;
//        while(fast.next!=null&&fast.next.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//    public static void  reverseList(Node head){
//        Node leftMiddle = middleNode(head);
//        Node head2 = leftMiddle.next;
//        head2 = reverse(head2);
//        Node dummy = new Node(-1);
//        Node temp = dummy;
//        while(head!=null && head2!=null){
//            temp.next =   head;
//            head = head.next;
//            temp = temp.next;
//            temp.next = head2;
//            head2 = head2.next;
//            temp = temp.next;
//        }
//        if(head==null) temp.next = head2;
//        if(head2==null) temp.next = head;
//        head = dummy.next;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        Node f = new Node(60);
//        Node g = new Node(70);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//        reverseList(a);
//    }
//}






//package chauhan;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class linkedlist_01 {
//    public static Node addTwoNumbers(Node l1, Node l2){
//        Node dummy = new Node(-1);
//        Node temp = dummy;
//        int carry = 0;
//        while(l1!=null&l2!=null){
//            int num = l1.data+l2.data+carry;
//            Node n = new Node(num%10);
//            temp.next  = n;
//            temp = temp.next;
//            if(num>9) carry = 1;
//            else carry = 0;
//            l1 =l1.next; l2 = l2.next;
//        }
//        if(carry==1){
//            Node n = new Node(1);
//            temp.next   = n;
//            temp = temp.next;
//        }
//        return dummy.next;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        Node f = new Node(60);
//        Node g = new Node(70);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//    }
//}\

//package chauhan;
//import java.util.*;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//public class linkedlist_01 {
//    static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    static void deleteAtTail(Node tail) {
//
//        tail.data = tail.next.data;
//        tail.next = tail.next.next;
//
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        Node f = new Node(60);
//        Node g = new Node(70);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//        display(a);
//        deleteAtTail(g);
//        display(a);
//    }
//}
//}
//
//
