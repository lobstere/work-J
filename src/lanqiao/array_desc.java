package lanqiao;
import java.util.*;

public class array_desc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
            if(nums[i]<0){
                nums[i]=0;
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}