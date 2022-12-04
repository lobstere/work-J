package LeetCode;

public class w_2236 {
}
//  题解
//class Solution {
//    public boolean checkTree(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//
//        int res = root.val;
//        if (root.left != null) {
//            res -= root.left.val;
//        }
//
//        if (root.right != null) {
//            res -= root.right.val;
//        }
//
//        return res == 0;
//    }
//}