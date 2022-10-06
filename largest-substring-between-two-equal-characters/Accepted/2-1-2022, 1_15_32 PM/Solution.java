// https://leetcode.com/problems/largest-substring-between-two-equal-characters

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int v=0;
        ArrayList<Character> ll =new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j){
                    if(s.charAt(i)==s.charAt(j)){
                        ll.add(s.charAt(i));
                        int q= Math.abs((j-i))-1;
                        if(q>v){
                            v=q;
                        }
                    }
                }
            }
        }
        if(ll.size()==0){
            return -1;
        }
        return v;
    }
}