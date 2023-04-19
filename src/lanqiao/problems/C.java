package lanqiao.problems;

import java.util.Arrays;
import java.util.Scanner;

public class C {

//    3
//            1 2 2
//            2 3 2
//            1 0 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=3,l=0,r=m-1;
        int[][] nums = new int[n][m];
        int[] n3 = new int[m];
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                nums[i][j]=sc.nextInt();
            }
        }
        int nu=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(nums[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(nums));
        sc.close();
    }
}
