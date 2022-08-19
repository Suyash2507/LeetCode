// https://leetcode.com/problems/calculate-money-in-leetcode-bank

class Solution {
    public int totalMoney(int n) {
        int z=1;int k=n/7;
        int sum=0;
        while(k-->0){
            sum=sum+z+z+1+z+2+z+3+z+4+z+5+z+6;
            z++;
        }
        int w=(n%7);
        while(w-->0){
            sum=sum+ z++;
        }
        return sum;
    }
}