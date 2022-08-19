// https://leetcode.com/problems/bitwise-and-of-numbers-range

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0 && right==0)
            return 0;
        if(left>right)
            return 0;
        if(left==right)
            return left;
        if(left==Integer.MAX_VALUE || right==Integer.MAX_VALUE)
            return 0;
        int k=left;
        for(int i=left;i<=right;i++){
            k= (k&i);
        }
        return k;
    }
}