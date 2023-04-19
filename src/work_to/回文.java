package work_to;

import java.util.Scanner;

public class 回文 {
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
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
