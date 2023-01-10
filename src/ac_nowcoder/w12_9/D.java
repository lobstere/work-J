package ac_nowcoder.w12_9;

import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int i=1,j=0;i<=a&&j<=b;){
                System.out.print(i*n+j*n+" ");
                break;
            }
            if((a*n+b*n)>32767){
                long c = a*n+b*n;
                System.out.println(c);
            }else{
                System.out.print(a*n+b*n);
            }
        }
    }
}
