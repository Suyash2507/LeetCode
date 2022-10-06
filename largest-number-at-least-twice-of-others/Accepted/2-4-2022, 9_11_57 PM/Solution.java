// https://leetcode.com/problems/largest-number-at-least-twice-of-others

class Solution {
    public int dominantIndex(int[] nums) {
        int[] b= nums.clone();
        Arrays.sort(b);int z=0;
        boolean nf=false;
        for(int i=0;i<nums.length;i++){
            if(b[b.length-1]<(2*nums[i]))   z++;
        }
        if(z>1)     return -1;
        else{
            for(int j=0;j<nums.length;j++){
                if(nums[j]==b[b.length-1])
                    return j;
            }
        }
        return 0;
    }
}