package lanqiao;

public class ´¿ÖÊÊı {
    public static void main(String[] args) {
        int ans=0;
        for(int i=2;i<=37;i++){
            if(isPrme(i)){
                System.out.print(i+" ");
                ans++;
            }
        }
        System.out.println("\n"+ans);
    }
    public static boolean isPrme(int n){
        int i=2;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }else{
                n=n/10;
            }
            i++;
        }
        if(n==1) return false;
        return true;
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
    }
}
