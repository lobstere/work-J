package work_to;

public class 约数个数 {
    public static void main(String[] args) {
        int n =1200000,ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                ans+=1;
                System.out.println(ans);
            }
        }
    }
}
