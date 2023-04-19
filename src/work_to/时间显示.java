package work_to;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class  ±º‰œ‘ æ {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long ml = scan.nextLong();
        Date date = new Date(ml);
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        String s = bf.readLine();
        System.out.println(ft.format(date));
        System.out.println(s);
        scan.close();
    }
}
