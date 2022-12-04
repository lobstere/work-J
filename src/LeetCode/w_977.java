package LeetCode;

import java.util.Arrays;

public class w_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] arr = new int[nums.length];
        int index = arr.length-1;
//        for(int i=0;i<nums.length;i++){
//            arr[i]=nums[i]*nums[i];
//        }
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                arr[index--] = nums[left] * nums[left];
                ++left;
            } else {
                arr[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return arr;
    }
}
