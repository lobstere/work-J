package LeetCode;

public class w_125 {
}
//  题解
//class Solution {
//    public boolean isPalindrome(String s) {
//        char[] sCh = s.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < s.length(); i++) {
//            if((sCh[i] >=48 && sCh[i] <= 57) || (sCh[i] >=65 && sCh[i] <= 90) || (sCh[i] >= 97 && sCh[i] <= 122))
//                sb.append(sCh[i]);
//        }
//        s = sb.toString();
//        String ss = sb.reverse().toString();
//        if(s.equalsIgnoreCase(ss))
//            return true;
//        return false;
//    }
//}