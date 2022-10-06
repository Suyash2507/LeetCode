// https://leetcode.com/problems/k-radius-subarray-averages

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] avgs = new int[nums.length];
        int curr = 0;
        if(k==0)    return nums;
        for(int i = 0;i<nums.length-k;i++){
            curr += nums[i] ;    
        }
        Arrays.fill(avgs, -1);
        int sum = curr;
        for(int j = k;j<nums.length-k;j++){
            if(j-k>0)   sum = sum - nums[j-k-1];
            sum = sum + nums[j+k];
            avgs[j] = sum / ((2*k)+1); 
        }
        return avgs;
    }
}