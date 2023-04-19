package work_to;

import java.util.Scanner;
import java.io.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 找素数 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //在此输入您的代码...
         long a = scan.nextInt();
         long b = scan.nextInt();
//        long a = bf.read();
//        long b = Integer.parseInt(bf.readLine());
        long ans=0;
        for(long i=a;i<=b;i++){
            if(isPrime(i)) ans++;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(ans);
        scan.close();
    }
    public static boolean isPrime(long n){
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}