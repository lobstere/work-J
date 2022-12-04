package LeetCode;

import java.util.Scanner;

public class w_387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  获取数组的方式
        String n = sc.nextLine();
        System.out.println(firstUniqChar(n));
    }
    public static int firstUniqChar(String n){
        char[] nc = n.toCharArray();
        char[] s = new char[24];
        for(char s2:nc){
            s[s2 - 'a']++;
        }
        for(int i=0;i<nc.length;i++){
            if(s[nc[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
