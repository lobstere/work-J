package lanqiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 问题描述
 * 　　小蓝负责一块区域的信号塔安装，整块区域是一个长方形区域，建立坐标轴后，西南角坐标为 (0, 0)， 东南角坐标为 (W, 0)， 西北角坐标为 (0, H)， 东北角坐标为 (W, H)。其中 W, H 都是整数。
 * 　　他在 n 个位置设置了信号塔，每个信号塔可以覆盖以自己为圆心，半径为 R 的圆形（包括边缘）。
 * 　　为了对信号覆盖的情况进行检查，小蓝打算在区域内的所有横纵坐标为整数的点进行测试，检查信号状态。其中横坐标范围为 0 到 W，纵坐标范围为 0 到 H，总共测试 (W+1) * (H+1) 个点。
 * 　　给定信号塔的位置，请问这 (W+1)*(H+1) 个点中有多少个点被信号覆盖。
 * 输入格式
 * 　　输入第一行包含四个整数 W, H, n, R，相邻整数之间使用一个空格分隔。
 * 　　接下来 n 行，每行包含两个整数 x, y，表示一个信号塔的坐标。信号塔可能重合，表示两个信号发射器装在了同一个位置。
 * 输出格式
 * 　　输出一行包含一个整数，表示答案。
 * 样例输入
 * 10 10 2 5
 * 0 0
 * 7 0
 * 样例输出
 * 57
 * 评测用例规模与约定
 * 　　对于所有评测用例，1 <= W, H <= 100，1 <= n <= 100, 1 <= R <= 100, 0 <= x <= W, 0 <= y <= H
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i <= w; i++) {
            for (int j = 0; j <= h; j++) {
                for (int k = 0; k < n; k++) {
                    int dis = (i - arr[k][0]) * (i - arr[k][0]) + (j - arr[k][1]) * (j - arr[k][1]);
                    if (dis <= r * r) {
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}