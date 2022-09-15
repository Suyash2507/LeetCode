// https://leetcode.com/problems/count-numbers-with-unique-digits

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] d=new int[9];
        if(n==0)    return 1;
        int sol = 0;
        d[0] = 0;
        d[1] = 10;
        d[2] = 81;
        for(int i=3;i<9;i++){
            d[i] = 9;
            int t= 9,j=i;
            while(--j>0){
                d[i] = d[i] * (t--);
            }
        }
        for(int j=0;j<=n;j++)    sol=sol+d[j];
        return sol;
    }
}