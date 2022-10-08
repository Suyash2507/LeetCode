// https://leetcode.com/problems/longest-continuous-increasing-subsequence

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int vmax=0;
        if(nums.length==1)
            return 1;
        int t=nums[0];
        int v=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                v++;
            }
            else{
                if(v>vmax){
                    vmax=v;
                }
                v=0;
            }
        }
        if(v>vmax)
            vmax=v;
        return vmax;
    }
}