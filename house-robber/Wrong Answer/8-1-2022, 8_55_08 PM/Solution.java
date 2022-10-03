// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==1)  return nums[0];
        dp[0] = nums[0];
        dp[1] = nums[1];
        int ans = Math.max(dp[0], dp[1]);
        for(int i=2;i<nums.length;++i){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
            ans = Math.max(dp[i], ans);
        }
        return ans;
    }
}