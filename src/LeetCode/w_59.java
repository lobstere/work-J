package LeetCode;

import java.util.Arrays;

public class w_59 {
    public static void main(String[] args) {
        //测试数据
        int n = 4;
        System.out.println(Arrays.deepToString(getMatrix(n)));
    }
    //主要代码
    public static int[][] getMatrix(int n) {
        int[][] arrs = new int[n][n];
        int a = 1, j = 0;
        while (a <= n * n) {
            for (int i = j; i < n - j; i++)
                arrs[j][i] = a++;
            for (int i = j + 1; i < n - j; i++)
                arrs[i][n - j - 1] = a++;
            for (int i = n - j - 2; i >= j; i--)
                arrs[n - j - 1][i] = a++;
            for (int i = n -j - 2; i > j; i--)
                arrs[i][j] = a++;
            j++;
        }
        return arrs;
    }
}
