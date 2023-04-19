import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String M = in.next();
        Long inttemp,inttem;
        String hexInt;
        boolean bool = true,isyes=false;
        inttemp = Long.parseLong(M,N);
        inttem = Long.parseLong(new String(new StringBuffer(M).reverse()),N);
        for (int i = 0; i < 30; i++) {
            bool = true;
            inttemp +=inttem;
            hexInt = Long.toString(inttemp,N);
            inttem = Long.parseLong(new String(new StringBuffer(hexInt).reverse()),N);
            for (int j = 0; j < hexInt.length(); j++) {
                if(hexInt.charAt(j)!=hexInt.charAt(hexInt.length()-1-j)){
                    bool = false;
                    break;
                }
            }
            if(bool) {
                isyes = true;
                System.out.println("STEP="+(i+1));
                break;
            }

        }
        if(!isyes)
            System.out.println("Impossible!");
    }
}
