import java.util.*;

public class cjfx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //在此输入您的代码...
        int n = sc.nextInt();
        int[] nums = new int[n];
        int max=0,min=0,sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        double avg = sum/n;
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f",avg);
    }
}
