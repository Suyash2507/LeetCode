// https://leetcode.com/problems/longest-consecutive-sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int x : nums)   hs.add(x);
        int ans = 1;
        for(int val : hs){
            if(!hs.contains(val-1)){
                int i=val,temp=1;
                while(hs.contains(val+1)){
                    ++val;
                    ++temp;
                }
                ans = Math.max(ans,temp);
            }
        }
        return nums.length==0 ? 0 : ans; 
    }
}