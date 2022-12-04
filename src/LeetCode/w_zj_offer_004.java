package LeetCode;

public class w_zj_offer_004 {
}
//  题解
//class Solution {
//    //将整数的各个数位上的加起来，然后对3取余，若结果为0，则待求数字在该位上是0；
//    //若结果为1，则待求数字在该位上是1.
//    public int singleNumber(int[] nums) {
//        //java的int整型为32位
//        int[] arr=new int[32];
//        for(int num:nums){
//            for(int i=0;i<32;i++){
//                arr[i]+=(num>>(31-i))&1;
//            }
//        }
//        int res=0;
//        for(int i=0;i<32;i++){
//            res=(res<<1)+arr[i]%3;
//        }
//        return res;
//    }
//}