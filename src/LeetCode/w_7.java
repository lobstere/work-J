package LeetCode;

import java.util.Scanner;

public class w_7 {
    //  题解
    //  public int reverse(int x) {
    //        long n = 0;
    //        while(x != 0) {
    //            n = n*10 + x%10;
    //            x = x/10;
    //        }
    //        return (int)n==n? (int)n:0;
    //    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        System.out.println((int)n==n? (int)n:0);
    }
}
