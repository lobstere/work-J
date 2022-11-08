package LeetCode;

//import java.util.Arrays;
import java.util.Scanner;

public class w_561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nums = ");
        String[] n=sc.nextLine().split(" ");
        int sum = 0;
        int[] ns = new int[n.length];
        for(int i=0;i<ns.length;i++){
            ns[i] = Integer.parseInt(n[i]);
        }
        for(int i=0;i<ns.length;i=i+2){
            sum+=ns[i];
        }
        System.out.println(sum);
    }
}
//  题解
//class Solution {
//    public int arrayPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int sum=0;
//        for(int i=0;i<nums.length;i=i+2){
//            sum+=nums[i];
//        }
//        return sum;
//    }
//}