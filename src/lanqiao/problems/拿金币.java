package lanqiao.problems;

import java.util.Arrays;
import java.util.Scanner;

public class 拿金币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max=0,sum=0;
        int[][] nums = new int[n][n];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j>0){  //判断上边界
                    nums[i][j]=nums[i][j]+nums[i][j-1];
                }
                else if(j==0&&i>0){ //判断左边界
                    nums[i][j]=nums[i][j]+nums[i-1][j];
                }
                else if(i>0){ //判断再中间，必选判断
                    nums[i][j]=nums[i][j]+Math.max(nums[i-1][j],nums[i][j-1]);
                }
            }
        }
        System.out.println(nums[n-1][n-1]);//输出最后一个值
    }
}
