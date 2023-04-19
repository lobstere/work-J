package lanqiao;

import java.util.*;
public class 子串分值和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        long res = 0;
        for(int i = 0;i < 26;i++){
            arr[i] = -1;
        }
        String s = sc.nextLine();
        String[] str = s.split("");
        int LeftIndex = str.length;
        for(int i = 0;i < str.length;i++){
            int rightIndex = arr[str[i].charAt(0)-97];
            res += (long)(i - rightIndex)*(LeftIndex - i);
            arr[str[i].charAt(0)-97] = i;
        }
        System.out.println(res);
    }
}
