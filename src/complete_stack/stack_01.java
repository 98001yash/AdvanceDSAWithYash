package complete_stack;

// performing normal operations in the stack
import java.util.*;
public class stack_01 {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
}
