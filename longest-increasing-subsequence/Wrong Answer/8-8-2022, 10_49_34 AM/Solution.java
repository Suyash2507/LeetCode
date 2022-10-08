// https://leetcode.com/problems/longest-increasing-subsequence

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp =new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)    continue;
                if(nums[i-1]<nums[j-1])    dp[i][j] = 1 + dp[i-1][j-1];
                else    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }  
        return dp[n][n];
    }
}