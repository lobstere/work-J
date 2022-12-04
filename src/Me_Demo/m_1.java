package work;

import java.util.Arrays;
import java.util.Scanner;

public class m_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] nums = new int[s.length];
        int[] nums2 = new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        for(int i=nums2.length-1;i>=0;i--){
            for(int j=0;j<nums2.length;j++){
                nums2[i]=Integer.parseInt(s[n]);
            }
            n++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }
}
