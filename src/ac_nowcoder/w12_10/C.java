package ac_nowcoder.w12_10;

import java.util.Scanner;

public class C{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int t = sc.nextInt();
//            for(int i = 1; i <= t; i++){
//                int k = sc.nextInt();
//                String s = Integer.toBinaryString(k);
//                long sum = 0;
//                long count = 0;
//                for(int j = 0; j <= s.length() - 1; j++){
//                    if(s.charAt(j) == '1'){
//                        count = s.length() - 1 - j;
//                        sum += Math.pow(3, count);
//                    }
//                }
//                System.out.println("Case #" + i + ": " + sum);
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t=sc.nextInt();
            for(int i=1;i<=t;i++){
                int k= sc.nextInt();
                String s = Integer.toBinaryString(k);
                long sum = 0;
                long count = 0;
                for(int j=0;j<=s.length()-1;j++){
                    if(s.charAt(j)=='1'){
                        count=s.length()-1-j;
                        sum +=Math.pow(3,count);
                    }
                }
                System.out.println("Case #"+i+":"+sum );
            }
        }
    }
}
