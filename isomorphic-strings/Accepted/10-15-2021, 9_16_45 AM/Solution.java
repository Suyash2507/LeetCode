// https://leetcode.com/problems/isomorphic-strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<Character> ll=new ArrayList<Character>(); char x='a';
        HashMap<String, Character> hm =new HashMap<String,Character>();
        if(s.length()!=t.length())
            return false;
        String s1="",s2="";
        for(int i=0;i<s.length();i++){
            if(!ll.contains(s.charAt(i))){
                ll.add(s.charAt(i));
                hm.put(String.valueOf(s.charAt(i)),x);
                s1=s1.concat(String.valueOf(x));
                x++;
                
            }
            else{
                char k= hm.get(String.valueOf(s.charAt(i)));
                s1=s1.concat(String.valueOf(k));
            }
        }
        hm.clear();
        ll.clear();x='a';
        for(int j=0;j<t.length();j++){
            if(!ll.contains(t.charAt(j))){
                ll.add(t.charAt(j));
                hm.put(String.valueOf(t.charAt(j)),x);
                s2=s2.concat(String.valueOf(x));
                x++;
                
            }
            else{
                char k2= hm.get(String.valueOf(t.charAt(j)));
                s2=s2.concat(String.valueOf(k2));
            }
        }
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
}