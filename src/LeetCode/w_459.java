package LeetCode;

public class w_459 {
}
//  题解
//class Solution {
//    public boolean repeatedSubstringPattern(String s) {
//        int n = s.length();
//        if(n<=1) return false;
//        Set<String> set = new HashSet<>();
//
//        for(int i=1;i<n;i++){
//            if(n%i!=0) continue;
//            set.clear();
//
//            for(int j=0;j<=n-i;j+=i){  //n=12,i=3,
//                set.add(s.substring(j,j+i));
//            }
//            if(set.size()==1) return true;
//        }
//
//        return false;
//    }
//}