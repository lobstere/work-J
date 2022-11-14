package work;

import java.util.Scanner;

public class m_L_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=0;
        int tmp =n;
        if(n<0){
            System.out.println("请输入要一个正整数。");
        }else{
            while (tmp!=0){
                a=tmp%10;
                b=b*10+a;
                tmp=tmp/10;
            }
        }
        System.out.println(b==n?"此数为回文数。":"此数不为回文数。");
    }
}
