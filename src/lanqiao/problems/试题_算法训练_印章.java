package lanqiao.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class  ‘Ã‚_À„∑®—µ¡∑_”°’¬ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble(),b=sc.nextDouble();
        BigInteger n = new BigInteger("1");
        for(int i=1;i<=100;i++){
            n=n.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n);
//        System.out.printf("%.4f",a/b);
    }
}
