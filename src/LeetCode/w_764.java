package LeetCode;

public class w_764 {
}
//  题解
//class Solution {
//    // 上下左右一步
//    public int[][] delta_xy = {{0,1}, {0,-1}, {-1,0}, {1,0}};
//
//    public int orderOfLargestPlusSign(int n, int[][] mines) {
//        int[][] nums = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            Arrays.fill(nums[i], 1);
//        }
//        for (int[] i : mines) {
//            nums[i[0]][i[1]] = 0;
//        }
//        int result = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (nums[i][j] == 1) {
//                    result = Math.max(result, bfs(result, i, j, nums));
//                }
//            }
//        }
//        return result;
//    }
//
//    public int  bfs(int result, int row, int col, int[][] nums) {
//        int n = nums.length;
//        // 剪枝，当前坐标的最大可能答案都小于等于已经存在的答案，不用再遍历了！
//        int min = Math.min(n - col, Math.min(n - row, Math.min(row + 1, col + 1)));
//        if (result >= min) {
//            // 返回一个不可能成为答案的值即可！
//            return -1;
//        }
//        // 返回值，初始为1层
//        int level = 1;
//        // 扩张十字架
//        int count = 1;
//        int new_row, new_col;
//        while (true) {
//            // 上下左右
//            for (int i = 0; i < 4; i++) {
//                if (i == 0 || i == 1) {
//                    new_row = row + delta_xy[i][0];
//                    new_col = col + delta_xy[i][1] * count;
//                } else {
//                    new_row = row + delta_xy[i][0] * count;
//                    new_col = col + delta_xy[i][1];
//                }
//                // 无法扩张，返回
//                if (new_row < 0 || new_row >= n || new_col < 0 || new_col >=n || nums[new_row][new_col] == 0) {
//                    return level;
//                }
//            }
//            count++;
//            level++;
//        }
//    }
//}
