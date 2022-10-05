// https://leetcode.com/problems/jump-game

class Solution {
    public boolean canJump(int[] nums) {
        boolean res=false;int k=0;
        while(true){
            if(k==(nums.length-1)){
                res=true;
                break;
            }
            int j=k;
            k=k+nums[k];
            if(k>=nums.length){
                k=k-nums.length;
            }
            if(j==k){
                break;
            }
        }
        return res;
    }
}