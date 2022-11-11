package LeetCode;

import java.util.Scanner;

public class w_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int tmp = n;
        if(n<0){
            System.out.println("请输入一个正整数.");
        }else{
            while (tmp!=0){
                a = tmp%10;
//                System.out.println("a="+a);
                b = b*10+a;
//                System.out.println("b="+b);
                tmp = tmp/10;
//                System.out.println("tmp="+tmp);
            }
            System.out.println(b==n?"此数是一个回文数":"此数不是个回文数");
        }
    }
}
//  题解
//class Solution {
//    public boolean isPalindrome(int x) {
//        if(x<0)
//            return false;
//        int rem=0,y=0;
//        int quo=x;
//        while(quo!=0){
//            rem=quo%10;
//            y=y*10+rem;
//            quo=quo/10;
//        }
//        return y==x;
//    }
//}