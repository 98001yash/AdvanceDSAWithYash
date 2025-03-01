//package chauhan;
//import java.util.Scanner;
//public class strings {
//    public static void main(String[] args) {
//        String x = "yash chauhan";
//        System.out.println(x);
//    }
//}



//package chauhan;
// to take the input from the string
//import java.util.Scanner;
//public class strings {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        String x = sc.nextLine();
//        System.out.println("hello" + x +"how are you");
//    }
//}


//
//package chauhan;
// we are using charAt and length function
//import java.util.Scanner;
//public class strings {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        String x = sc.nextLine();
//        System.out.println(x);
//        System.out.println(x.charAt(3));
//        System.out.println(x.length());
//    }
//}


//
//package chauhan;
// code for counting the vowel in the string
//import java.util.Scanner;
//public class strings {
//    static boolean isVowel(char ch) {
//        if (ch == 'a' || ch == 'A') return true;
//        if (ch == 'e' || ch == 'E') return true;
//        if (ch == 'i' || ch == 'I') return true;
//        if (ch == 'o' || ch == 'O') return true;
//        if (ch == 'u' || ch == 'U') return true;
//        return false;
//    }
//
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.println("enter the string ");
//        String s = sc.nextLine();
//        int n = s.length();
//        int count = 0;
//        for(int i=0;i<n;i++){
//            char ch = s.charAt(i);
//            if(isVowel(ch)==true)count++;
//        }
//        System.out.println(count);
//    }
//}


//package chauhan;
//import java.util.Scanner;
//public class strings {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the name");
//        String s = sc.nextLine();
//        System.out.println(s);
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        for(int i=0;i<s.length();i++){
//            for(int j = i+1;j<s.length();j++){
//                System.out.println(s.substring(i,j)+" ");
//            }
//            System.out.println();
//
//        }
//    }
//}


//package chauhan;
// return the total number of digits without using loops
//import java.util.Scanner;
//public class strings {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = "";
//        s = s+n;
//        System.out.println(s);
//        System.out.println(s.length());
//    }
//}