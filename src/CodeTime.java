import java.util.Scanner;

public class CodeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A1 = 0,A2 = 0,B1 = 0,B2 = 0;
        for(int i=1;i<=n;i++){
            A1=2*n+3;
            A2=2*n;
            B1=3*n+1;
            B2=3*n;
        }
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(B1);
        System.out.println(B2);
    }
}
