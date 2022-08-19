// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0,j=0;
        String sol="",sol2="";
        while(i<word1.length)
        {
            sol=sol.concat(String.valueOf(word1[i]));
            i++;
        }
        while(j<word2.length)
        {
            sol2=sol2.concat(String.valueOf(word2[j]));
            j++;
        }
        if(sol.equals(sol2))
            return true;
        else
            return false;
    }
}