// https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
        String sol="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                sol=sol.concat(String.valueOf(s.charAt(i)));
            }
            else{
                if(!sol.equals("")){
                    break;
                }
            }
        }
        return sol.length();
    }
}