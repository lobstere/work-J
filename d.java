import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a<b&&a<c?a:b<a&&b<c?b:c<a&&c<b?c:"");
            break;
        }
    }
}
