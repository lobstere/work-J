package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        System.out.print("输入一组数字：");
        String[] n = sc.nextLine().split(" ");
        int[] ns = new int[n.length];
//        int t = ns[Math.min(i,ns.length-1)];
        for (i =0;i<ns.length;i++){
            ns[i] = Integer.parseInt(n[i]);
        }
        for (i =0;i<ns.length;i++){
            if(ns[0]==0){
                ns[0] = Integer.parseInt("1");
                System.out.println(Arrays.toString(ns));
            }
            if(ns[i]<0) {
                System.out.println("请输入非负整数");
                break;
            }
            ns[ns.length-1] = Integer.parseInt(String.valueOf(ns[ns.length-1]+1));
        }
    }
}
//  题解
//class Solution {
//    public int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] != 9) {
//                digits[i]++;
//                return digits;
//            }
//            digits[i] = 0;
//        }
//        //跳出for循环，说明数字全部是9
//        int[] temp = new int[digits.length + 1];
//        temp[0] = 1;
//        return temp;
//    }
//}