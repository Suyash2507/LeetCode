// https://leetcode.com/problems/is-subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp =new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)    continue;
                if(s.charAt(i-1)==t.charAt(j-1))    dp[i][j] = 1+ dp[i-1][j-1];
                else    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return m<n ? dp[m][n] == m : dp[m][n] == n;
        /*if(s.length()==t.length())
            return s.equals(t);
        if(s.equals(""))
            return true;
        if(t.equals("")){
            return false;
        }
        String min = (s.length()< t.length())? s:t;
        String max = (s.length()>=t.length())? s:t;
        int z=0;
        for(int i=0;i<min.length();i++){
            boolean f=false;
            System.out.println(z);
            for(int j=z;j<max.length();j++){
                if(min.charAt(i)==max.charAt(j)){
                    f=true;
                    z=j;
                    break;
                }
            }
            if(!f){
                return false;
            }
        }
        return true;
        */
    }
}