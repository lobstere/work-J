package ac_nowcoder;

import java.util.Scanner;

public class 标题统计 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') ans++;
        }
        System.out.println(ans);
        in.close();
    }
}
