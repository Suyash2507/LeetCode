// https://leetcode.com/problems/find-greatest-common-divisor-of-array

class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int x : nums){
            if(x<min)   min = x;
            if(x>max)   max = x;
        }
        return gcd(max,min);
    }
    int gcd(int x,int y){
        if(y==0)    return x;
        return gcd(y,x%y);
    }
}