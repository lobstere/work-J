package LeetCode;

public class w_704 {
    //测试数据
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(inNums(nums,target));
    }
    //主要代码
    public static int inNums(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
