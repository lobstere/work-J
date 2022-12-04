package work;

import java.util.Scanner;

public class m_L_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=getValue(s.charAt(i));
        }
        return res;
    }
    public static int getValue(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D': return 500;
            case 'M':return 1000;
            case 'a':return 4;
            case 'b':return 9;
            case 'c': return 40;
            case 'd': return 90;
            case 'e': return 400;
            case 'f': return 900;
        }
        return 0;
    }
}
