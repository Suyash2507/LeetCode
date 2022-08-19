// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[49];
        Arrays.fill(dp,-1);
        int a=0;
        return solve(n,dp,a);
    }
    public int solve(int n,int[] dp,int a){
        dp[1]=1;
        dp[2]=2;
        if(n==0)
            return 0;
        if(dp[n]!=-1)
            return a=a+dp[n];
        dp[n]=solve(n-1,dp,a) + solve(n-2,dp,a);
        return a=a+dp[n];
    }
}