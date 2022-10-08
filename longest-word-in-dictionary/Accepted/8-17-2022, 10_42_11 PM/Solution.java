// https://leetcode.com/problems/longest-word-in-dictionary

class Solution {
    public String longestWord(String[] words) {
        String ans = "";
        HashSet<String> s = new HashSet();
        for(String x : words)   s.add(x);
        Arrays.sort(words, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        for(String y : words){
            if(y.length()>ans.length() || (y.length()==ans.length() && y.compareTo(ans) < 0)){
                boolean check =true;
                for(int i=1;i<y.length();++i){
                    if(!s.contains(y.substring(0,i))){
                        check =false;
                        break;
                    }
                    /*if(sub(y.substring(0,i), s)){
                        ans = y;
                    }*/
                }
                if(check)   ans = y;
            }
        }
        return ans;
    }
    /*boolean sub(String s, HashSet<String> hs){
        if(s.length()==0)   return true;
        if(!hs.contains(s)) return false;
        return sub(s.substring(0,s.length()-1), hs);
    }*/
}