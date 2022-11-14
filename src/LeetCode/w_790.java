package LeetCode;

public class w_790 {
}
//  题解
//class Solution {
//    public int numTilings(int N) {
//        if(N == 1)
//            return 1;
//        if(N == 2)
//            return 2;
//        if(N == 3)
//            return 5;
//        int n_3 = 1;
//        int n_2 = 2;
//        int n_1 = 5;
//        int temp = 0;
//        for (int i = 4; i <= N; i++) {
//            temp = (2 * n_1) % 1000000007  + n_3 % 1000000007 ;
//            n_3 = n_2;
//            n_2 = n_1;
//            n_1 = temp % 1000000007 ;
//        }
//
//        return n_1;
//    }
//}