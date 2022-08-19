// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        char x='a';
        for(int i=0;i<26;i++){
            int a=0,b=0;
            for(int j=0;j<word1.length();j++){
                if(word1.charAt(j)==x){
                    a++;
                }
            }
            for(int k=0;k<word2.length();k++){
                if(word2.charAt(k)==x){
                    b++;
                }
            }
            if(Math.abs(a-b)>3)
                return false;
            x++;
        }
        return true;
    }
}