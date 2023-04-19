package ac_nowcoder;

import java.io.*;
import java.util.*;

public class ÐòÁÐÎÊÌâ {
    static long mod = 998244353;

    static long pow(long a, long q) {
        long ans = 1;
        a %= mod;
        while (q > 0) {
            if (q % 2 == 1l) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            q >>= 1l;
        }
        return ans;
    }
    public static void main(String[] age) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), q = sc.nextLong();
            if (q >= n) {
                System.out.println(0);
            } else if (q <= -n) {
                long x = pow(2, n) - 1l;
                System.out.println((x * x) % mod);
            } else if (q >= 0) {
                long x = pow(2, n - q);
                System.out.println(((n - q - 1) % mod * x + 1l) % mod);
            } else {
                long x = pow(2, n - q);
                long y = pow(2, n + 1);
                System.out.println(((n + q + 1) % mod * x - y + 1) % mod);
            }
        }
    }
}