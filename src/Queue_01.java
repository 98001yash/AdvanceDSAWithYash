//package chauhan;
//import java.util.*;
//public class Queue_01 {
//public static void main(String[] args) {
//    Queue<Integer> que = new LinkedList<>();
//    que.add(12);
//    que.add(13);
//    que.add(15);
//    que.add(17);
//    que.add(19);
//    System.out.print(que);
//    que.remove();
//    System.out.print(que);
//    System.out.println(que.peek());
//    System.out.println(que.size());
//}
//
//
//}
//
//

// to reverse the queue using stack
//package chauhan;
//import java.util.*;
//public class Queue_01 {
//    static Queue<Integer> que;
//    static void reversequeue() {
//        Stack<Integer> st = new Stack<>();
//        while(!que.isEmpty()){
//      st.push(que.remove());
//        }
//        while(st.size()>0) {
//            que.add(st.pop());
//        }
//    }
//    public static void main(String[] args) {
//         que = new LinkedList<>();
//        que.add(12);
//        que.add(13);
//        que.add(15);
//        que.add(17);
//        que.add(19);
//        System.out.print(que);
//        System.out.println();
//        reversequeue();
//        System.out.println(que);
//    }
//}


//
//package chauhan;
// basic operation using the helper queue
//import java.util.*;
//public class Queue_01 {
//    public static void main(String[] args) {
//        Queue<Integer> que  = new LinkedList<>();
//        que.add(12);
//        que.add(13);
//        que.add(15);
//        que.add(17);
//        que.add(19);
//        Queue<Integer> helper = new LinkedList<>();
//        while(que.size()>0){
//            System.out.print(que.peek()+" ");
//            helper.add(que.remove());
//        }
//        System.out.println();
//        while(helper.size()>0){
//            que.add(helper.remove());
//        }
//        System.out.print(que);
//    }
//}


// to remove the elements present inn the even index of the queue
//package chauhan;
//import java.util.*;
//public class Queue_01 {
//   static Queue<Integer> que;
//   static Queue<Integer> newque;
//
//    static void removeEven() {
//       Queue<Integer> newque =  new LinkedList<>();
//       while(!que.isEmpty()) {
//           que.remove();
//       }
//       if(!que.isEmpty()){
//           newque.add(que.remove());
//       }
//    }
//
//    public static void main(String[] args) {
//
//        Queue<Integer> que  = new LinkedList<>();
//        que.add(12);
//        que.add(34);
//        que.add(45);
//        que.add(56);
//        que.add(90);
//        removeEven();
//        System.out.println(que);
//    }
//}




//
// implementation  of queue using array
//package chauhan;
//import java.util.*;
//public class Queue_01 {
//    public static class que {
//        int f = -1;
//        int r = -1;
//        int size  = 0;
//        int[] arr = new int[12];
//        public void add(int val) {
//            if(r==arr.length-1){
//                System.out.println("queue is full");
//                return;
//            }
//            if(f==-1&&r==-1){
//                f=r=0;
//                arr[r] =val;
//            }
//            else {
//                arr[++r] = val;
//            }
//            size++;
//        }
//        public int remove() {
//            // check the underflow condition
//            if(size==0){
//                System.out.println("queue is empty");
//                return -1;
//            }
//            int val = arr[f++];
//            size--;
//            return val;
//        }
//         public int peek() {
//            if(size==0){
//                System.out.println("queue is empty");
//                return -1;
//            }
//            return arr[f];
//         }
//         public boolean isEmpty() {
//            if(size==0){
//                return true;
//            }
//            return false;
//         }
//         public void display () {
//            if(size==0){
//                System.out.println("queue is empty");
//            }
//            else {
//                for(int i=f;i<=r;i++){
//                    System.out.print(arr[i]+" ");
//                }
//            }
//             System.out.println();
//         }
//    }
//    public static void main(String[] args) {
//  que q = new que();
//  q.add(12);
//  q.add(23);
//  q.add(45);
//  q.add(78);
//  q.add(22);
//  q.display();
//        System.out.println(q.remove());
//        System.out.println(q.peek());
//        q.display();
//    }
//}



