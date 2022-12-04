package Me_Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class m_L_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  获取数组的方式
        System.out.print("数组：");
        String[] n = sc.nextLine().split(",");
        int[] nums = new int[n.length];
        System.out.print("目标值：");
        int ns = sc.nextInt();
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(n[i]);
        }
        System.out.println(Arrays.toString(rsi(nums, ns)));
    }
    public static int[] rsi(int[] nums,int ns){
        int[] arr= new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = ns - nums[i];
            if(map.containsKey(temp)){
                arr[1] = i;
                arr[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
