import java.util.Arrays;
import java.util.Scanner;

public class w_s_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
//        int n = scan.nextInt();
//        int[] nums = new int[n];
//        for(int i=0;i<nums.length;i++){
//            nums[i]=scan.nextInt();
//        }
//        Arrays.sort(nums);
//        int pos=0;
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[pos]==nums[pos+1]){
//                nums[pos]=-1;
//            }
//            pos++;
//        }
//        int ans = nums.length;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==-1){
//                ans -=1;
//            }
//        }
        int k = scan.nextInt();
        int[] nums = new int[k];
        for(int i=0;i<nums.length;i++){
            nums[i]= scan.nextInt();
        }
        System.out.println(isPrme(nums));
    }
    public static boolean isPrme(int[] n){
        for(int i=2;i<n.length;i++)
            if(n[i]<=1) return false;
            else
                if(n[i]%i==0) return false;
        return true;
    }
}
