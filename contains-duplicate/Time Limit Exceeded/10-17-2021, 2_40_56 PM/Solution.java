// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!ll.contains(nums[i])){
                ll.add(nums[i]);
            }else{
                return true;
            }
        }
        return ll.size()!=nums.length;
    }
}