package LeetCode;

import java.util.Scanner;

public class w_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sts = sc.nextLine().split(",");
        String s = sts[0];
        if(sts.length==0){
            System.out.println("无参数。");
        }else{
            for(String st : sts){
                while(!st.startsWith(s)){
                if(s.length()==0)
                    System.out.println("无参数");
                //公共前缀不匹配就让它变短！
                s=s.substring(0,s.length()-1);
                }
            }
            System.out.println(s);
        }
    }
}
//  题解
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length==0)return "";
//        //公共前缀比所有字符串都短，随便选一个先
//        String s=strs[0];
//        for (String string : strs) {
//            while(!string.startsWith(s)){
//                if(s.length()==0)return "";
//                //公共前缀不匹配就让它变短！
//                s=s.substring(0,s.length()-1);
//            }
//        }
//        return s;
//    }
//}