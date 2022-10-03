// https://leetcode.com/problems/grid-game

class Solution {
    public long gridGame(int[][] grid) {
        long[][] dp = new long[3][1 + grid[0].length];
        long[][] dp2 = new long[3][1 + grid[0].length];
        long[][] replica = new long[3][1 + grid[0].length];
        for(int i=1;i<=2;++i){
            for(int j=1;j<=grid[0].length;++j){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + grid[i-1][j-1];
            }
        }
        int a = 2, b = grid[0].length;
        replica[1][1] = Integer.MIN_VALUE;
        while(a!=1 || b!=1){
            replica[a][b] = Integer.MIN_VALUE;
            if(dp[a-1][b] > dp[a][b-1]){
                a -= 1;
            }
            else b -= 1;
        }
        for(int m=1;m<=2;++m){
            for(int n=1;n<=grid[0].length;++n){
                if(replica[m][n] != Integer.MIN_VALUE){
                    dp2[m][n] = Math.max(replica[m-1][n], dp2[m][n-1]) + grid[m-1][n-1];
                }
                //System.out.print(dp2[m][n]+"  ");
            }
            //System.out.println();
        }
        return Math.max(dp2[1][grid[0].length], dp2[2][grid[0].length-1]);
    }
}