package LeetCode;

public class w_58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(LengthOfString(s));
    }
    public static int LengthOfString(String s){
        String[] ns = s.split(" ");
        int n = ns[ns.length-1].length();
        return n;
    }
}
