import java.util.*;
public class Main {
    //判断一个数是否是质数（素数）
    public static void isPrimeNumber(int num){
        int temp = 1;
        Vector<Integer> v = new Vector<>();
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                temp = 0;
                v.add(i);
                while(num % i ==0){
                    num = num/i;
                }
                if(num == 1) break;
            }
        }
        if(temp == 1){
            System.out.println("isprime");
            System.out.println(num);
        }else{
            System.out.println("noprime");
            for(int i = 0; i < v.size(); i++){
                System.out.print(v.get(i) + " ");
            }
            if(num == 1)
                System.out.println("");
            else
                System.out.println(num);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            isPrimeNumber(arr[i]);
        }
    }
}
