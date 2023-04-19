package lanqiao;

import java.util.*;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        long[] fib = new long[61];
//        fib[1]=1;
//        fib[2]=1;
//        for (int i = 3; i < fib.length; i++) {
//            fib[i]=fib[i-1]+fib[i-2];
//        }
//        for (int i = 1; i < fib.length; i++) {
//            System.out.printf("fib第%02d项:",i);
//            if(fib[i]%3==0) System.out.printf("\t被三整除");
//            if(fib[i]%4==0) System.out.printf("\t被四整除");
//            if(fib[i]%12==0) System.out.printf("\t被12整除\n");
//            System.out.println();
//        }
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n%12==0) System.out.println("整除12");
            else if(n%4==0)  System.out.println("整除3");
            else if(n%6==0)  System.out.println("整除4");
            else System.out.println("No");
        }
        sc.close();
    }
}
