// https://leetcode.com/problems/find-all-duplicates-in-an-array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> sol=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                sol.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return sol;
    }
}