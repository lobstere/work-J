package ac_nowcoder;

import java.util.Scanner;

public class 集合中的质数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt(),ans=0,max=0,count=0;
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++) nums[i] = sc.nextInt();
        sc.close();
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<=m;j++){
                if(i%nums[i]==0) ans++;
            }
        }
        System.out.println(max);
    }
}
