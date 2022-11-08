package LeetCode;

//import java.util.Stack;

import java.util.Scanner;

public class w_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String[] s = sc.nextLine().split(" ");
        boolean flag = false;
//        for(int i = 0;i<s.length;i++){
//            if(s[i].equals("(") && s[i+1].equals(")")){
//                System.out.println(true);
//                break;
//            }else if(s[i].equals("[")&&s[i+1].equals("]")){
//                System.out.println(true);
//            }else if(s[i].equals("{") && s[i+1].equals("}")){
//                System.out.println(true);
//            }else{
//                System.out.println(false);
//            }
//        }
        //  未解决
        for(int i = 0;i<s.length;i++){
            if(s[i].equals("(") && s[i+1].equals(")")){
            }else if(s[i].equals("[") && s[i+1].equals("]")){
            }else if(s[i].equals("{") && s[i+1].equals("}")){
                flag = true;
            }else if(flag){
                System.out.println(true);
            }else{
                System.out.println(false);
                break;
            }
        }
    }
    //  题解
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for(char c: s.toCharArray()){
//            if(c=='(')stack.push(')');
//            else if(c=='[')stack.push(']');
//            else if(c=='{')stack.push('}');
//            else if(stack.isEmpty()||c!=stack.pop())return false;
//        }
//        return stack.isEmpty();
//    }
}
