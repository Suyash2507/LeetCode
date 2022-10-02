// https://leetcode.com/problems/find-and-replace-pattern

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> sol = new ArrayList();
        Map<Character,Character> pat = new HashMap();
        char cc = 'a';
        String temp2 = "";
        for(int k=0;k<pattern.length();++k){
            if(pat.containsKey(pattern.charAt(k)))  
                temp2=temp2+String.valueOf(pat.get(pattern.charAt(k)));
            else{
                    pat.put(pattern.charAt(k),cc);
                    temp2=temp2+String.valueOf(cc);
                    ++cc;
                }
        }
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
            if(t.equals(temp2))   sol.add(words[i]);
        }
        return sol;
    }
}