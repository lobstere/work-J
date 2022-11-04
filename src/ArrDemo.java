import java.util.Arrays;
import java.util.Scanner;

public class ArrDemo {
    // 数组反转1 空间复杂度：1  内存复杂度:8
    public static int[] reverse1(int[] arr){
        int n=arr.length;//4个字节
        int temp;//4个字节
        for(int start=0,end=n-1;start<=end;start++,end--){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
    // 数组反转2 空间复杂度：n    内存复杂度:4n+24+4
    public static int[] reverse2(int[] arr){
        int n=arr.length;//4个字节
        int[] temp = new int[n];//n*4字节+数组自身开头信息24字节
        for(int i=n-1;i>=0;i--){
            temp[n-1-i]=arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr  = str.split(" ");
        int[] b = new int[arr.length];
        for(int j = 0; j<b.length;j++) {
            b[j] = Integer.parseInt(arr[j]);
        }
        // 只需执行其中之一
        System.out.println(Arrays.toString(reverse1(b)));
//        System.out.println(Arrays.toString(reverse2(b)));

    }
}
