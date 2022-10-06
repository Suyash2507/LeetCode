// https://leetcode.com/problems/k-radius-subarray-averages

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs, -1);
        int curr = 0;
        if(k==0)    return nums;
        if(k>nums.length)   return avgs;
        for(int i = 0;i<(2*k);i++){
            curr += nums[i] ;    
        }
        int j = 2*k;
        while(j<nums.length){
            curr = curr + nums[j];
            //System.out.println(curr);
            avgs[j-k] = curr/((2*k)+1);
            curr = curr - nums[j-((2*k))];
            j++;
        }
        return avgs;
    }
}