package ac_nowcoder.w12_9;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        while (sc.hasNextInt()) { // 注意 while 处理多个 case
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int n = sc.nextInt();
            int[] nums= new int[]{a,b,c};
            int e = nums[nums.length - 1];
            int h = 0;
            for (int i = 0; i < nums.length; i++) {
                int f = e * 2 - nums[i];
                e = f;
                h++;
                if (e >= n) {
                    System.out.println(h);
                }
            }
        }
    }
}
//    public static int inttojump(int[] nums,int n){
//        int d = nums.length-1;
//        int e = nums[d];
//        int f = 0;
//        for(int i=0;i<nums.length;i++){
//            f=e*2-nums[i];
//            e=f;
//            if(e>n){
//                return e;
//            }
//        }
//        return 0;
//    }
//}
