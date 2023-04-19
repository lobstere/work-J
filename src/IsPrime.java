import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int i = 2;
        for (;i <= Integer.MAX_VALUE;++i){
            if(isPrime(i)){
                ans++;
            }
            if(ans == 100002){
                break;
            }
        }
        System.out.println(i);
        sc.close();
    }
    public static boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
        for(int i=2;i<=n/i;++i){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
