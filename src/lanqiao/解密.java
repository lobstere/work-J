package lanqiao;

import java.util.HashMap;
import java.util.Scanner;

public class 解密 {
//    static HashMap<Character,Character> map = new HashMap<>();
    public static void main(String[] args) {
        HashMap<Character, Character> coadMap = new HashMap<Character, Character>();
        Scanner sc = new Scanner(System.in);
        // 将52组密码输入并且存入Map中
        for (int i = 0; i < 52; i++) {
            char c = sc.next().charAt(0);
            char tc = sc.next().charAt(0);
            coadMap.put(tc , c); //解密的
        }
        String str = sc.next(); // 输入要转换的密码字符串
        char [] ch = str.toCharArray(); // 将字符串转换成字符数组
        // 通过循环将每个字符进行转换
        for (char c : ch) {
            System.out.print(coadMap.get(c));
        }
    }
}
