package work_to;

public class ËØÊı {
    public static void main(String[] args) {
        int n=Integer.MAX_VALUE;
        long ans=0;
        for(int i=2;i<=n;i++){
            if(!isPrime(n)) ans++;
            if(ans==100002) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
