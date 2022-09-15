// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements

class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : nums)   al.add(x);
        return al.size()>2 ? al.size()-2 : 0;
    }
}