package lanqiao;

import java.util.HashMap;
import java.util.Scanner;

public class ���� {
//    static HashMap<Character,Character> map = new HashMap<>();
    public static void main(String[] args) {
        HashMap<Character, Character> coadMap = new HashMap<Character, Character>();
        Scanner sc = new Scanner(System.in);
        // ��52���������벢�Ҵ���Map��
        for (int i = 0; i < 52; i++) {
            char c = sc.next().charAt(0);
            char tc = sc.next().charAt(0);
            coadMap.put(tc , c); //���ܵ�
        }
        String str = sc.next(); // ����Ҫת���������ַ���
        char [] ch = str.toCharArray(); // ���ַ���ת�����ַ�����
        // ͨ��ѭ����ÿ���ַ�����ת��
        for (char c : ch) {
            System.out.print(coadMap.get(c));
        }
    }
}
