package lanqiao.problems;

import java.util.Arrays;
import java.util.Scanner;

public class 二十四点 {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[4];
        for(int i=0;i<n;i++){
            for(int j=0;j<nums.length;j++){
                nums[j]=sc.nextInt();
            }
//            int tmp = checks(nums[0],nums[1],nums[2],nums[3]);
            System.out.println(checks(nums[0],nums[1],nums[2],nums[3]));
        }
        System.out.println(Arrays.toString(nums));
    }
    public static int checks(int a,int b,int c,int d){
//        ((A*K)-J)*Q等价于((1*13)-11)*12=24
        int num = ((a*b)-c)*d;
//        if(num>=24){
//            return 24;
//        }
//        return num>=24?num:checks(b,c,d,a);
        if(num>=24) {
            return 24;
        }
        if(num==0) {
            return num;
        }else {
            return checks(b,c,d,a);
        }

    }
}
