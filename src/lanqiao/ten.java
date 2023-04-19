package lanqiao;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m-1;j++){
                if(nums[i][j]<nums[i][j+1]){
                    count=j;
                }
            }
            System.out.println(count);
        }
    }
}
