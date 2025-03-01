//package chauhan;

// code for the infix expressions
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String str = "9-5+3*4/6";
//        Stack<Integer>  val  = new Stack<>();
//        Stack<Character>   op = new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48&&ascii<=57) val.push(ascii-48);
//            else if(op.size()==0) op.push(ch);
//            else {
//                if(ch=='+' || ch=='-'){
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    if(op.peek()=='-') val.push(v1 - v2);
//                    if(op.peek()=='+') val.push(v1 + v2);
//                    if(op.peek()=='*') val.push(v1 * v2);
//                    if(op.peek()=='/') val.push(v1 / v2);
//                    op.pop();
//                    op.push(ch);
//                }
//                if(ch=='*' || ch=='/'){
//                    if(op.peek()=='*'||op.peek()=='/'){
//                        int v2 = val.pop();
//                        int v1 = val.pop();
//                        if(op.peek()=='*') val.push(v1 * v2);
//                        if(op.peek()=='/') val.push(v1 / v2);
//                        op.pop();
//                        op.push(ch);
//                    }
//                    else op.push(ch);
//                }
//            }
//        }
//        while(val.size()>1){
//            int v2 = val.pop();
//            int v1 = val.pop();
//            if(op.peek()=='-') val.push(v1 - v2);
//            if(op.peek()=='+') val.push(v1 + v2);
//            if(op.peek()=='*') val.push(v1 * v2);
//            if(op.peek()=='/') val.push(v1 / v2);
//            op.pop();
//        }
//        System.out.println(val.peek());
//    }
//}



//

// code for the prefix operations
//package chauhan;
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String infix  = "9-5+3*4/6";
//        Stack<String>  val  = new Stack<>();
//        Stack<Character>   op = new Stack<>();
//        for(int i=0;i<infix.length();i++){
//            char ch = infix.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48&&ascii<=57) {
//                String s = " " + ch;
//                val.push(s);
//            }
//            else if(op.size()==0) op.push(ch);
//            else {
//                if(ch=='+' || ch=='-'){
//                    String  v2 = val.pop();
//                    String v1 = val.pop();
//                   char o =  op.pop();
//                   String t = o+v1+v2;
//                    val.push(t);
//                    op.push(ch);
//                }
//                if(ch=='*' || ch=='/'){
//                    if(op.peek()=='*'||op.peek()=='/'){
//                        String  v1 = val.pop();
//                        String v2 = val.pop();
//                      char o = op.pop();
//                      String t = o+v1+v2;
//                      val.push(t);
//
//                        op.push(ch);
//                    }
//                    else op.push(ch);
//                }
//            }
//        }
//        while(val.size()>1){
//            String v2 = val.pop();
//            String  v1 = val.pop();
//            char o = op.pop();
//            String t = o+v1+v2;
//            val.push(t);
//        }
//        String prefix = val.pop();
//        System.out.println(prefix);
//    }
//}




//
// code for the postfix operations
//package chauhan;
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String infix  = "9-5+3*4/6";
//        Stack<String>  val  = new Stack<>();
//        Stack<Character>   op = new Stack<>();
//        for(int i=0;i<infix.length();i++){
//            char ch = infix.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48&&ascii<=57) {
//                String s = " " + ch;
//                val.push(s);
//            }
//            else if(op.size()==0) op.push(ch);
//            else {
//                if(ch=='+' || ch=='-'){
//                    String  v2 = val.pop();
//                    String v1 = val.pop();
//                    char o =  op.pop();
//                    String t = v1+v2+o;
//                    val.push(t);
//                    op.push(ch);
//                }
//                if(ch=='*' || ch=='/'){
//                    if(op.peek()=='*'||op.peek()=='/'){
//                        String  v1 = val.pop();
//                        String v2 = val.pop();
//                        char o = op.pop();
//                        String t = v1+v2+o;
//                        val.push(t);
//
//                        op.push(ch);
//                    }
//                    else op.push(ch);
//                }
//            }
//        }
//        while(val.size()>1){
//            String v2 = val.pop();
//            String  v1 = val.pop();
//            char o = op.pop();
//            String t =  v1+v2+o;
//            val.push(t);
//        }
//        String postfix  = val.pop();
//        System.out.println(postfix);
//    }
//}





//
// evalution of the postfix expressions
//package chauhan;
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String str = "953+4*6/-";
//        Stack<Integer> val = new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48&&ascii<=57){
//                val.push(ascii-48);
//            }
//            else {
//                int v2 = val.pop();
//                int v1 = val.pop();
//                if(ch=='+')val.push(v1+v2);
//                if(ch=='-')val.push(v1-v2);
//                if(ch=='*')val.push(v1*v2);
//                if(ch=='/')val.push(v1/v2);
//            }
//        }
//        System.out.println(val.peek());
//    }
//}





//
// conversion of the prefix expression
//package chauhan;
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String str = "-9/*+5346";
//        Stack<Integer> val = new Stack<>();
//        for(int i=str.length()-1;i>=0;i--){
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48&&ascii<=57){
//                val.push(ascii-48);
//            }
//            else {
//                int v1 = val.pop();
//                int v2 = val.pop();
//                if(ch=='+')val.push(v1+v2);
//                if(ch=='-')val.push(v1-v2);
//                if(ch=='*')val.push(v1*v2);
//                if(ch=='/')val.push(v1/v2);
//            }
//        }
//        System.out.println(val.peek());
//    }
//}



//conversion of the prefix to postfix expression
//package chauhan;
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String str = "-9/*+5346";
//        Stack<String> val = new Stack<>();
//        for(int i=str.length()-1;i>=0;i--){
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48 && ascii<=57){
//                val.push(ch+" ");
//            }
//            else {
//                String  v1 = val.pop();
//                String  v2 = val.pop();
//               char op = ch;
//               String t = v1+v2+op;
//               val.push(t);
//            }
//        }
//        System.out.println(val.peek());
//    }
//}
//
//
//




//conversion of the postfix to infix expressions
//package chauhan;
//import java.util.*;
//public class stacks_02 {
//    public static void main(String[] args) {
//        String str = "953+4*6/-";
//        Stack<String> val = new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if(ascii>=48&&ascii<=57){
//                val.push(ch+" ");
//            }
//            else {
//                String  v2 = val.pop();
//                String  v1 = val.pop();
//              char op = ch;
//              String t = "(" + v1+op+v2 +")";
//              val.push(t);
//            }
//        }
//        System.out.println(val.peek());
//    }
//}









