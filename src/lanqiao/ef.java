package lanqiao;

import java.util.*;

public class ef {
    public static void main(String[] args) {
        int[] nums = {55,96,20,8,43,28,13,35,60,79};
        int target = 66;
        Arrays.sort(nums);
        System.out.println(binarySearch(nums,target,0,nums.length-1));

    }
    public static int binarySearch(int[] nums,int key,int left,int right){
        while (left<=right){
            int mid = (left+right)/2;
            if(key==nums[mid]) return mid;
            else if(key<nums[mid]) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}
