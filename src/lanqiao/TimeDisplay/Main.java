package lanqiao.TimeDisplay;

import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ml = sc.nextLong();
        Date date = new Date(ml);
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        System.out.print(ft.format(date));
        sc.close();
    }
}
