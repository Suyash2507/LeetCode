// https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k

class Solution {
    public int longestSubsequence(String s, int k) {
        int one=0,zero=0;
        double val = 0;
        for(int i=s.length()-1;i>=0;--i){
            if(s.charAt(i)=='0')    zero++;
            else{
                val += Math.pow(2, s.length()-i-1);
                if(val<=k)  one++;
            }
        }
        return zero+one;
    }
}