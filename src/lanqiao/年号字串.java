package lanqiao;

public class ÄêºÅ×Ö´® {
    public static void main(String[] args) {
        int n = 2019;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n--;
            sb.append((char)(n%26+'A'));
            n/=26;
        }
        System.out.println(sb.reverse().toString());
    }
}
