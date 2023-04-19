package lanqiao;

import java.util.*;

public class 交换瓶子 {
    public static void main(String[] args) {
        //由于交换瓶子的时候没有限制，因此使用贪心，每次交换都将当前的数放到对应的位置，即使最小交换此时
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        //从左向右如果当前第i个瓶子编号不是i，就将瓶子为i的瓶子交换过来
        for (int i = 1; i <= n; i++) {
            if (arr[i] != i) {
                int j = 1;
                for (j = i; j <= n; j++) {
                    if (arr[j] == i) {
                        break;
                    }
                }
                int temp = arr[i];
                arr[i] = i;
                arr[j] = temp;
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
