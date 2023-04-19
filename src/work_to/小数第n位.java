package work_to;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 小数第n位 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //在此输入您的代码...
        String n1 = bf.readLine();
        int n = Integer.parseInt(n1);
//        int n = sc.nextInt();
        double max = Math.sqrt(n);
        for(int a=0;a<=max;a++){
            for(int b=a;b<=max;b++){
                for(int c=b;c<=max;c++){
                    for(int d=c;d<=max;d++){
                        if (a * a + b * b + c * c + d * d == n) {
                            System.out.println(a + " " + b + " " + c + " " + d);
                            return;
                        }
                    }
                }
            }
        }
        bf.close();
    }
}
