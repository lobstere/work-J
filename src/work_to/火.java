package work_to;

import java.util.Scanner;

public class »ð {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] d=new int[100003];
        int u,v;
        for(int i = 1;i<=n-1;i++){
            u=sc.nextInt();
            v=sc.nextInt();
            d[u]++;
            d[v]++;
        }
        int ans = 0;
        for(int i = 1; i <= n;i++){
            if(d[i]>=2){
                ans+=(d[i])*(d[i]-1)/2;
            }
        }
        System.out.println(ans);
    }
}
