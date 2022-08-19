// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value

class Solution {
    public boolean digitCount(String num) {
        int[] temp = new int[10];
        for(int i=0;i<num.length();++i) temp[num.charAt(i)-48]++;
        for(int j=0;j<num.length();++j){
            if(temp[j]!=Integer.valueOf(num.charAt(j))-48) return false;
        }
        return true;
    }
}