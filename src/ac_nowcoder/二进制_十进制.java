package ac_nowcoder;

import java.util.Scanner;

public class ������_ʮ���� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        System.out.println(Long.parseLong(Long.toString(a, 2))+Long.parseLong(Long.toString(b, 2)));
    }
}
