package LeetCode;

//import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class w_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nums = ");
        String[] nums = sc.nextLine().split(" ");
        int[] num = new int[nums.length];
        for (int j = 0; j < num.length; j++) {
            num[j] = Integer.parseInt(nums[j]);
        }

        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(Objects.equals(nums[i], nums[j])){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        System.out.println(i+1);
    }
}
    //  题解
//    public int removeDuplicates(int[] nums) {
//        // 使用双指针
//        if(nums==null || nums.length == 1){
//            return nums.length;
//        }
//        int i = 0,j =1;
//        while(j<nums.length){
//            if(nums[i]==nums[j]){
//                j++;
//            }else{
//                i++;
//                nums[i]=nums[j];
//                j++;
//            }
//        }
//        return i+1;
//    }
//}
