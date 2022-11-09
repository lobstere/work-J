package LeetCode;

//import java.util.Arrays;
import java.util.Scanner;

public class w_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nums = ");
        String[] n = sc.nextLine().split(",");
        System.out.print("val = ");
        int k = sc.nextInt();
        int a = 0;
        int[] nums = new int[n.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = Integer.parseInt(n[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                nums[a] = nums[i];
                a++;
            }
        }
        System.out.println(a);
    }
}
//  题解
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        if (nums == null || nums.length == 0)
//            return 0;
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }
//}