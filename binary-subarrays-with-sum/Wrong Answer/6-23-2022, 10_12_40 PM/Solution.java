// https://leetcode.com/problems/binary-subarrays-with-sum

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0,sum = 0;
        int i = 0, j =0 ;
        while(j!=nums.length){
            sum += nums[j];
            if(sum < goal){
                j++;
                continue;
            }
            else if(sum==goal){
                ++ans;
                //System.out.println(i+"  "+j);
            }
            else{
                while(sum>goal && i<nums.length){
                    sum = sum - nums[i];
                    i++;
                }
            }
            j++;
        }
        if(j==nums.length){
            while(i<nums.length){
                if(sum==goal)   ++ans;
                sum = sum - nums[i];
                i++;
            }
        }
        return ans;
    }
}