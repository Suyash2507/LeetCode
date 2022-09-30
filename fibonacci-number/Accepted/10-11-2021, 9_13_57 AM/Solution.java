// https://leetcode.com/problems/fibonacci-number

class Solution {
    public int fib(int n) {
        int[] dp=new int[31];
        Arrays.fill(dp,-1);
        return fibon(n,dp);
    }
    public int fibon(int n, int[] dp){
        if(n==0 || n==1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n] = (fibon(n-1, dp) + fibon(n-2,dp));
    }
}