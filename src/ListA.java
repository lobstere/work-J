import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class ListA {
//    public static void main(String[] args) {
//        int[] nums={1,3,3,4,5,6};
//        int target= 9;
//        // System.out.print(Inthenum(nums,target));
//        System.out.print(Arrays.toString(twoSum(nums, target)));
//    }
//    public static int Inthenum(int[] nums,int target){
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static int[] twoSum(int[] nums, int target){
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]+nums[i+1]==target){
//                int[] Nnums = {nums[i],nums[i+1]};
//                return Nnums;
//            }
//        }
//        return null;
//    }

//        public static void main(String[] args) {
//            int count=0;
//            for(int i=1;i<=100;i++){
//                for(int j=1;j<=i;j++){
//                    for(int k=1;k<=j;k++){
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);
//        }


//    public static void main(String[] args) {
//        BigInteger sum = new BigInteger("0");
//        BigInteger two = new BigInteger("2");
//        for(int i=0;i<=64;i++){
//            sum=sum.add(two.pow(i));
//        }
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger mul= BigInteger.valueOf(0);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int i=1;
        int pos = 0;
        int j=1;
        while(pos<ar.length){
            for(;i<ar.length;i++){
                BigInteger li1 = BigInteger.valueOf(ar[pos]);
                BigInteger li2 = BigInteger.valueOf(ar[i]);
                mul=li1.multiply(li2);
                sum = sum.add(mul);
            }
            pos++;
            j++;
            i=j;
        }
        System.out.println();
        System.out.println(sum);
        scan.close();
    }
}