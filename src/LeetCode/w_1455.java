package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class w_1455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  获取字符串
        System.out.print("sentence = ");
        String st = sc.nextLine();
        System.out.print("searchWord = ");
        String sw = sc.nextLine();
        boolean flag=false;
        String[] st2 = st.split(" ");
        //  打印一次字符串
        System.out.println(Arrays.toString(st2));
        //  查询第一个字符串中是否拥有第二个字符串中的字符。
        for (int i = 0; i < st2.length; i++) {
            if (st2[i].startsWith(sw)) {
                System.out.println(i+1);
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(-1);
        }
    }
    //  题解
//    public int isPrefixOfWord(String sentence, String searchWord) {
//        String[] words = sentence.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].startsWith(searchWord)) {
//                return i + 1;
//            }
//        }
//        return -1;
//    }
}
