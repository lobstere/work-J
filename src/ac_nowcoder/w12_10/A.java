package ac_nowcoder.w12_10;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c=0;
        if(n>2){
            n+=1;
        }
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] nums = new int[]{a,b};
            if(nums[0]>nums[1]){
                c=1;
            }else{
                c=2;
            }
        }
    }
}
