package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        String[] s2 = new String[s.length];
        int n=0;
        for(int i=s2.length-1;i>=0;i--){
            for(int j=0;j<s2.length;j++){
                s2[i]= (s[n]);
            }
            n++;
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s2));
    }
}
//  题解
//class Solution {
//    public void reverseString(char[] s) {
//        int l = 0;
//        int r = s.length - 1;
//        while (l < r) {
//            s[l] ^= s[r];  //构造 a ^ b 的结果，并放在 a 中
//            s[r] ^= s[l];  //将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
//            s[l] ^= s[r];  //a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
//            l++;
//            r--;
//        }
//    }
//}