// https://leetcode.com/problems/coin-change

class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        dp[0]=0;
        for(int i =1;i<=amount;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    min = Math.min(min, 1 + dp[i-coins[j]]);
                }
                
            }
            dp[i] = min;
        }
        if(dp[amount]<0 || dp[amount]==Integer.MAX_VALUE)    return -1;
        return dp[amount];
    }
}