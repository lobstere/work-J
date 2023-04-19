package work_to;

import java.util.*;

public class √‘ŒÌ…≠¡÷ {
    private static int mod = 2333;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[][] metrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            metrix[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] dp = new int[m + 1][n + 1];
        dp[m - 1][0] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (metrix[i][j - 1] == 1) dp[i][j] = 0;
                else dp[i][j] = (dp[i][j - 1] + dp[i + 1][j]) % mod;
            }
        }
        System.out.print(dp[0][n]);
    }
}