// https://leetcode.com/problems/jump-game-ii

class Solution {
    public int jump(int[] nums) {
        int max=nums.length,z=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(max>0) {
                max = Math.min(nums[i],max-nums[i]);
                z=z+1;
            }
        }
        return z;
    }
}