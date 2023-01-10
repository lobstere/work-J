package ac_nowcoder.w12_10;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            for (int j=0;j<m;j++) {
                a = sc.nextInt();
                int min = 0;
                int max = 0;
                if (a == 2) {
                    b = sc.nextInt() - 1;
                    c = sc.nextInt() - 1;
                    max = arr[b];
                    for (int i = b; i < c; i++) {
                        if (max < arr[i]) {
                            max = arr[i];
                        }
                    }
                    min = arr[b];
                    for (int i = b; i < c; i++) {
                        if (min > arr[i]) {
                            if(arr[i] ==0){
                                min = arr[0];
                            }else{
                                min = arr[i];
                            }
                        }
                    }
                    System.out.println(min + " " + max);
                }else if(a==1){
                    d = sc.nextInt()-1;
                    int[] newArr = new int[arr.length-1];
                    int h = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if(i==d){
                            arr[d]=0;
                        }
                        if (arr[i] != 0) {
                            newArr[h] = arr[i];
                            h++;
                        }
                    }
                    arr = newArr;
                }
            }
        }
        while (sc.hasNextInt()) {}
    }
}
