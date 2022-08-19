// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        int c = Integer.parseInt(a,2);
        int d = Integer.parseInt(b,2);
        int k=c+d;
        String sol = Integer.toBinaryString(k);
        return sol;
    }
}