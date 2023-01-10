package lanqiao;
import java.util.*;

public class lan_16_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=null;
        int sum=0;
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                s = sc.next();
                char[] c1 = s.toCharArray();
                for(int j=0;j<c1.length;j++){
                    if(c1[j]>=10){
                        c1[j]='0';
                    }
                }
//                System.out.println(c1);
            }
//            for(char c : cs){
//                switch (c){
//                    case 'A':
//                        sum += 10;
//                        break;
//                    case 'B':
//                        sum+=11;
//                        break;
//                    case 'C':
//                        sum += 12;
//                        break;
//                    case 'D':
//                        sum+=13;
//                        break;
//                    case 'E':
//                        sum += 14;
//                        break;
//                    case 'F':
//                        sum+=15;
//                        break;
//                }
//            }
//            System.out.println(sum);
        }
    }
}
