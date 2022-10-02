// https://leetcode.com/problems/find-smallest-letter-greater-than-target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char sol = '=';
        for(char x : letters){
            if(x>target)    sol =  (sol=='=') ? x : ((x>sol) ? sol : x);
        }
        return sol;
    }
}