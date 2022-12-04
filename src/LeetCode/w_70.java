package LeetCode;

public class w_70 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
