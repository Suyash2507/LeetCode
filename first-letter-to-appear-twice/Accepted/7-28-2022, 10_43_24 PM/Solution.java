// https://leetcode.com/problems/first-letter-to-appear-twice

class Solution {
    public char repeatedCharacter(String s) {
        List<Character> h = new ArrayList();
        for(int i=0;i<s.length();++i){
            if(h.contains(s.charAt(i)))     return s.charAt(i);
            h.add(s.charAt(i));
        }
        return 'a';
    }
}