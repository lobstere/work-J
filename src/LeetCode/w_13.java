package LeetCode;

import java.util.Scanner;

public class w_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");
        int nums = 0;
        for(int i =0;i<s.length();i++){
            switch(s.charAt(i)) {
                case 'I':
                    nums += 1;
                    break;
                case 'V':
                    nums += 5;
                    break;
                case 'X':
                    nums += 10;
                    break;
                case 'L':
                    nums += 50;
                    break;
                case 'C':
                    nums += 100;
                    break;
                case 'D':
                    nums += 500;
                    break;
                case 'M':
                    nums += 1000;
                    break;
                case 'a':
                    nums += 4;
                    break;
                case 'b':
                    nums += 9;
                    break;
                case 'c':
                    nums += 40;
                    break;
                case 'd':
                    nums += 90;
                    break;
                case 'e':
                    nums += 400;
                    break;
                case 'f':
                    nums += 900;
                    break;
            }

        }
        System.out.println(nums);
    }
}
//  题解
//class Solution {
//    public int romanToInt(String s) {
//        s = s.replace("IV","a");
//        s = s.replace("IX","b");
//        s = s.replace("XL","c");
//        s = s.replace("XC","d");
//        s = s.replace("CD","e");
//        s = s.replace("CM","f");
//
//        int res = 0;
//        for (int i = 0; i < s.length(); i++) {
//            res += getValue(s.charAt(i));
//        }
//        return res;
//    }
//
//    public int getValue(char c) {
//        switch(c) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            case 'a': return 4;
//            case 'b': return 9;
//            case 'c': return 40;
//            case 'd': return 90;
//            case 'e': return 400;
//            case 'f': return 900;
//        }
//        return 0;
//    }
//}