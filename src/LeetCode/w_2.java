package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_2 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("nums1 = ");
        String str1 = sc.nextLine();
        String[] arr1 = str1.split(" ");

        System.out.print("nums2 = ");
        String str2 = sc.nextLine();
        String[] arr2 = str2.split(" ");

        int[] b = new int[arr1.length];
        int[] d = new int[arr2.length];
        for (int j = 0; j < b.length; j++) {
            b[j] = Integer.parseInt(arr1[j]);
        }

        int f = (d.length + b.length) - 3;
        for (int j = 0; j < f; j++) {
            d[j] = Integer.parseInt(arr2[j]);
            System.out.println(Arrays.toString(d));
        }

        int[] h = new int[f];
        for (int i = 0; i < f; i++) {
            h[i] = b[i] + d[i];
            if (h[i] == 10) {
                h[i] = 0;
                flag = true;
                continue;
            }
            if (flag) {
                h[i] += 1;
            }
        }
        System.out.println(Arrays.toString(h));

        // 反转数组
//        for (int i = 0; i < b.length / 2; i++) {
//            temp = b[i];
//            b[i] = b[b.length - 1 - i];
//            b[b.length - 1 - i] = temp;
//        }
    }
}
    // 题解：
//    public class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            ListNode dummyHead = new ListNode(-1), pre = dummyHead;
//            int t = 0;
//            while (l1 != null || l2 != null || t != 0) {
//                if (l1 != null) {
//                    t += l1.val;
//                    l1 = l1.next;
//                }
//                if (l2 != null) {
//                    t += l2.val;
//                    l2 = l2.next;
//                }
//                pre.next = new ListNode(t % 10);
//                pre = pre.next;
//                t /= 10;
//            }
//
//            return dummyHead.next;
//        }
//    }