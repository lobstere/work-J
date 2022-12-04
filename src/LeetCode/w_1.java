package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class w_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        // // 双重循环 循环极限为(n^2-n)/2
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = nums.length - 1; j > i; j --){
        //         if(nums[i]+nums[j] == target){
        //            indexs[0] = i;
        //            indexs[1] = j;
        //            return indexs;
        //         }
        //     }
        // }
        return indexs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nums = ");
        String str = sc.nextLine();
        System.out.print("target =");
        int target = sc.nextInt();
        String[] arr  = str.split(",");
        int[] b = new int[arr.length];
        for(int j = 0; j<b.length;j++) {
            b[j] = Integer.parseInt(arr[j]);
        }
//        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(twoSum(b, target)));
    }
}
