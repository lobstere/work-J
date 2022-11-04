public class SumNum {
    public static void main(String[] args) {
        //  n
        int sum = 0;
        int n = 100;
        int i,j;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        //  n^2
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                sum += i;
            }
        }
        System.out.println(sum);
        //  n^2
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        //  1
        i=n+2;
        System.out.println(i);


        i=0;


    }
}
