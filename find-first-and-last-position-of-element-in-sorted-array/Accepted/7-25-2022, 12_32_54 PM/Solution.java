// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1,l=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                f=i;
                l=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(target==nums[j]){
                if(j!=l)
                    l=j;
                break;
            }
        }
        int[] sol= new int[2];
        sol[0]=f;
        sol[1]=l;
        return sol;
    }
}