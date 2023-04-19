package lanqiao;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * ��������
 * ����С������һ��������ź�����װ������������һ�����������򣬽�������������Ͻ�����Ϊ (0, 0)�� ���Ͻ�����Ϊ (W, 0)�� ����������Ϊ (0, H)�� ����������Ϊ (W, H)������ W, H ����������
 * �������� n ��λ���������ź�����ÿ���ź������Ը������Լ�ΪԲ�ģ��뾶Ϊ R ��Բ�Σ�������Ե����
 * ����Ϊ�˶��źŸ��ǵ�������м�飬С�������������ڵ����к�������Ϊ�����ĵ���в��ԣ�����ź�״̬�����к����귶ΧΪ 0 �� W�������귶ΧΪ 0 �� H���ܹ����� (W+1) * (H+1) ���㡣
 * ���������ź�����λ�ã������� (W+1)*(H+1) �������ж��ٸ��㱻�źŸ��ǡ�
 * �����ʽ
 * ���������һ�а����ĸ����� W, H, n, R����������֮��ʹ��һ���ո�ָ���
 * ���������� n �У�ÿ�а����������� x, y����ʾһ���ź��������ꡣ�ź��������غϣ���ʾ�����źŷ�����װ����ͬһ��λ�á�
 * �����ʽ
 * �������һ�а���һ����������ʾ�𰸡�
 * ��������
 * 10 10 2 5
 * 0 0
 * 7 0
 * �������
 * 57
 * ����������ģ��Լ��
 * ����������������������1 <= W, H <= 100��1 <= n <= 100, 1 <= R <= 100, 0 <= x <= W, 0 <= y <= H
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