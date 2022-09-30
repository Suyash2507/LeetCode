// https://leetcode.com/problems/determine-if-string-halves-are-alike

class Solution {
    public boolean halvesAreAlike(String s) {
        int v1=0,v2=0;
        ArrayList<Character> l= new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String a= s.substring(0, (s.length()/2));
        String b= s.substring((s.length()/2), s.length());
        for(int i=0;i<a.length();i++){
            if(l.contains(a.charAt(i))){     v1++;   }
            if(l.contains(b.charAt(i))){     v2++;   }
        }
        if(v1==v2)
            return true;
        else
            return false;
    }
}