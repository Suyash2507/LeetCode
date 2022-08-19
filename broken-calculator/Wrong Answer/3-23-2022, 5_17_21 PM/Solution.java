// https://leetcode.com/problems/broken-calculator

class Solution {
    public int brokenCalc(int s, int t) {
        int v=0;
        while(s<=t){
            s=s*2;
            v++;
        }
        v=v+(s-t);
        return v;
    }
}