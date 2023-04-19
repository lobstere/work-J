package work_to;

import java.util.Scanner;

public class µ¥´Ê·ÖÎö {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "lanqiao";
        int max = 0;
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a[c-'a']++;
        }
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            if(a[i]>max) {
                max=a[i];
                ch=(char)('a'+i);
            }
        }
        System.out.println(ch);
        System.out.println(max);
        sc.close();
    }
}
