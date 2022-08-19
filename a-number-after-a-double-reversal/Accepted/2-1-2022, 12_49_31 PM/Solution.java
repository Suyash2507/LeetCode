// https://leetcode.com/problems/a-number-after-a-double-reversal

class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb=new StringBuilder(String.valueOf(num));
        sb.reverse();
        int b= Integer.parseInt(sb.toString());
        sb=new StringBuilder(String.valueOf(b));
        return num==Integer.parseInt(sb.reverse().toString());
    }
}