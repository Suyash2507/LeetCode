// https://leetcode.com/problems/contiguous-array

class Solution {
    public int findMaxLength(int[] nums) {
        int max=0;
        int o=0,z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  o++;
            if(nums[i]==1)  z++;
            if(o==z){
                if((o*2)>max){
                    max=o*2;
                }
            }
        }
        return max;
    }
}