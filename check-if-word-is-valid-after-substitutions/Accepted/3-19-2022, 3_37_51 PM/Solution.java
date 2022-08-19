// https://leetcode.com/problems/check-if-word-is-valid-after-substitutions

class Solution {
    public boolean isValid(String s) {
        while(s.contains("abc")){
            s=s.replace("abc","");
        }
        return s.length()==0;
    }
}