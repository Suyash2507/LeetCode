// https://leetcode.com/problems/count-vowels-permutation

class Solution {
    public int countVowelPermutation(int n) {
        int mod = 1000_000_007;
        long ans = 0;
        if(n==1)    return 5;
        //int[] help = new int[5]{1,2,3,2,1};
        int[][] dp = new int[n+1][5];
        //Arrays.fill(dp[0],0);
        Arrays.fill(dp[1],1);
        for(int i=2;i<=n;++i){
            dp[i][0] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][4])%mod;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2])%mod;
            dp[i][2] = (dp[i-1][1] + dp[i-1][3])%mod;
            dp[i][3] = (dp[i-1][2])%mod;
            dp[i][4] = (dp[i-1][2] + dp[i-1][3])%mod; 
        }
        for(int k=0;k<5;++k){
            ans += dp[n][k];
            ans = ans % mod;
        }
        return (int)ans;
    }
}