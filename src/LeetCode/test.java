package LeetCode;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  获取数组的方式
        String[] n = sc.nextLine().split(",");
        int[] nums = new int[n.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(n[i]);
        }
    }
}
