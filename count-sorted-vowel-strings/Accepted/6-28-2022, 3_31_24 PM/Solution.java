// https://leetcode.com/problems/count-sorted-vowel-strings

class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n+1][6];
        for(int i=1;i<=n;++i){
            for(int j=1;j<6;++j){
                dp[i][j] = dp[i][j-1];
                if(i>1){
                    dp[i][j] += dp[i-1][j];
                }
                else    dp[i][j] += 1;
            }
        }
        return dp[n][5];
        
        /*
        int a=1,e=1,i=1,o=1,u=1;
        while(n-- > 1){
        a=a+e+i+o+u;
        e=e+i+o+u;
        i=i+o+u;
        o=o+u;
        u=u;
        }
        */
    }
}