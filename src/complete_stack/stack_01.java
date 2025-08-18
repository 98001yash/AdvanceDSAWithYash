//package complete_stack;
//
//// performing normal operations in the stack
//import java.util.*;
//public class stack_01 {
//    public static void main(String[] args){
//        Stack<Integer> st = new Stack<>();
//
//        st.push(1);
//        st.push(2);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//
//        st.pop();
//        System.out.println(st);
//
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//    }
//}


// leetcode 20
// valid paranthesis

package complete_stack;
import java.util.Stack;
public class stack_01 {

    public static boolean  isValid(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([{}])";
        System.out.println(isValid(str)); // Output: true
    }
}