//
//package chauhan;
// implementataion of the queue using linkedlist
//import java.util.*;
//public class Queue_01 {
//    public static class Node  {
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    public static class queueLL {
//        Node head = null;
//        Node tail = null;
//        int size  = 0;
//        public void add(int x){
//            Node temp = new Node(x);
//            if(size==0){
//                head  = tail = temp;
//            }
//            else {
//                tail.next = temp;
//                tail = temp;
//            }
//            size++;
//        }
//        public int  peek () {
//            if(size==0){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return head.data;
//        }
//        public int remove() {
//            if (size == 0) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int x = head.data;
//            head = head.next;
//            return x;
//        }
//        public boolean isEmpty() {
//            if(size==0)  return true;
//            return false;
//        }
//        public void display() {
//            Node temp = head;
//            while(temp!=null){
//                System.out.print(temp.data+" ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        queueLL q   = new queueLL();
//        q.add(12);
//        q.add(21);
//        q.add(55);
//        q.add(54);
//        q.add(78);
//        q.display();
//        System.out.println(q.remove());
//        System.out.println(q.peek());
//        System.out.println(q.remove());
//        q.display();
//    }
//}







// implemeantation of deque using the doubly linked list
// all the opeartions of the deque in the doublty linkedlis
//package chauhan;
//
//import java.util.*;
//public class Queue_01 {
//    public static class Node {
//        int data;
//        Node next,prev;
//        Node(int data){
//            this.data = data;
//            this.next = this.prev = null;
//        }
//    }
//    public  static class Deque {
//        Node front;
//        Node rear;
//        int size;
//        Deque(){
//            front = rear = null;
//            size  = 0;
//        }
//        boolean isEmpty(){
//            if(size==0){
//                return true;
//            }
//            return false;
//        }
//        void insertFront(int data) {
//            Node newNode  = new Node(data);
//            if(front==null){
//                rear = front  = newNode;
//            }
//            else {
//                newNode.next = front;
//                front.prev = newNode;
//                front  = newNode;
//            }
//            size++;
//        }
//        void insertRear(int data){
//            Node newNode = new Node(data);
//            if(rear==null){
//                front = rear = newNode;
//            }
//            else {
//                newNode.prev = rear;
//                 rear.next = newNode;
//                 rear  = newNode;
//            }
//            size++;
//        }
//        void deleteFront() {
//            if (size == 0) {
//                System.out.println("undeflow");
//            } else {
//                Node temp = front;
//                front = front.next;
//                if (front == null) {
//                    rear = null;
//                } else {
//                    front.prev = null;
//                    size--;
//                }
//            }
//        }
//            void deleteRear(){
//                if(size==0){
//                    System.out.println("underflow");
//                }
//                else {
//                    Node temp = rear;
//                    rear = rear.prev;
//                    if(rear==null){
//                        front=null;
//                    }
//                    else {
//                        rear.next = null;
//                    }
//                    size--;
//            }
//        }
//        int getFront() {
//            if(size==0){
//                System.out.println("underflow");
//                return -1;
//            }
//            else {
//                return front.data;
//            }
//        }
//        int getRear() {
//            if(size==0){
//                System.out.println("underflow");
//                return -1;
//            }
//            return rear.data;
//        }
//    }
//    public static void main(String[] args) {
//    Deque dq = new Deque();
//        System.out.println("inserting 12 at front ");
//    dq.insertFront(12);
//        System.out.println("inserting 67 at front ");
//        System.out.println(dq.getRear());
//        dq.insertFront(67);
//        System.out.println(dq.getRear());
//        System.out.println("inserting 34 at front ");
//        dq.insertFront(34);
//        System.out.println(dq.getRear());
//        System.out.println("inserting 99 at front ");
//        dq.insertFront(99);
//        System.out.println(dq.getRear());
//        System.out.println("inserting 3 at front ");
//        dq.insertFront(3);
//        System.out.println(dq.getFront());
//
//    }
//}



// operations based on the circular queue
//
//package chauhan;
//import java.util.*;
//public class Queue_01 {
//    public static  class Cpa {
//        int front  = -1;
//        int rear  = -1;
//        int size  = 0;
//        int[] arr = new int[12];
//        public void add(int data){
//            if(size==arr.length){
//                System.out.println("array is full");
//                return;
//            }
//            else if (size==0){
//                front = rear  = 0;
//                arr[0] = data;
//            }
//            else if(rear<arr.length-1){
//                arr[++rear ] = data;
//            }
//            else if(rear == arr.length-1){
//                rear  = 0;
//                arr[0] = data;
//            }
//            size++;
//        }
//        public int remove() {
//            if(size==0){
//                System.out.println("queue is empty");
//                return -1;
//            }
//            else {
//                int val = arr[front];
//                if(front==arr.length-1) front  =  0;
//                else front++;
//                size--;
//                return val;
//            }
//        }
//        public int peek() {
//            if(size==0){
//                System.out.println("queue is empty");
//                return -1;
//            }
//            else return arr[front];
//        }
//        public void display() {
//            if(size==0){
//                System.out.println("queue is empty");
//                return;
//            }
//            else if(front<=rear){
//                for(int i =0;i<=rear;i++){
//                    System.out.print(arr[i]+" ");
//                }
//            }
//            else {
//                for(int i=front;i<arr.length;i++){
//                    System.out.print(arr[i]+" ");
//                }
//            }
//            for(int i=0;i<=arr.length;i++){
//                System.out.print(arr[i]+ "");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Cpa  q = new Cpa();
//        q.display();
//        q.add(12);
//        q.add(21);
//        q.add(34);
//        q.add(45);
//        q.add(56);
//        q.display();
//        System.out.println(q.remove());
//        q.display();
//        System.out.println(q.remove());
//        q.display();
//    }
//}






// reverse the first k elements of the queue


//package chauhan;
//import java.util.*;
//public class Queue_01 {
//    public static  class reverseK {
//        public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
//            Stack<Integer> st = new Stack<>();
//            int n  = q.size() - k;
//            while(k-- >0){
//                st.push(q.poll());
//            }
//            while(!st.isEmpty()){
//                q.add(st.pop());
//            }
//            for(int i=0;i<n;i++){
//                int a = q.peek();
//                q.poll();
//                q.add(a);
//            }
//            return q;
//        }
//
//    }
//    public static void main(String[] args) {
//      reverseK  rev = new reverseK();
//      Queue<Integer> que = new LinkedList<>();
//      que.add(1);
//      que.add(2);
//      que.add(3);
//      que.add(4);
//      que.add(5);
//      Queue<Integer> newq = rev.modifyQueue(que,3);
//        System.out.println(newq);
//    }
//}
