package LeetCode;

import java.util.HashSet;

public class w_805 {
    public static void main(String[] args) {

    }
}
//  题解
class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        int len = nums.length;
        if (len <= 1){
            return false;
        }
        int totalSum = 0;
        for (int num : nums){
            totalSum += num;
        }
        //防止浮点数
        for (int i = 0; i < len; i++){
            nums[i] = nums[i] * len - totalSum;
        }

        int leftLen = len / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < (1 << leftLen); i++){
            int sum = 0;
            for (int j = 0; j < leftLen; j++){
                if ((i & (1 << j)) != 0){
                    sum += nums[j];
                    if (sum == 0)    return true;
                }
            }
            if (sum == 0){
                return true;
            }
            set.add(sum);
        }

        int rightSum = 0;
        for (int i = leftLen; i < len; i++){
            rightSum += nums[i];
        }
        for (int i = leftLen; i < (1 << (len - leftLen)); i++){
            int sum = 0;
            for (int j = leftLen; j < len; j++){
                if ((i & (1 << (j - leftLen))) != 0){
                    sum += nums[j];
                    if (sum == 0)    return true;
                }
            }
            if (sum == 0 || (sum != rightSum && set.contains(-sum))){
                return true;
            }
        }

        return false;
    }
}