package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(",");
        int[] nums = new int[n.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(n[i]);
        }
        for(int j=1;j<nums.length;j++){
            nums[j]+=nums[j-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
