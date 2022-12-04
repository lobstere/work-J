package LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class w_217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nums = ");
        String[] nums = sc.nextLine().split(",");
        int[] num = new int[nums.length];
        for (int j = 0; j < num.length; j++) {
            num[j] = Integer.parseInt(nums[j]);
        }
        Set<Integer> res = new HashSet<Integer>();
        for(int i :num){
            res.add(i);
//            System.out.println(res.size() < nums.length);
        }
        System.out.println(res.size() < nums.length);
    }
}
//  题解
//public boolean containsDuplicate(int[] nums) {
//    Set<Integer> res = new HashSet<Integer>();
//    for(int i:nums)
//        res.add(i);
//    return res.size()<nums.length?true:false;
//}
//  https://leetcode.cn/problems/contains-duplicate/