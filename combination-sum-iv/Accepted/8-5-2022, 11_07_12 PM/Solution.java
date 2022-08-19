// https://leetcode.com/problems/combination-sum-iv

class Solution {
    int findcomb(int[] nums, int target, int[] dp){
        if(dp[target]!=-1)   return dp[target];
        int ans = 0;
        for(int i=0;i<nums.length;++i){
            if(target>=nums[i])  ans += findcomb(nums, target - nums[i], dp);
        }
        dp[target] = ans;
        return ans;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return findcomb(nums, target, dp);
    }
}
