// https://leetcode.com/problems/contains-duplicate-ii

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
        /*if(nums.length==1)  return false;
        int i = 0, j = 1;
        while(j<nums.length && i<nums.length-1){
            if(nums[i]!=nums[j])    j++;
            else{
                //System.out.println(Math.abs(i-j));
                if(Math.abs(i-j)<=k){       return true;}
                else{i++;   j=i+1;}
            }
            if(j==nums.length-1 && nums[i]!=nums[j] && Math.abs(i-j)>k){
                i+=1;
                j=i+1;
            }
        }
        return false;
        */
    }
}