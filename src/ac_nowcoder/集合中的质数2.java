package ac_nowcoder;

import java.util.Scanner;

public class 集合中的质数2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=sc.nextLong();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        sc.close();
        long ans=0;
        for (int i = 1; i < (1<<n); i++) {
            long tmp=m,flag=0;
            for (int j = 0; j < n; j++) {
                if(((i>>j)&1)!=0){
                    flag++;
                    tmp/=nums[j];
                }
            }
            if((flag&1)!=0){
                ans+=tmp;
            }else {
                ans-=tmp;
            }
        }
        System.out.println(ans);
    }
}