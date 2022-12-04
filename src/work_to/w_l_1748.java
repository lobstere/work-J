package work_to;

public class w_l_1748 {
    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) count[num]++;
        int res = 0;
        for (int i = 1; i < 101; i++) {
            if (count[i] == 1) res += i;
        }
        return res;
    }
}
