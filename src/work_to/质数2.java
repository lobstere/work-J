package work_to;

import java.util.Scanner;

public class ÖÊÊı2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.MAX_VALUE;
        long ans = 0;
        for (int i = 2; i <= n; i++) {
            if (!isPrime(i)) {
//                System.out.print(i + " ");
                ans++;
            }
            if(ans==100002){
                System.out.printf("\n%d", ans);
                break;
            }
        }
        sc.close();
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
