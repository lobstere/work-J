package LeetCode;

import ac_nowcoder.F;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  获取数组的方式
//        String[] n = sc.nextLine().split(",");
//        int[] nums = new int[n.length];
//        for(int i=0;i<nums.length;i++){
//            nums[i]=Integer.parseInt(n[i]);
//        }
//        String s = sc.next();
//        char[] cs = s.toCharArray();
//        for(int i = 0;i < cs.length;i++){
//            cs[i] = Character.toLowerCase(cs[i]);
//        }
//        boolean flag = new String(cs).equals("lanqiao");
//        if(flag) System.out.println("yes");
//        else System.out.println("no");
//        sc.close();
//        int w = sc.nextInt();
//        int n = sc.nextInt();
//        if(w+n<=7){
//            System.out.println(w+n);
//        }
//        if(w+n>7){
//            System.out.println((w+n)%7==0?"1":(w+n)%7);
//        }
//        int count = 0;
//        int[] nums = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77};
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]*nums[j]>=2022){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//            Scanner scan = new Scanner(System.in);
//            LocalDate date = LocalDate.of(1900,1,1);
//            int count=0;
//            while(true){
//                if(date.getYear()==9999&&date.getMonth().getValue()==12&&date.getDayOfMonth()==31) break;
//                int y1 = date.getYear()%10;
//                int y2 = date.getYear()/10%10;
//                int y3 = date.getYear()/100%10;
//                int y4 = date.getYear()/1000;
//                int m1 = date.getMonth().getValue()%10;
//                int m2 = date.getMonth().getValue()/10;
//                int d1 = date.getDayOfMonth()%10;
//                int d2 = date.getDayOfMonth()/10;
//                if((y1+y2+y3+y4)==(m1+m2+d1+d2)) count++;
//                date = date.plusDays(1);
//            }
//            System.out.println(count);
//            sc.close();
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int t=sc.nextInt();
//        int[][] options=new int[t][4];
//        for (int i = 0; i < options.length; i++) {
//            for (int j = 0; j < options[i].length; j++) {
//                options[i][j]=sc.nextInt();
//            }
//        }
//        int[][] water=new int[n+1][m+1];
//        for (int i = 1; i < water.length; i++) {
//            for (int j = 1; j < water[1].length; j++) {
//                water[i][j]=1;
//            }
//        }
//        for (int i = 0; i < options.length; i++) {
//            operate(water,options[i][0],options[i][1],options[i][2],options[i][3]);
//        }
//        int count=0;
//        for (int i = 1; i < water.length; i++) {
//            for (int j = 1; j < water[i].length; j++) {
//                if (water[i][j]==1) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//    private static void operate(int[][] water, int r1, int c1, int r2, int c2) {
//        for (int i = r1; i <=r2; i++) {
//            for (int j = c1; j <=c2; j++) {
//                water[i][j]=0;
//            }
//        }
//    }
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=sc.nextInt();
            }
        }
//        hx(nums,n,m);
    }
//    static void hx(int[][] nums,int n,int m){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(nums[n][0]>nums[n+1][0]){
//                    System.out.println(nums[n][m]);
//                }
//            }
//        }
//    }
}
