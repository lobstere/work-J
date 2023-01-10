package LeetCode;

public class w_209 {
    public static void main(String[] args) {
        //测试数据
        int target =7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minarr(target,nums));
    }
    //主要代码
    public static int minarr(int target,int[] nums){
        int i = 0;
        int sum = 0;
        int lens = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                lens = lens == 0 ? j - i + 1 : Math.min(lens, j - i + 1);
                sum -= nums[i++];
            }
        }
        return lens;
    }
}