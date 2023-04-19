package LanQaiao_QB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÊıµÄÃİ´Î {
    static BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
    static long a,b,c;
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String[] nums = br.readLine().split(" ");
            a=Long.parseLong(nums[0]);
            b=Long.parseLong(nums[1]);
            c=Long.parseLong(nums[2]);
            System.out.println(ksm(a,b,c));
        }
        br.close();
    }
    public static long ksm(long a,long b,long c){
        long ans=1;
        while(b>0){
            if(b%2==1) ans=ans*a%c;
            a=a*a%c;
            b=b/2;
        }
        return ans;
    }
}
