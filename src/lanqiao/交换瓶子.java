package lanqiao;

import java.util.*;

public class ����ƿ�� {
    public static void main(String[] args) {
        //���ڽ���ƿ�ӵ�ʱ��û�����ƣ����ʹ��̰�ģ�ÿ�ν���������ǰ�����ŵ���Ӧ��λ�ã���ʹ��С������ʱ
        Scanner scan = new Scanner(System.in);
        //�ڴ��������Ĵ���...
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        //�������������ǰ��i��ƿ�ӱ�Ų���i���ͽ�ƿ��Ϊi��ƿ�ӽ�������
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
