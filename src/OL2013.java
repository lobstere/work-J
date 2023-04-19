import java.util.*;

public class OL2013 {
    public static void main(String[] args) {
        String s = "PUPPY";
        String s2 = "PUPPUP";
        int ans=0;
        if(s.length()>=1) ans+=1;
        if(s2.length()>=1) ans+=1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                if(s.substring(i,j).equals(s2.substring(i,j))){
                    ans+=1;
                }
            }
        }
        System.out.println(ans);
    }
}
