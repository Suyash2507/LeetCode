// https://leetcode.com/problems/divide-array-into-equal-pairs

class Solution {
    public boolean divideArray(int[] nums) {
        ArrayList<Integer> al=new ArrayList<Integer>();int v=0;
        for(int i=0;i<nums.length;i++){
            if(!al.contains(nums[i]))   al.add(nums[i]);
            else{
                al.remove(new Integer(nums[i]));
                v++;
            }
        }
        return (v==(nums.length/2) && al.size()==0);
    }
}