import java.util.Arrays;
import java.util.Scanner;

public class ArrDemo {
    public static int[] reverse1(int[] arr){
        int n=arr.length;
        int temp;
        for(int start=0,end=n-1;start<=end;start++,end--){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr  = str.split(" ");
        int[] b = new int[arr.length];
        for(int j = 0; j<b.length;j++) {
            b[j] = Integer.parseInt(arr[j]);
        }
        System.out.println(Arrays.toString(reverse1(b)));
    }
}
