package work_to;

public class ÖÊÊı²ğ·Ö {
    public static void main(String[] args) {
        int ans=0;
        for(int i=2;i<=2019;i++){
            if(check(i)){
                for(int j=2;j<=2019;j++){
                    if(check(j)){
                        if(i+j==2019){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int n){
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
