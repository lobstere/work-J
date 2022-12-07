package Me_Demo;

import java.util.Arrays;

public class m_l_977 {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums){
        int right=nums.length-1,left=0;
        int[] arr = new int[nums.length];
        int index = arr.length-1;
        while(left<right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                arr[index--]=nums[left]*nums[left];
                ++left;
            }else{
                arr[index--]=nums[right]*nums[right];
                --right;
            }
        }
        return arr;
    }
}
