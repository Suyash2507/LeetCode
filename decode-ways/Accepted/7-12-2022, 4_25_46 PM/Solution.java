// https://leetcode.com/problems/decode-ways

class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[1+s.length()];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0' ? 0 : 1;
        for(int i=2;i<=s.length();++i){
            int ones = Integer.valueOf(s.substring(i-1,i));
            int twos = Integer.valueOf(s.substring(i-2,i));
            if(ones>=1)     dp[i] += dp[i-1];
            if(twos>=10 && twos<=26)    dp[i] += dp[i-2];
        }
        return dp[s.length()];
    }
}