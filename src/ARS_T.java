public class ARS_T {
    static int[] a = new int[26];
    public static void main(String[] args) {
        String s = "lanqiao";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            max = Math.max(max,a[i]);
        }
        System.out.println();
        System.out.println(max);
    }
}
