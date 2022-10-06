// https://leetcode.com/problems/kth-smallest-number-in-multiplication-table

class Solution {
    public int findKthNumber(int m, int n, int k) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= (i+1)*(j+1);
                al.add(dp[i][j]);
            }
        }
        Collections.sort(al);
        return (int)al.get(k-1);
    }
}