// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i]<nums[j]){
                return nums[i];
            }
            int mid=(i+j)/2;
            if(nums[mid]>=nums[i]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return nums[i];
    }
}