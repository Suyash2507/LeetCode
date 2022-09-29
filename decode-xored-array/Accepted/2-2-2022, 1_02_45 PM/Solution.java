// https://leetcode.com/problems/decode-xored-array

class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] sol=new int[encoded.length+1];
        sol[0]=first;
        for(int i=0;i<sol.length-1;i++){
            sol[i+1] = encoded[i] ^ sol[i];
        }
        return sol;
    }
}