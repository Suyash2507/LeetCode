// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k

class Solution {
    public int countKDifference(int[] nums, int k) {
        int v=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i<j){
                    if((Math.abs(nums[i]-nums[j]))==k){
                        v++;
                    }
                }
            }
        }
        return v;
    }
}