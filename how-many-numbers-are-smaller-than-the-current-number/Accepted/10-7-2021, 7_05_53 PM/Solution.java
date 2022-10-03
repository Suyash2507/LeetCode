// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sol=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=0;
            for(int k=0;k<nums.length;k++){
                if(i!=k){
                    if(nums[k]<nums[i]){
                        n++;
                    }
                }
            }
            sol[i]=n;
        }
        return sol;
    }
}