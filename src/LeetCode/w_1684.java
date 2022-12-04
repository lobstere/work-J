package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class w_1684 {
    //题解
//    public int countConsistentStrings(String allowed, String[] words) {
//        Set<Character> set = new HashSet<>();
//        int[] arr =new int[26];
//        for(int i=0; i<allowed.length(); i++){
//            arr[allowed.charAt(i)-'a']++;
//        }
//        int ans =0 ;
//        for(String w: words){
//            ans++;
//            for(int i=0; i<w.length(); i++){
//                if(arr[w.charAt(i)-'a']==0){
//                    ans--;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        System.out.print("allowed =");
        String ald = sc.nextLine();
        System.out.print("works =");
        String[] works = sc.nextLine().split(" ");
//        System.out.println(Arrays.toString(works));
        for(String s: works){
            if(ald.equals(s)){
                i++;
            }
            System.out.println(s);
        }
        System.out.println(i);
    }
}
