// https://leetcode.com/problems/count-the-number-of-consistent-strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hh=new HashSet<Character>();
        int w=0;
        for(int i=0;i<allowed.length();i++){
            hh.add(allowed.charAt(i));
        }
        for(int j=0;j<words.length;j++){
            boolean f=true;
            for(int k=0;k<words[j].length();k++){
                if(!hh.contains(words[j].charAt(k))){
                    f=false;
                    break;
                }
            }
            if(f){
                w++;
            }
        }
        return w;
    }
}