package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  初始化以及获取数组值。
        int i=0;
        int j=0;
        int k=0;
        int m1 = 0;
        int m2 = 0;
        System.out.print("请输入第一个数组：");
        String[] s1 = sc.nextLine().split(",");
        int[] nums1 = new int[s1.length];
        System.out.print("请输入第二个数组：");
        String[] s2 = sc.nextLine().split(",");
        int[] nums2 = new int[s2.length];
        int mid = (nums1.length+nums2.length)/2;
        for(i=0;i<nums1.length;i++){
            nums1[i]=Integer.parseInt(s1[i]);
        }
        for(i=0;i<nums2.length;i++){
            nums2[i]=Integer.parseInt(s2[i]);
        }
        //  寻找两个正序数组的中位数并计算
        while (k <= mid && (i < nums1.length || j < nums2.length)) {
            m1 = m2;
            if (i == nums1.length || (i != nums1.length && j != nums2.length && nums2[j] < nums1[i]))
                m2 = nums2[j++];
            else
                m2 = nums1[i++];
            k++;
        }
        System.out.println((nums1.length + nums2.length) % 2 == 1 ? (double) m2 : (double) (m1 + m2) / 2);
    }
}
//  题解
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int i = 0, j = 0, k = 0, m1 = 0, m2 = 0;
//        int mid = (nums1.length + nums2.length) / 2;
//        while (k <= mid && (i < nums1.length || j < nums2.length)) {
//            m1 = m2;
//            if (i == nums1.length || (i != nums1.length && j != nums2.length && nums2[j] < nums1[i]))
//                m2 = nums2[j++];
//            else
//                m2 = nums1[i++];
//            k++;
//        }
//        return (nums1.length + nums2.length) % 2 == 1 ? (double) m2 : (double) (m1 + m2) / 2;
//    }
//}