// https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number

class Solution {
    public long[] sumOfThree(long num) {
        long val = num/3;
        if(3*val == num)    return new long[]{val-1,val,val+1};
        else    return new long[]{};
    }
}