import java.util.*;

public class Hello {
    static Scanner sc = new Scanner(System.in);
    public static int[] runningsum(int[] nums,int c) {
        for(int i=1;i<c;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        System.out.println("请输入数组，并以回车结束：");
        String b = sc.nextLine();
        int c = Integer.parseInt(String.valueOf(b.split(" ").length));
        for(int i = 0; i < c; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningsum(a,c)));
        System.out.println("c:"+c);
    }
}
