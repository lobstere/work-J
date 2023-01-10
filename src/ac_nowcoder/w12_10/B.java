package ac_nowcoder.w12_10;

import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                if(sc.nextInt() != 0 && j < i){
                    System.out.println("NO");
                }
            }
        }
        System.out.println("YES");
    }
}
