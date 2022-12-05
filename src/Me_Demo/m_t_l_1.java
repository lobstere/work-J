package Me_Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class m_t_l_1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums,int target){
        int[] arr = {0};
        int[] arri = new int[2];
        int right=nums.length-1;
        int left=0;
        int len=nums.length;
//        int temp=target-nums[i];
//        while(left<right){
//            if(nums[left]+nums[right]==target){
//                arri[0]=left;
//                arri[1]=right;
//                return arri;
//            }else if(nums[left]+nums[right]<target){
//                left++;
//            }else{
//                right--;
//            }
//        }
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (nums[i] + nums[j] == target) {
                    arri[0]=i;
                    arri[1]=j;
                    return arri;
                }
            }
        }
        return arri;
    }
}
