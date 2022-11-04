package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nums = ");
        String str = sc.nextLine();
        String[] arr  = str.split(" ");
        int a = 1;
        int[] b = new int[arr.length];
        for(int j = 0; j<b.length;j++) {
            b[j] = Integer.parseInt(arr[j]);
            a = a * b[j];
        }
        System.out.println(a);

    }
    //  题解
//    public int maximumProduct(int[] nums) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        return Math.max(nums[0]*nums[1]*nums[n - 1], nums[n - 1]*nums[n - 2]*nums[n - 3]);
//    }
}
