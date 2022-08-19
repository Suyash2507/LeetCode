// https://leetcode.com/problems/arranging-coins

class Solution {
    public int arrangeCoins(int n) {
        int k=0,q=1;
        while(n>=0){
            n= n-q;
            q++;
            k=k+1;
        }
        if(n==0)
            return k;
        else
            return k-1;
            
    }
}