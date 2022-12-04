package ac_nowcoder;

import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t=new int[n];
        int a = 0;
        while(sc.hasNext()){
            for(int i=0;i<t.length;i++){
                t[i]=Integer.parseInt(sc.next());
            }
            break;
        }
        for(int k=0;k<t.length;k++) {
            for (int j = t.length - 1; j > 0; j--) {
                System.out.println(j);
            }
//            System.out.println(a);
        }
    }
}
