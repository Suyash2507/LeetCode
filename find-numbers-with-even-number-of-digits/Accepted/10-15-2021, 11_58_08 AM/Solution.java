// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
        int v=0;
        for(int i=0;i<nums.length;i++){
            int t=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                t++;
            }
            if(t%2==0){
                v++;
            }
        }
        return v;
    }
}