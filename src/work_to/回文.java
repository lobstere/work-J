package work_to;

import java.util.Scanner;

public class ���� {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int hw = scan.nextInt();
        int y = 0;
        int h = hw;
        while (hw > 0) {
            y = y * 10 + hw % 10;
            hw = hw / 10;
        }
        if (y == h) {
            System.out.println("�ǻ�����");
        } else {
            System.out.println("���ǻ�����");
        }
    }
}
