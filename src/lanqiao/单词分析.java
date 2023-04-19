package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class µ¥´Ê·ÖÎö {
    static Scanner sc = new Scanner(System.in);
        static int[] a = new int[26];
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int max = 0;
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                a[c-'a']++;
            }
            char ch = 'a';
            for(int i=0;i<26;i++) {
                if(a[i]>max) {
                    max=a[i];
                    ch=(char)('a'+i);
                }
            }
            System.out.println(ch);
            System.out.println(max);
        }
}
