//package chauhan;
// class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
// to delete the elemenents  of ther linkedlist when we do not know the head and
// previous index of the linkedlist
//public class revision {
//     static void display(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     static void deleteNode(Node a){
//         a.data = a.next.data;
//         a.next = a.next.next;
//     }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        deleteNode(a);
//        display(a);
//    }
//}


//
//package chauhan;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class revision {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null) {
//            System.out.print(temp.data + " ");
//
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node  middleNode(Node head) {
// brute force approach to find the middle of the linked list
//   Node temp = head;
//   int length = 0;
//   while(temp!=null){
//       temp = temp.next;
//       length++;
//   }
//   int mid  = (length/2+1);
//    temp = head;
//   for(int i=1;i<=mid-1;i++){
//       temp = temp.next;
//   }
//   return temp;
//    }

// slow - fast approach to find the middle of the linkedlist
//    public static Node middleNode(Node head){
//        Node slow = head;
//        Node fast = head;
//        while(fast!=null&&fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//    public static void main(String[] args) {
//            Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        System.out.println(middleNode(a).data);
//        display(a);
//
//
//    }
//}
//


//package chauhan;
// to delete the middle of the linked list
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class revision {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node deleteMiddleNode(Node head){
//        Node temp = head;
//        Node slow = head;
//        Node fast = head;
//        while(fast.next.next!=null&& fast.next.next.next!=null){
//            slow = slow.next;
//            fast =fast.next.next;
//        }
//        slow.next = slow.next.next;
//        return head;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        deleteMiddleNode(a);
//        display(a);
//    }
//}




//package chauhan;
//class Node  {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//// remove the nth node from the end of the linked list
//public class revision {
//    static void display(Node head){
//    Node temp = head;
//    while(temp!=null){
//        System.out.print(temp.data+" ");
//        temp = temp.next;
//    }
//    System.out.println();
//    }
//    public static Node removeNthNode(Node head, int n){
// delete the nth node from the linkedlist
// brute force approach to delete nth node from the end
//        Node temp = head;
//        int length = 0;
//        while(temp!=null){
//            temp = temp.next;
//            length++;
//        }
//        if(length==1) return null;
//// n from the end =  length-n+1 from the start
//        temp = head;
//        for(int i=1;i<=length-n-1;i++){
//         temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return head;
//    }


//   public static Node removeNthNode(Node head, int n) {

// this is the slow- fast approach to
// delete the nth node from the end of the linkedlist
//        Node slow = head;
//        Node fast = head;
//        Node temp = head;
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//        if(fast==null) return head.next;
//        while(fast.next!=null){
//        slow = slow.next;
//        fast = fast.next.next;
//    }
//        slow.next = slow.next.next;
//    return head;
//    }
//
//    public static void main(String[] args) {
//    Node a = new Node(12);
//   Node b =  new Node(90);
//   Node c = new Node(45);
//    Node d = new Node(32);
//    Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        removeNthNode(a,2);
//        display(a);
//    }
//}


//finding the intersection of the two  linked list
//package chauhan;
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class revision {
//    static void display(Node head) {
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//        }
//        temp  = temp.next;
//    }
//    public static Node intersection(Node headA, Node headB) {
//        Node tempA = headA;
//        Node tempB = headB;
//        int lenA = 0;
//        while (tempA != null) {
//            tempA = tempA.next;
//            lenA++;
//        }
//        int lenB = 0;
//        while (tempB != null) {
//            tempB = tempB.next;
//            lenB++;
//        }
//        tempA = headA;
//        tempB = headB;
//        if (lenA > lenB) {
//            int steps = lenA - lenB;
//            for (int i = 0; i <= steps; i++) {
//                tempA = tempA.next;
//            }
//        } else {
//            if (lenB > lenA) {
//                int steps = lenB - lenA;
//                for (int i = 0; i <= steps; i++) {
//                    tempB = tempB.next;
//                }
//            }
//        }
//            while(tempA!=tempB){
//                tempA = tempA.next;
//                tempB = tempB.next;
//            }
//            return tempA;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//    }
//}


//
//package chauhan;
// to finding the linkedlist has cycle or not
// linked list - 1
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data  = data;
//    }
//}
//public class revision {
//    static void  display(Node head){
//        Node temp =  head;
//        while(temp!=null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static boolean hasCycle(Node head){
//        Node slow =head;
//        Node fast = head;
//        while(fast!=null&&fast.next!=null){
//         slow = slow.next;
//         fast = fast.next.next;
//         if(fast==slow) return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        System.out.println(hasCycle(a));
//    }
//}


//
//package chauhan;
// code to find the intersection of the two linked list
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class revision {
//    static void display(Node head) {
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node  detectCycle(Node head) {
//        if(head==null) return null;
//        if(head.next==null) return null;
//        Node slow=  head;
//        Node fast = head;
//        while(fast!=null&&fast.next!=null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (fast == slow) break;
//        }
//        if(fast!=slow) return null;
//        Node temp =  head;
//        while(temp!=slow){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//    }
//}



//package chauhan;
// to delete the duplicates elements of the linkedlist
// simple appraoach to delete the duplicates elements
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class revision {
//    static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static Node deleteduplicates(Node head){
//        if(head==null) return head;
//        Node a = head;
//        Node b =  head;
//        while(b!=null){
//            if(b.data==a.data){
//                b = b.next;
//            }
//            else {
//                a.next = b;
//                a = b;
//            }
//        }
//        a.next = null;
//        return head;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(12);
//        Node d = new Node(90);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        deleteduplicates(a);
//        display(a);
//    }
//}


//
//package chauhan;
// rotate the linked list k steps
// sma as array approach  uses
//class Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
//public class revision {
//    static void display(Node head){
//        Node temp =  head;
//        while(temp!=null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    static Node rotateList(Node head, int k) {
//        if (head == null || head.next == null) return head;
//        Node temp = head;
//        int n = 0;
//        while (temp != null) {
//            temp = temp.next;
//            n++;
//        }
//        k %= n;
//        if (k == 0) return head;
//        Node slow = head;
//        Node fast = head;
//        for (int i = 1; i <= k; i++) {
//            fast = fast.next;
//        }
//        while (fast.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//            Node newHead = slow.next;
//            slow.next = null;
//            fast.next = head;
//            return newHead;
//        }
//
//
//    public static void main(String[] args) {
//        Node a = new Node(12);
//        Node b =  new Node(90);
//        Node c = new Node(45);
//        Node d = new Node(32);
//        Node e = new Node(77);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        display(a);
//        rotateList(a,2);
//        display(a);
//    }
//


