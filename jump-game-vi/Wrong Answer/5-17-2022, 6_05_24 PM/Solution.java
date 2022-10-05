// https://leetcode.com/problems/jump-game-vi

class Solution {
    public int maxResult(int[] nums, int k) {
        int n= nums.length;
        int[] dp= new int[nums.length];
        if(n==1)    return 0;
        dp[0]=nums[n-1];
        dp[1]=nums[n-2] + dp[0];
        for(int i=2;i<n;i++){
            int z = -999999;
            for(int j=n-i;j<n-i+k;j++){
                if(j<nums.length){
                    z = Math.max(z, dp[n-1-j]);
                }
            }
            dp[i] = nums[n-i-1] + z; 
        }
        //for(int q=0;q<n;q++)    System.out.println(dp[q]);
        return dp[n-1];
    }
}