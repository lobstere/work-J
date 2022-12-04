package work;

import java.util.Arrays;
import java.util.Scanner;

public class m_L_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n= sc.nextLine().split(",");
        int[] nums = new int[n.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(n[i]);
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int []arr2=new int[nums.length+1];
        if(arr[0] == 9){
            arr2[0]=Integer.parseInt("1");
            arr2[1]=Integer.parseInt("0");
            System.out.println(Arrays.toString(arr2));
        }else{
            int j=nums[nums.length-1]+1;
            arr[nums.length-1]=j;
            System.out.println(Arrays.toString(arr));
        }
    }
}
