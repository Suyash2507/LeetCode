// https://leetcode.com/problems/find-the-middle-index-in-array

class Solution {
    public int findMiddleIndex(int[] nums) {
        int index=-1,s=0;
        if(nums.length==1)
            return 0;
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                s=s+ nums[i-1];
            int r=0;
            if(i!=nums.length-1){
                for(int j=i+1;j<nums.length;j++){
                    r=r+ nums[j];
                }
            }
            if(s==r){
                index= i;
                break;
            }
        }
        return index;
        
    }
}