// https://leetcode.com/problems/jump-game-vi

class Solution {
    public int maxResult(int[] nums, int k) {
        int n= nums.length;
        int[] dp= new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            dp[i] = Integer.MIN_VALUE;
            int q = (i-k)>=0 ? (i-k) : 0; 
            for(int j=i-1;j>=q;--j){
                if(nums[j]>=0){ dp[i] = dp[j];  break;  }
                dp[i] = Math.max(dp[j],dp[i]);
            } 
            dp[i] += nums[i];
        }
        //for(int q=0;q<n;q++)    System.out.println(dp[q]);
        return dp[n-1];
    }
}