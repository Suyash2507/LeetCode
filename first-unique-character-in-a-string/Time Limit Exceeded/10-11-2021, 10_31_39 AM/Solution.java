// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        int ind=-1;
        ArrayList<Character> ll=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            int occ=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)){
                    occ++;
                }
            }
            if(occ>1)
                ll.add(s.charAt(i));
        }
        for(int k=0;k<s.length();k++){
            if(!ll.contains(s.charAt(k))){
                ind=k;
                break;
            }
        }
        return ind;
    }
}