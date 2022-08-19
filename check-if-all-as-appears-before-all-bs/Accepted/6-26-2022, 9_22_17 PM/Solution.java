// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs

class Solution {
    public boolean checkString(String s) {
        return s.length()==s.replaceAll("ba","").length();
    }
}