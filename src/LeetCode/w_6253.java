package LeetCode;

import java.util.Arrays;

public class w_6253 {
    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(sentence));
    }
    public static boolean isCircularSentence(String s) {
        char[] array = s.toCharArray();
        int n = array.length;
        if (array[n - 1] != array[0]) return false;
        for (int i = 0; i + 2 < n; ++i) {
            if (array[i + 1] == ' ') {
                if (array[i + 2] != array[i]) return false;
            }
        }
        return true;
    }
}
