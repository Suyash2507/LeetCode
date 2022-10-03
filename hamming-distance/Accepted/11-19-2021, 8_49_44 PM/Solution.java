// https://leetcode.com/problems/hamming-distance

class Solution {
    public int hammingDistance(int x, int y) {
        String k = Integer.toBinaryString((x^y));
        int v=0;
        for(int i=0;i<k.length();i++){
            if(k.charAt(i)=='1'){
                v++;
            }
        }
        return v;
    }
}