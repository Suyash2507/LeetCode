// https://leetcode.com/problems/concatenation-of-array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] sol=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            sol[i]=nums[i];
            sol[i+nums.length]=nums[i];
        }
        return sol;
    }
}