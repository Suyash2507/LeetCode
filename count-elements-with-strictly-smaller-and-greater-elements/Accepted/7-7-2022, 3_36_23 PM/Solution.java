// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements

class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i]>min && nums[i]<max) ++ans;
        }
        return ans;
    }
}