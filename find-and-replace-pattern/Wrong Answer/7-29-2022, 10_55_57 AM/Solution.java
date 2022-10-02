// https://leetcode.com/problems/find-and-replace-pattern

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> sol = new ArrayList();
        for(int i=0;i<words.length;++i){
            String t = "";
            char curr = 'a';
            Map<Character,Character> hm = new HashMap();
            for(int j=0;j<words[i].length();++j){
                if(hm.containsKey(words[i].charAt(j)))  
                    t=t+String.valueOf(hm.get(words[i].charAt(j)));
                else{
                    hm.put(words[i].charAt(j),curr);
                    t=t+String.valueOf(curr);
                    ++curr;
                }
            }
            if(t.equals(pattern))   sol.add(words[i]);
        }
        return sol;
    }
}