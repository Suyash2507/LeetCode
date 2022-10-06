// https://leetcode.com/problems/largest-3-same-digit-number-in-string

class Solution {
    public String largestGoodInteger(String num) {
        String sol="";
        int q= -99999;
        for(int i=0;i<num.length()-3;i++){
            String k=num.substring(i,i+3);
            if(k.charAt(0)==k.charAt(1) && k.charAt(1)==k.charAt(2) && Integer.parseInt(String.valueOf(k.charAt(0)))>q){
                q=Integer.parseInt(String.valueOf(k.charAt(0)));
                sol= k;
            }
        }
        return sol;
    }
}