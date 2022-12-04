package LeetCode;

import java.util.Scanner;

public class w_122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("nums = ");
        String[] nums = sc.nextLine().split(" ");
        int[] num = new int[nums.length];
        for (int j = 0; j < num.length; j++) {
            num[j] = Integer.parseInt(nums[j]);
        }
        for(int i=1;i<=num.length-1;i++){
            if(num[i]>num[i-1]){
                sum+=num[i]-num[i-1];
            }
        }
        System.out.println(sum);
    }
}
//  题解
//class Solution {
//    public int maxProfit(int[] prices) {
//        int ans=0;
//        for(int i=1;i<=prices.length-1;i++)
//        {
//            if(prices[i]>prices[i-1])
//            {
//                ans+=prices[i]-prices[i-1];
//            }
//        }
//        return ans;
//    }
//}
//  https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/