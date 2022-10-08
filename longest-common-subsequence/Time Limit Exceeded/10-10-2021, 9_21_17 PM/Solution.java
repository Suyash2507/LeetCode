// https://leetcode.com/problems/longest-common-subsequence

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] X= text1.toCharArray();
        char[] Y= text2.toCharArray();
        int k=findlcs(X,Y, text1.length(),text2.length());
        return k;
    }
    int findlcs(char[] X, char[] Y, int m,int n){
        if(m==0 || n==0)
            return 0;
        if(X[m-1]==Y[n-1])
            return 1 + findlcs(X,Y, m-1,n-1);
        else
            return Math.max(findlcs(X,Y,m-1,n), findlcs(X,Y,m,n-1));
    }
}