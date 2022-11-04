public class SumNum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        int i;
        int j;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                sum += i;
            }
        }
        System.out.println(sum);
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                sum++;
            }
        }
    }
}
