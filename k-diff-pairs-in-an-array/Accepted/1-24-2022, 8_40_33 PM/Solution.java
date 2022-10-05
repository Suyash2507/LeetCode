// https://leetcode.com/problems/k-diff-pairs-in-an-array

class Solution {
    public int findPairs(int[] nums, int k) {
        
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> found = new HashSet<>();
        for (int n : nums) {
            if (numbers.contains(n + k)) found.add(n);
            if (numbers.contains(n - k)) found.add(n - k);
            numbers.add(n);
        }
        return found.size();
    }
}