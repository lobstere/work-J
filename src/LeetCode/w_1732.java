package LeetCode;

//import java.util.Arrays;
import java.util.Scanner;

public class w_1732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  获取数组
        System.out.print("gain =");
        String gainse = sc.nextLine();
        String[] gains = gainse.split(" ");
        int[] gain = new int[gains.length];
        int altitude = 0;
        int min = 0;
        for (int j = 0; j < gain.length; j++) {
            gain[j] = Integer.parseInt(gains[j]);
        }
        //  列出最大的数
        for (int i : gain) {
            altitude += i;
            min = Math.max(altitude, min);
        }
    }
    //  题解
//    public int largestAltitude(int[] gain) {
//        int altitude = 0, min = 0;
//        for (int i : gain) {
//            altitude += i;
//            min = Math.max(altitude, min);
//        }
//        return min;
//    }
}
