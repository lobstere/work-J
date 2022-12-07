package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nums = ");
        String[] nums = sc.nextLine().split(",");
        System.out.print("k = ");
        int k = sc.nextInt();
        int[] num = new int[nums.length];
        for (int j = 0; j < num.length; j++) {
            num[j] = Integer.parseInt(nums[j]);
        }
        int tmps[] = new int[num.length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < num.length; i++) {
            tmps[i] = num[i];
        }

        for (int i = 0; i < num.length; i++) {
            num[(i + k) % num.length] = tmps[i];
        }
        System.out.println(Arrays.toString(num));
    }
}
//  题解
//class Solution {
//    public void rotate(int nums[], int k) {
//        int length = nums.length;
//        int temp[] = new int[length];
//        //把原数组值放到一个临时数组中，
//        for (int i = 0; i < length; i++) {
//            temp[i] = nums[i];
//        }
//        //然后在把临时数组的值重新放到原数组，并且往右移动k位
//        for (int i = 0; i < length; i++) {
//            nums[(i + k) % length] = temp[i];
//        }
//    }
//}
//  https://leetcode.cn/problems/rotate-array/