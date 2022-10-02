// https://leetcode.com/problems/find-peak-element

class Solution {
    int ele=0;
    public int findPeakElement(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int m1= (i+j)/2;
            int m2= m1+1;
            if(nums[m1]<nums[m2])
            {
                i= m2;
            }
            else
            {
                j=m1;
            }
        }
        return i;
    }
}