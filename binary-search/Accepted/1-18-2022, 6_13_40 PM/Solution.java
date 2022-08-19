// https://leetcode.com/problems/binary-search

class Solution {
    public int search(int[] nums, int target) {
        int i=0, j=nums.length;
        while(i<j){
            int p= (i+j)/2;
            if(nums[p]>target){
                j--;
            }
            else if(nums[p]<target){
                i++;
            }
            else{
                return p;
            }
        }
        return -1;
    }
}