package ac_nowcoder.w12_9;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            long n = sc.nextLong();
            System.out.println((n+1)%998244353);
        }
    }
}
