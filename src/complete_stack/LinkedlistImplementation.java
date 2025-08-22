package complete_stack;

public class LinkedlistImplementation {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }
    }

    public static void main(String[] args){
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(9);

        System.out.println("Top element: " + st.peek());
        System.out.print("Stack elements: ");
        st.display();

        System.out.println("Size: " + st.size());

        st.pop();
        System.out.print("After pop: ");
        st.display();
    }
}
