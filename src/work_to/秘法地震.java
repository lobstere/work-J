package work_to;

import java.util.*;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class �ط����� {
    static int[][] nums=new int[1005][1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            String line = sc.next();
            for(int j=1;j<=m;j++){
                nums[i][j]=line.charAt(j - 1) -'0';
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                nums[i][j]+=nums[i -1][j]+nums[i][j-1]-nums[i-1][j-1];
            }
        }
        for(int i=k;i<=n;i++){
            for(int j=k;j<=m;j++){
                int t=nums[i][j]-nums[i -k][j]-nums[i][j-k]+nums[i-k][j-k];
                if(t>0) sum++;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}