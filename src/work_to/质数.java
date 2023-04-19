package work_to;


public class ÖÊÊı {
    public static void main(String[] args) {
        int ans = 1,i=2;
        while(ans < 2019) {
            i++;
            if(isPrime(i)) {
                ans++;
            }
        }
        System.out.println(i);
    }
    public static boolean isPrime(int num) {
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
