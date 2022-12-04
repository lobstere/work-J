package work_to;

public class w_l_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(strint(nums));
    }
    public static int strint(int[] nums){
        int i=0,j=1;
        while (j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }

}
