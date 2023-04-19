import java.util.*;

public class wk_a {
    public static void main(String[] args) {
        int[] Ls = new int[26];
        String s = "ababc";
        long res = 0;
        for(int i = 0;i < 26;i++){
            Ls[i] = -1;
        }
        String[] str = s.split("");
        int LeftIndex = str.length;
        for(int i = 0;i < str.length;i++){
            int rightIndex = Ls[str[i].charAt(0)-97];
            res += (long)(i - rightIndex)*(LeftIndex - i);
//            System.out.println(res);
            Ls[str[i].charAt(0)-97] = i;
            System.out.println(str[i]);
        }
        System.out.println(res);
    }
}
