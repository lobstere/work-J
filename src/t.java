import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] a = new int[26];
        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i) - 'a']++;
        }
        char ch='a';
        int max=0;
        for(int i=0;i<26;i++) {
            if(a[i]>max) {
                max=a[i];
                ch=(char)('a'+i);
            }//因为是从前往后 所以相等时 无需考虑
        }
        System.out.println(ch);
        System.out.println(max);
//        int count = 0;
//        for(int i = 1;i<=2020;i++) {
//            String string = String.valueOf(i);
//
//            if (string.contains("2")) {
//                int n = string.length() - string.replaceAll("2","").length();
//                count = count+n;
//            }
//        }
//        System.out.println(count);
        sc.close();
    }
}
